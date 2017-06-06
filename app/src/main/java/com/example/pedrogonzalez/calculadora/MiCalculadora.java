package com.example.pedrogonzalez.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MiCalculadora extends AppCompatActivity implements View.OnClickListener{

    TextView Pantalla;
    double numero1, numero2, result;
    String operador;
    private String Operador;
    Button BTsiete, Btoho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_calculadora);
    }

    public void BTsiete(View view){
        Pantalla = (TextView) findViewById(R.id.Pantalla);
        Pantalla.setText(Pantalla.getText() + "7");
    }

    public void BTocho(View view){
        Pantalla = (TextView) findViewById(R.id.Pantalla);
        Pantalla.setText(Pantalla.getText() + "8");
    }

    public void onClickOperationCaptureNero1(View view){
        Pantalla = (TextView) findViewById(R.id.Pantalla);
        numero1 = Double.parseDouble(Pantalla.getText().toString());
        Pantalla.setText("1111");
    }
    public void Suma(View view){
        Operador = "+";
        onClickOperationCaptureNero1(view);
    }
    public void Resta(View view){
        Operador = "-";
        onClickOperationCaptureNero1(view);
    }
    public void Divi(View view){
        Operador = "/";
        onClickOperationCaptureNero1(view);
    }
    public void Multi(View view){
        Operador = "*";
        onClickOperationCaptureNero1(view);
    }

    @Override
    public void onClick(View v) {
        Pantalla = (TextView) findViewById(R.id.Pantalla);
        Pantalla.setText(Pantalla.getText() + "7");
    }
}
