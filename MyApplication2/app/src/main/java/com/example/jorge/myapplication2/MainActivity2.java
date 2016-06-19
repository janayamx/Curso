package com.example.jorge.myapplication2;

/**
 * Created by jorge on 17/06/16.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle parametros = getIntent().getExtras();
        String name =
                parametros.getString(getResources().getResourceName(R.string.nombre_parametro_name));
        String telefono =
                parametros.getString(getResources().getResourceName(R.string.nombre_parametro_telefono));
        String correo =
                parametros.getString(getResources().getResourceName(R.string.nombre_parametro_correo));
        String descripcion =
                parametros.getString(getResources().getResourceName(R.string.nombre_parametro_descripcion));


        TextView tvTexto = (TextView) findViewById(R.id.tvTexto1);
        tvTexto.append(name);


        TextView tvTexto3 = (TextView) findViewById(R.id.tvTexto3);
        tvTexto3.append(telefono);
        TextView tvTexto4 = (TextView) findViewById(R.id.tvTexto4);
        tvTexto4.append(correo);
        TextView tvTexto5 = (TextView) findViewById(R.id.tvTexto5);
        tvTexto5.append(descripcion);


    }

    public void irEditarPantalla(View v){



        MainActivity2.this.finish();

        /*
        TextView tvTexto    = (TextView) findViewById(R.id.tvTexto1);
        TextView tvTexto3    = (TextView) findViewById(R.id.tvTexto3);
        TextView tvTexto4    = (TextView) findViewById(R.id.tvTexto4);
        TextView tvTexto5    = (TextView) findViewById(R.id.tvTexto5);

        String name         = tvTexto.getText().toString();
        //String fecha        = edt.getText().toString();
        String telefono     = tvTexto3.getText().toString();
        String correo       = tvTexto4.getText().toString();
        String descripcion  = tvTexto5.getText().toString();

        //Intent i            = new Intent(this, MainActivity.class);

        i.putExtra(getResources().getResourceName(R.string.nombre_parametro_name), name);
        i.putExtra(getResources().getResourceName(R.string.nombre_parametro_telefono), telefono);
        i.putExtra(getResources().getResourceName(R.string.nombre_parametro_correo), correo);
        i.putExtra(getResources().getResourceName(R.string.nombre_parametro_descripcion), descripcion);

        startActivity(i);*/

    }





}