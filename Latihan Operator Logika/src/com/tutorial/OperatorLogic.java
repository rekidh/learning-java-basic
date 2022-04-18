package com.tutorial;
import java.util.Scanner;

public class OperatorLogic {
    public static void main(String[] args) {

        // Membuat sebuah object untuk menangkap input dari user
        Scanner inputUser = new Scanner(System.in);

        //Sebuah program sederhana untuk menebak sebuah angka
        int nilaiBenar = 6;
        int nilaitebakan;
        boolean statusTebakan;

        System.out.println("masuakan tebakan anda :");
        nilaitebakan = inputUser.nextInt();
        System.out.println("nilai tebakan anda adalah :"+nilaitebakan);

        // dengan model if statement

        /* if (nilaitebakan==nilaiBenar){
                  System.out.println("nilai tebakan Benar");
                 }
         */

        //operasi logika
        statusTebakan=(nilaitebakan== nilaiBenar);
        System.out.println("tebakan anda "+statusTebakan);

        //operasi aljabar boolean (and/or)
        System.out.println("masukan nilai diantara 4 dan 9 :");
        statusTebakan=(nilaitebakan>4)&&(nilaitebakan<9);
        System.out.println("tebakan anda "+statusTebakan);
        /*
        A  | B | C
        0    0   0
        0    1   0
        1    0   0
        1    1   1
        */

    }
}
