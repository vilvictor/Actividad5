package com.example.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MostrarDatos extends AppCompatActivity {
    // Declaración de variables

    TextView tvnombre, tvapellidos, tvcorreo, tvtelefono;
    Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_datos);
// Asociamos  los atributos a los que está en el lanyout2 (MostrarDatos)

        tvnombre = (TextView)findViewById(R.id.tvNombre);
        tvapellidos = (TextView)findViewById(R.id.tvApellidos);
        tvcorreo = (TextView)findViewById(R.id.tvCorreo);
        tvtelefono = (TextView)findViewById(R.id.tvTelefono);
        btnOk = (Button)findViewById(R.id.btnOk);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MostrarDatos.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //Creamos un método para traer y mostar los datos en el activity 2 (MostarDatos)
        mostrarDato();
    }
    private void mostrarDato() {
        Bundle datos=this.getIntent().getExtras();
        String nombre=datos.getString("name");
        String ape=datos.getString("ape");
        String email=datos.getString("email");
        String tele=datos.getString("tele");

        tvnombre.setText(nombre);
        tvapellidos.setText(ape);
        tvcorreo.setText(email);
        tvtelefono.setText(tele);
    }
}