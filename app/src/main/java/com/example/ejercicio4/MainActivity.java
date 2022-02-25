package com.example.ejercicio4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button boton1;
    TextView tvTexto1, tvSalida;
    EditText cajita;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTexto1 = (TextView) findViewById(R.id.tv1);
        tvSalida = (TextView) findViewById(R.id.tv2);
        cajita = (EditText) findViewById(R.id.cajita1);
        boton1 = (Button) findViewById(R.id.boton1);
    }


    public void calcular(View view) {
        String salida;
        int result;
        tvSalida.setText("");
        String valor = cajita.getText().toString();
        int tabla = Integer.parseInt(valor);
        for (int i = 1; i <= 10; i++) {
            result = tabla * i;
            salida = tabla + " X " + i + " = " + result;
            tvSalida.append("\n" + salida);
        }

    }
}

