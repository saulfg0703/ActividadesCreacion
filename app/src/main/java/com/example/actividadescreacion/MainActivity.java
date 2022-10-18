package com.example.actividadescreacion;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.actividadescreacion.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void aSumar(View vista){
        EditText cuadro1 = (EditText)findViewById(R.id.num1);
        EditText cuadro2 = (EditText)findViewById(R.id.num2);

        int numero1 = Integer.parseInt(cuadro1.getText().toString());
        int numero2 = Integer.parseInt(cuadro2.getText().toString());
        Intent i = new Intent(this,Sumar.class);
        i.putExtra("numero1",numero1);
        i.putExtra("numero2",numero2);
        startActivity(i);



    }
}