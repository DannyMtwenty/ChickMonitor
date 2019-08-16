package com.example.dan.ChickMonitor;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Process;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.dan.ChickMonitor.R;

public class InitialCheck extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial_check);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Button internet= (Button) findViewById(R.id.internet);
        Button identify= (Button) findViewById(R.id.identify);
        if (getSupportActionBar()!=null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }
    public void identify(View view) {
        Intent intent = new Intent(InitialCheck.this,symptoms.class);
        startActivity(intent);
    }
    public void  diseaselist(View view) {
        Intent intent = new Intent(InitialCheck.this, diseaseref.class);
        startActivity(intent);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId()== android.R.id.home);
        finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(InitialCheck.this);

        builder.setMessage("Are you sure you want to Exit Application?");
        builder.setCancelable(true);
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                dialog.cancel();
            }
        });
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {

                moveTaskToBack(true);
                Process.killProcess(Process.myPid());
                System.exit(1);
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
