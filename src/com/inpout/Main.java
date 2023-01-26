package com.inpout;

import java.io.*;
public class Main {

    public static void main(String[] args) {

        inout("C:\\Users\\pinalh\\Documents\\DOCUMENTOS\\input.txt", "C:\\Users\\pinalh\\Documents\\DOCUMENTOS\\output.txt");

    }
    public static void inout(String FileIn ,String FileOut) {

        try {
            InputStream input = new FileInputStream(FileIn);
            PrintStream output = new PrintStream(FileOut);
            int disponible = input.available();
            byte[] arreglo = new byte[disponible];
            input.read(arreglo);
            String datos = new String(arreglo);
            output.println(datos+" salida");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }


}
