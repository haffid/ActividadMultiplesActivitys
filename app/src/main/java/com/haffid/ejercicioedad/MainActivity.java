package com.haffid.ejercicioedad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public EditText nombre, edad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = findViewById(R.id.txtNombre);
        edad = findViewById(R.id.txtEdad);
    }

    public void pulsar(View view) {
        String camponombre, campoedad;
        camponombre = nombre.getText().toString();
        campoedad = edad.getText().toString();
        if (!camponombre.isEmpty() && !campoedad.isEmpty()){
            int c1 = Integer.parseInt(campoedad);
            if (c1<18){
                Intent intent = new Intent(this, MA_Menor.class);
                startActivity(intent);
            }else{
                Intent intent = new Intent(this, MA_Mayor.class);
                startActivity(intent);
            }
        }else{
            Toast.makeText(this, "Campos Vacios", Toast.LENGTH_SHORT).show();
        }
        finish();
    }
}