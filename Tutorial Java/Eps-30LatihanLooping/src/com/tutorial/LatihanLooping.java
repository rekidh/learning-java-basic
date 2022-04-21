package com.tutorial;
import java.util.*;

public class LatihanLooping {
    public static void main(String[] args) {
        //Latihan Loop

        int total=0;
        int akhir,awal;
        Scanner inputUser=new Scanner(System.in);
        System.out.println("masukan awal = " );
        awal=inputUser.nextInt();
        System.out.println("masukan akhir = ");
        akhir=inputUser.nextInt();
        for (;awal<=akhir;awal++){
            total=total+awal;
            System.out.println("asil "+ total);
        }
    }
}
