package com.arraylisstring;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listadoString = new ArrayList<>();
        listadoString.add("Hola");
        listadoString.add("soy");
        listadoString.add("Luis");
        listadoString.add("Felipe");

        for (int i = 0; i < listadoString.size(); i++) {
            System.out.println(listadoString.get(i));
        }

        LinkedList<String> linkeada = new LinkedList<>();

        linkeada.addAll(listadoString);

        for (int i = 0; i < linkeada.size(); i++) {
            System.out.println(linkeada.get(i));
        }
    }
}
