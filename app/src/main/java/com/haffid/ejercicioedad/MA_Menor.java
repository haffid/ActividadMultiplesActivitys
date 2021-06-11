package com.haffid.ejercicioedad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MA_Menor extends AppCompatActivity {
    public TextView suma1, suma2;
    public EditText respuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma_menor);
        respuesta = findViewById(R.id.txtRespuesta);
        suma1 = findViewById(R.id.txtSuma1);
        suma2 = findViewById(R.id.txtSuma2);
        Random r = new Random();
        int r1 = r.nextInt(100);
        int r2 = r.nextInt(100);
        suma1.setText(String.valueOf(r1));
        suma2.setText(String.valueOf(r2));
    }
    private void calificar(){
        String camporespuesta, s1, s2;
        camporespuesta = respuesta.getText().toString();
        s1 = suma1.getText().toString();
        s2 = suma2.getText().toString();
        int cr = Integer.parseInt(camporespuesta);
        int c1 = Integer.parseInt(s1);
        int c2 = Integer.parseInt(s2);
        if ((c1+c2) == cr){
            Toast.makeText(this, "Es correcto ya no eres tan Bebé", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Incorreco, vuelve a intentarlo", Toast.LENGTH_SHORT).show();
        }
    }

    private void salir(){
        finish();
    }

    public void pulsar(View view) {
        switch (view.getId()) {
            case R.id.btnCalificar:
                this.calificar();
                break;
        }
        switch (view.getId()) {
            case R.id.btnSalir:
                this.salir();
                break;
        }
    }
}