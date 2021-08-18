package com.example.semana1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Identificador
    private ImageView logo;
    private EditText username;
    private EditText password;
    private Button loginButton;
    private TextView textView1;
    private TextView textView2;
    private Button button2;

    //primer metodo que se ejecuta en una actividad, equivalente a set up
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //R es por resources


        //Referenciar
        logo = findViewById(R.id.logo);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        button2 = findViewById(R.id.button2);

    }
}