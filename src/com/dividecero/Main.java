package com.dividecero;

public class Main {
    public static void main(String[] args) {
        System.out.println(dividePorCero(20,0));
    }

    public static Integer dividePorCero(int a, int b) throws ArithmeticException {

        int div = 0;
        try {
            div = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
            return div;
        }

    }

}
