package com.reverse;

public class Reverse {

    public static String reverse(String texto) {
        String newString ="";

        for (int i=texto.length()-1 ; i>=0 ; i--){
            newString += texto.charAt(i);
        }
        return newString;
    }
}
