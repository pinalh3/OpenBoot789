package com.arraylistint;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listadoint = new ArrayList<Integer>();

        for (int i=1 ; i<11 ; i++){
            listadoint.add(i);
        }

        for (int i=0 ; i<listadoint.size() ; i++){
            if(listadoint.get(i)%2 == 0){
               listadoint.remove(i);
            }
        }
        System.out.println(listadoint);
    }
}
