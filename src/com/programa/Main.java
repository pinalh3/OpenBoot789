package com.programa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) throws IOException{
        String opcion = "si";
        ArrayList<String> impresion = new ArrayList<String>();
        while(opcion.equals("si")) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("De que pais desea saber la capital\n");
            String pais = br.readLine();
            impresion.add(buscar(pais));
            
            System.out.println("desea buscar otra capital? coloque si o no");
            String seleccion = br.readLine();
            opcion = seleccion;
            System.out.println(seleccion);

        }
        if(opcion.equals("no")) {
            escribirArchivo(impresion);
        }
    }

    public static HashMap<String, String> capitales() {
        HashMap<String, String> capital = new HashMap<String, String>();

        capital.put("Francia", "Paris");
        capital.put("Argentina", "Buenos Aires");
        capital.put("Venezuela", "Caracas");
        capital.put("España", "Madrid");
        capital.put("Estados Unidos", "Washington");

        return capital;
    }

    public static void escribirArchivo(ArrayList<String> mensaje) throws IOException{
        PrintStream resultado = new PrintStream("C:\\Users\\pinalh\\Documents\\DOCUMENTOS\\output.txt");
        for (String i : mensaje) {
            resultado.println(i);
        }
        resultado.close();
    }

    public static String buscar(String pais){
        HashMap<String, String> datos = capitales();
        String busquedas = "";
        if (datos.containsKey(pais)){
            busquedas ="La capital de " + pais + " es " + datos.get(pais)+"\n";
        }else{
            System.out.println("El pais no se encuentra en la lista");
        }
        return busquedas;
    }
}
