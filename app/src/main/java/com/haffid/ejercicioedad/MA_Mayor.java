package com.haffid.ejercicioedad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MA_Mayor extends AppCompatActivity {

    public TextView multi1, multi2;
    public EditText respuestam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma_mayor);
        respuestam = findViewById(R.id.txtRespuestaM);
        multi1 = findViewById(R.id.txtMul1);
        multi2 = findViewById(R.id.txtMul2);
        Random r = new Random();
        int r1 = r.nextInt(100);
        int r2 = r.nextInt(100);
        multi1.setText(String.valueOf(r1));
        multi2.setText(String.valueOf(r2));
    }

    private void calificarM(){
        String camporespuesta, s1, s2;
        camporespuesta = respuestam.getText().toString();
        s1 = multi1.getText().toString();
        s2 = multi2.getText().toString();
        int cr = Integer.parseInt(camporespuesta);
        int c1 = Integer.parseInt(s1);
        int c2 = Integer.parseInt(s2);
        if ((c1*c2) == cr){
            Toast.makeText(this, "Excelente, eres todo un Adulto", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Incorreco, vuelve a intentarlo", Toast.LENGTH_SHORT).show();
        }
    }

    private void salir(){
        finish();
    }

    public void pulsar(View view) {
        switch (view.getId()) {
            case R.id.btnCalificarM:
                this.calificarM();
                break;
        }
        switch (view.getId()) {
            case R.id.btnSalirM:
                this.salir();
                break;
        }
    }
}