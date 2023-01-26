package com.array2;

public class Main {
    public static void main(String[] args) {
        int[][] enteros = {{1,2,3},{10,6,7},{9,5,20}};
        for(int i = 0; enteros.length > i; i++){
            for (int j=0 ; enteros[i].length > j; j++){
                System.out.println("el valor: "+enteros[i][j]+" que esta en la posicion ["+i+"]["+j+"]");
            }
        }
    }
}
