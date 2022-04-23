package com.tutorial;

public class LoopingControl {

    public static void main(String[] args) {
        // break, continue, return

        //Break
        // saat ketemu keyword ini loop akan di keluarkan
        int a =0;
        while (true){
            a++;
            System.out.println("nilai"+a);
            if (a==10){
                break;
            } else if (a==5) {
                continue;//saat ketemu Continue akan melewatkan di bawah nya

            } else if (a==7) {
                return;  // return akalau di tero di mana pun di JAVA
                // program akan di hentikan saat keyword retrun di temukan

            }

        }



    }
}
