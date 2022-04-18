package com.tutorial;
import java.util.Scanner;

public class Pengelompokan {
    public static void main(String[] args) {

        int hasil = 5*2 +10;    //output 20
        // hasil =10+2 *5;  = 20;
        //  hasil = 10/2-2;  = -5;
        // jadi apa yang di kerjakan kan terlebih dahulu ?
        // perkalian atau pembagian akan di kerjakan terlebih dahulu
        // baru melakukan penambahan atau pengurangan
        // hasil = 3*5/5;  => sebanding
        // hasil = 3+12-7; => sebanding
        // jika sebanding maka operasi akan di lakukan dari kiri ke kananan

        System.out.println(hasil);
        //PENGELOMPOKAN
        // yang bertujuan untuk menentukan operasi mana yang kan di lakukan terlebih dahulu
        //contoh
        // hasil = 5*2+3; =13
        // kita ingin melakukan penambahan dahulu baru melakukan perkalian
        // hasil = 5*(2+3); =25


        System.out.println("**persmaan kuadrat**");
        int x,c,m,nil;

        Scanner input = new Scanner(System.in);
        System.out.println("masukan niali X :");
        x = input.nextInt();
        System.out.println("masukan nilai C :");
        c = input.nextInt();
        System.out.println("masukan nilai M :");
        m=input.nextInt();
        nil=(m*x*x)+c;
        System.out.println("nilai "+nil);

    }
}
