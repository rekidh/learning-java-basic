package com.tutorial;
import java.util.*;

public class KalkulatorIFelse {
    public static void main(String[] args) {
        // a operator b
        Scanner inmputUser;
        float a,b,hasil;
        char operator;

        inmputUser=new Scanner(System.in);

        System.out.println("nilai A = ");
        a= inmputUser.nextInt();
        System.out.println("operator ");
        operator=inmputUser.next().charAt(0);
        System.out.println("nilai B = ");
        b = inmputUser.nextFloat();

        System.out.println("input user "+a+" "+operator+" "+b);

        //operator tersedia * / + -
        if (operator == '+'){
            hasil = a+b;
            System.out.println("hasil " + hasil);
        }else if (operator == '*'){
            hasil = a*b;
            System.out.println("hasil " + hasil);
        }else if (operator == '-'){
            hasil = a-b;
            System.out.println("hasil " + hasil);
        }else if (operator == '/'&& b!=0){
            if (b==0){
                System.out.println("tidak bisa di bagi dengan 0");
            }
            hasil = a/b;
            System.out.println("hasil " + hasil);
        }else {
            System.out.println("Operator tidak tersedia");
        }
    }
}
