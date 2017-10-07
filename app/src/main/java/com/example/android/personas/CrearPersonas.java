package com.example.android.personas;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class CrearPersonas extends AppCompatActivity {

    private EditText cajacedula,cajanombre,cajaapellido;
    private Resources res;
    private Spinner cajasexo;
    private String [] sexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_personas);
        cajacedula = (EditText)findViewById(R.id.txtCedula);
        cajanombre = (EditText)findViewById(R.id.txtNombre);
        cajaapellido = (EditText)findViewById(R.id.txtApellido);
        cajasexo = (Spinner)findViewById(R.id.cmbSexo);
        res = this.getResources();

        sexo = res.getStringArray(R.array.sexo);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,sexo);
        cajasexo.setAdapter(adapter);
    }

    public void guardar (View v){
        String cedula,nombre,apellido;
        int sex;
        cedula = cajacedula.getText().toString();
        nombre = cajanombre.getText().toString();
        apellido = cajaapellido.getText().toString();
        sex = cajasexo.getSelectedItemPosition();

        Persona p= new Persona(cedula,nombre,apellido,sex);
        p.guardar();


        Toast.makeText(this,res.getString(R.string.mensaje_guardado),Toast.LENGTH_SHORT).show();
        limpiar();
    }

    public void limpiar(View v){
        limpiar();
    }


    public void limpiar(){
        cajacedula.setText("");
        cajanombre.setText("");
        cajaapellido.setText("");
        cajasexo.setSelection(0);
        cajacedula.requestFocus();
    }
}
