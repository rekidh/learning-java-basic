package com.tutorial;

public class IfElse {
    public static void main(String[] args) {
        //if else untuk mengatur alur program
        // if else = (percabagan)

        int a = 5;
        System.out.println("data = "+a);

        //ini adalah cabang nya if
        if (a==5){
            System.out.println("ini adalah cabang");
        }
        System.out.println("program pertama selesai");

        // ini adalah percabangan else
        if (a == 10) {
            System.out.println("ini jalur benar");
        }else {
            System.out.println("ini jalaur salah");
        }
    }
}
