package com.vector;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("hola");
        vector.add("me");
        vector.add("llamo");
        vector.add("Luis");
        vector.add("Felipe");

        vector.remove(2);
        vector.remove(3);

        System.out.println(vector);
        /* Si se deja la capacidad por defecto el vector duplicaria su tamaño
        por 10 cada vez que excedamos la capacidad inicial por defecto que es 10,
        esto implica que si metemos 1000 elementos la capacidad se incrementaria 99 veces
        incurriendo en consumo de recursos de maquina.
         */

    }
}
