package com.tutorial;

public class Main {
    public static void main(String[] arg){

        //Operasi aritmatika
        int variabel1 = 10;
        int variabel2 = 3;
        int hasil;

        //1.Penjumblahan
        hasil =variabel1+variabel2;
        System.out.println(hasil);
        System.out.println(variabel1+"+"+variabel2+"="+hasil);

        //2.Pengurangan
        hasil =variabel1-variabel2;

        //pritf format
        System.out.printf("%d-%d=%d \n", variabel1,variabel2,hasil);

        //3.Perkalian
        hasil =variabel1*variabel2;
        System.out.printf("%dx%d=%d \n", variabel1,variabel2,hasil);

        //4.Pembagian
        hasil =variabel1/variabel2;
        System.out.printf("%d:%d=%d \n", variabel1,variabel2,hasil);

        float a = 6;
        float b = 5;
        float hasilFloat = a/b;
        System.out.println("menggunkan tipe data float");
        System.out.println(a+":"+b+"="+hasilFloat);

        //5.Modulus
        hasil =variabel1%variabel2;

        System.out.printf("%d %% %d = %d",variabel1,variabel2,hasil);
        // printf pada modulus agak berbeda agar tanda persen nya muncul
    }
}
