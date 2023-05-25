package com.example.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
// Menú 1
public class MainActivity extends AppCompatActivity {
    EditText nombre, apellidos , correo , telefono;
    Button aceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// Asociación de  los atributos dependiendo de lo que tenemos en el lanyout 1 (MainActivity)
        nombre = (EditText) findViewById(R.id.editNombre);
        apellidos = (EditText) findViewById(R.id.editApellidos);
        correo = (EditText) findViewById(R.id.editCorreo);
        telefono = (EditText) findViewById(R.id.editTelefono);
        aceptar = (Button) findViewById(R.id.btnAceptar);

        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, MostrarDatos.class); // Asociamos y Ocupamos un intent (i) para iniciar

                String name = nombre.getText().toString();
                String ape = apellidos.getText().toString();
                String email = correo.getText().toString();
                String tele = telefono.getText().toString();

                i.putExtra("name", name);
                i.putExtra("ape", ape);
                i.putExtra("email", email);
                i.putExtra("tele", tele);

                startActivity(i);
            }
        });
    }
}