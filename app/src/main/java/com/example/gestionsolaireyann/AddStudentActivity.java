package com.example.gestionsolaireyann;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddStudentActivity extends AppCompatActivity {

    private EditText prenom;
    private EditText nom;
    private Button btnenregistrer;
    private String strprenom="";
    private String strnom="";

    public AddStudentActivity(){}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
        prenom=findViewById(R.id.txtprenom);
        nom=findViewById(R.id.txtnom);
        btnenregistrer=findViewById(R.id.btnenregistrer);

        btnenregistrer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strprenom=prenom.getText().toString();
                strnom=nom.getText().toString();
                if (strprenom.equals("")||strnom.equals("")){
                    Toast.makeText(AddStudentActivity.this, "Champs vide non autorisé",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}