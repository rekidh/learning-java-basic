package com.tutorial;
import java.util.*;

public class Ternary {
    public static void main(String[] args) {

        //ternary operator
        // variabel x= ekperesi ? statement_true : statement_false;

        int input,x;

        Scanner inputUser = new Scanner(System.in);

        System.out.println("masukan nilai");
        input= inputUser.nextInt();

        //variabel
        x =(input==10)? (input+input):(input/2);

        //jika maka if
        if(input==10){
            x=input+input;
        }else {
            x=input/2;
        }

        System.out.println("hasil"+x);


    }
}
