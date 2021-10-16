package com.example.gestionsolaireyann;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;


public class MenuActivity extends AppCompatActivity {

    private Button exitbt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        exitbt = (exitbt) findViewById (R.Id.exitbt);
        exitbt.setOnClickListener(new View . OnClickListener (){
            @Override
            public void onClick(View v) {
                moveTaskToBack(nonRoot: True);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });

    }
}