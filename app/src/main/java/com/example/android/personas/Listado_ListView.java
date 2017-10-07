package com.example.android.personas;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Listado_ListView extends AppCompatActivity {

    private ListView lista;
    private ArrayList<Persona> personas;
    private Context contexto;
    private AdaptadorPersona adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado__list_view);

        lista = (ListView)findViewById(R.id.lstListadoPersonas);
        contexto = this.getApplicationContext();
        personas = Datos.obteberPersonas();
        adapter = new AdaptadorPersona(contexto,personas);
        lista.setAdapter(adapter);
    }
}
