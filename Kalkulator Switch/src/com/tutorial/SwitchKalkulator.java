package com.tutorial;
import java.util.*;
public class SwitchKalkulator {
    public static void main(String[] args) {
        // kalkular=tor dengan switch

        Scanner inputUser= new Scanner(System.in);
        float a,b,hasil;
        String operator;

        System.out.println("nilai A :");
        a= inputUser.nextInt();
        System.out.println("operator :");
        operator = inputUser.next();
        System.out.println("nilai B :");
        b = inputUser.nextInt();

        switch (operator){
            case "+":
                hasil=a+b;
                System.out.println("hasil = "+hasil);
                break;
            case "-":
                hasil=a-b;
                System.out.println("hasil = "+hasil);
                break;
            case "*":
                hasil=a*b;
                System.out.println("hasil = "+hasil);
                break;
            case "/":
                hasil=a/b;
                System.out.println("hasil = "+hasil);
                break;
            default:
                System.out.println("operator tidak tersedia");
        }

    }
}
