package com.tutorial;

public class IFBersarang {
    public static void main(String[] args) {
        // nested if ( pengkondisian bersarang)

        int a=6;
        int b =10;

        System.out.println("ini adalah awal program");
        if (a==5){
            System.out.println("kondisi 1 (if) true");
            if (b==10){
                System.out.println("if nested (if1=true)");
            }
        }else if(a==15){
            System.out.println("kondisi 2 (if1=false),(if2=true)");
        }else {
            System.out.println("semua kondisi bernilai false");
        }
        System.out.println("akhir program");
    }
}
