package com.tutorial;

import java.util.Scanner;

public class MengambilInput {
    public static void main(String[] args) {
        //deklarasi variabel
        int input,val1,val2,hasil;

        //creat objct dengan Scanner
        Scanner userInput = new Scanner(System.in);    //Object Class Scenner
        // Scanner userInput = new Scanner(System.in) bertugas membuat user input yang
        // betipe class Scanner

        System.out.println("Samukan angka :");

        // Tampung ke dalam tipe data Int karan kita mau input nya angka
        //  jika yang di masuakn oleh user bukan int maka akan errro
        input = userInput.nextInt() ;

        //.nextInt() akan mengambil nilai2 setelah nya
        // dan di tampung ke dalam var input


        System.out.println("input "+input);
        // ini akan mengeluarakan output
        // input dan form yang bisa di isi di console


        System.out.println("#####Kalkulasi (+) sederhana");
        System.out.println("masukan value pertama :");
        val1 = userInput.nextInt() ;
        System.out.println("masukan value kedua :");
        val2 = userInput.nextInt() ;

        hasil = val1+val2;

        System.out.println("input "+hasil);


        //Mengabil input user


    }
}
