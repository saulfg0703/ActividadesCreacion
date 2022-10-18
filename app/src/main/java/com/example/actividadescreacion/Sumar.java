package com.example.actividadescreacion;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Sumar extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado);

        Bundle datos = getIntent().getExtras();

        int numero1 = datos.getInt("numero1");
        int numero2 = datos.getInt("numero2");
        int resultado = numero1 + numero2;

        TextView valor_resultado = (TextView) findViewById(R.id.textoResultado);

        valor_resultado.setText("El resultado de la suma es: " + resultado);

    }
}
