package com.example.android.personas;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by android on 30/09/2017.
 */

public class Metodos {
    public static int cuantas_mujeres(ArrayList<Persona> personas){

        int cont =0;
        for (int i = 0; i < personas.size(); i++) {
            if(personas.get(i).getSexo()==1)cont++;
        }
        return cont;
    }

    public static int cuantas_hombres(ArrayList<Persona> personas){

        int cont =0;
        for (int i = 0; i < personas.size(); i++) {
            if(personas.get(i).getSexo()==0)cont++;
        }
        return cont;
    }
    public static ArrayList<Persona> cuales_mujeres(ArrayList<Persona> personas){
        ArrayList<Persona> mujeres=new ArrayList<>();
        for (int i = 0; i <personas.size() ; i++) {
            if(personas.get(i).getSexo()==1)mujeres.add(personas.get(i));
        }
        return mujeres;
    }

    public static ArrayList<Persona> cuales_hombres(ArrayList<Persona> personas){
        ArrayList<Persona> hombres=new ArrayList<>();
        for (int i = 0; i <personas.size() ; i++) {
            if(personas.get(i).getSexo()==0)hombres.add(personas.get(i));
        }
        return hombres;
    }

    public static int fotoAleatoria(ArrayList<Integer> fotos){
        int fotoSeleccionada;
        Random r = new Random();
        fotoSeleccionada = r.nextInt(fotos.size());
        return fotos.get(fotoSeleccionada);
    }
}