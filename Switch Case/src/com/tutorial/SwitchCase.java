package com.tutorial;
import java.util.*;

public class SwitchCase {
    public static void main(String[] args) {

        //Swich Case

        short a = 10;
        System.out.println(a);

        // ekpresinya berupa (int,long,bytte,short),String,atau enum
        /*
        switch (expresi){
            case pilihan:
                    statement
                break;
            case pilihan:
                    statement
                 break;
        }
        */

        String input;
        Scanner inpurUser = new Scanner(System.in);
        input=inpurUser.next();
        System.out.println(input);

        System.out.println("**********");
        System.out.println("sebut kan nama");
        input=inpurUser.next();
        switch (input){
            case "otong":
                System.out.println("saya otong ");
                break;
            case "ucup":
                System.out.println("saya ucup");
                break;
            default:
                System.out.println("tidak ada nama");
        }

    }
}
