package com.tutorial;
import java.util.*;

public class DeretFibonaci {
    public static void main(String[] args) {
        // derret Fibonaci
        /*   1  2   3   4   5   6   7
            1   1   2   3   5  8   13
         rumus deret fibonaci
         **iteras pertama**
         fn= fn1+fn2;
         fn4=fn3+fn2

         **contoh**
         int fn1 =0;
         int fn2 =1;
         int fn = fn1+fn2;
        */
        int nilaiPertama =0;
        int nilaiKedua =1;
        int hasil=1;
        int awal,akhir;
        Scanner inputUser = new Scanner(System.in);
        System.out.println("masukan : ");
        awal = inputUser.nextInt();
        System.out.println("masukan value 2 :");
        akhir=inputUser.nextInt();

        do {

            hasil=nilaiPertama+nilaiKedua;
            nilaiKedua=nilaiPertama;
            nilaiPertama=hasil;
            awal++;
            System.out.println("hasil "+hasil);

        }while (awal<=akhir);
        // ini  bisa di lakukan dengan methode looping mana pun
        // silahkan ber experiment



    }
}
