package com.tutorial;

public class DoWhileLoop {
    public static void main(String[] args) {
        boolean kondisi=true;
        int a=0;
        do {
            a++;
            System.out.println("aksi "+a);
            if (a==10){
                kondisi=false;
            }
        }while (kondisi);
    }
}
