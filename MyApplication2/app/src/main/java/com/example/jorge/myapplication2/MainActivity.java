package com.example.jorge.myapplication2;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


    // Variable for storing current date and time
    private int mYear, mMonth, mDay, mHour, mMinute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void irSiguientePantalla(View v){

        EditText edtName    = (EditText) findViewById(R.id.edtName);
        EditText edtTelefono    = (EditText) findViewById(R.id.edtTelefono);
        EditText edtCorreo    = (EditText) findViewById(R.id.edtCorreo);
        EditText edtDescripcion    = (EditText) findViewById(R.id.edtDescripcion);



        String name         = edtName.getText().toString();
        //String fecha        = edt.getText().toString();
        String telefono     = edtTelefono.getText().toString();
        String correo       = edtCorreo.getText().toString();
        String descripcion  = edtDescripcion.getText().toString();

        Intent i            = new Intent(this, MainActivity2.class);

        i.putExtra(getResources().getResourceName(R.string.nombre_parametro_name), name);
        i.putExtra(getResources().getResourceName(R.string.nombre_parametro_telefono), telefono);
        i.putExtra(getResources().getResourceName(R.string.nombre_parametro_correo), correo);
        i.putExtra(getResources().getResourceName(R.string.nombre_parametro_descripcion), descripcion);

        startActivity(i);
    }


}
