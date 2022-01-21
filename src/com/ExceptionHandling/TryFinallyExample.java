package com.ExceptionHandling;

public class TryFinallyExample {
    public static void main(String[] args) {
        try {
            finallyExample1();

            System.out.println("after finallyExample1()");
        } catch(Exception ae) {
            System.out.println(ae.getMessage());
        } finally {
            System.out.println("main() finally block");
        }
    }

    public static void finallyExample1() {
        int a = 100;
        int b = 0;
        try {
            int c = a / b;

            System.out.println("c value :"+c);
        } finally {
            System.out.println("finallyExample1() finally block");
        }

        System.out.println("End of finallyExample1()...");

    }
}
