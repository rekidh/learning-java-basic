package com.tutorial;

public class Main {
    public static void main(String[] args){
        // tipe data di java
        // integer, byte, short, long, double, float, chart, boolean

        //integer
        int angka = 10;
        System.out.println("****INTEGER****");
        System.out.println("nilai integer angka ="+(angka+1));
        System.out.println("nilai Min =" + Integer.MAX_VALUE);
        System.out.println("nilai Min =" + Integer.MIN_VALUE);
        System.out.println("Besar Integer ="+Integer.BYTES+"bytes");
        System.out.println("Besar Integer ="+Integer.SIZE+"Bit");

        //byte (satuan)
        int satuan = 10;
        System.out.println("****BYTE****");
        System.out.println("nilai byte satuan ="+ satuan);
        System.out.println("nilai Min =" + Byte.MAX_VALUE);
        System.out.println("nilai Min =" + Byte.MIN_VALUE);
        System.out.println("Besar Integer ="+Byte.BYTES+"bytes");
        System.out.println("Besar Integer ="+Byte.SIZE+"Bit");

        //short
        int st = 10;
        System.out.println("****SHORT****");
        System.out.println("nilai integer angka ="+st);
        System.out.println("nilai Min =" + Short.MAX_VALUE);
        System.out.println("nilai Min =" + Short.MIN_VALUE);
        System.out.println("Besar Integer ="+Short.BYTES+"bytes");
        System.out.println("Besar Integer ="+Short.SIZE+"Bit");

        //long
        long l=10l;
        System.out.println("****LONG****");
        System.out.println("nilai integer angka ="+l);
        System.out.println("nilai Min =" + Long.MAX_VALUE);
        System.out.println("nilai Min =" + Long.MIN_VALUE);
        System.out.println("Besar Integer ="+Long.BYTES+"bytes");
        System.out.println("Besar Integer ="+Long.SIZE+"Bit");

        //Double (Koma ,Bilangan Real)
        double dl= -10.5d;
        System.out.println("****DOUBLE****");
        System.out.println("nilai integer angka ="+dl);
        System.out.println("nilai Min =" + Double.MAX_VALUE);
        System.out.println("nilai Min =" + Double.MIN_VALUE);
        System.out.println("Besar Integer ="+Double.BYTES+"bytes");
        System.out.println("Besar Integer ="+Double.SIZE+"Bit");

        //Chart
        long crt=10L;
        System.out.println("****CHART****");
        System.out.println("nilai integer angka ="+crt);
        System.out.println("nilai Min =" + Character.MAX_VALUE);
        System.out.println("nilai Min =" + Character.MIN_VALUE);
        System.out.println("Besar Integer ="+Character.BYTES+"bytes");
        System.out.println("Besar Integer ="+Character.SIZE+"Bit");

        //float (Koma, Bilangan real)
        float fl= -8.5f;
        System.out.println("****FLOAT****");
        System.out.println("nilai integer angka ="+fl);
        System.out.println("nilai Min =" + Float.MAX_VALUE);
        System.out.println("nilai Min =" + Float.MIN_VALUE);
        System.out.println("Besar Integer ="+Float.BYTES+"bytes");
        System.out.println("Besar Integer ="+Float.SIZE+"Bit");

        //Boolean
        boolean val = true;
        System.out.println("****BOOLEAN****");
        System.out.println("nilai integer angka ="+val);
        System.out.println("nilai Min =" + Boolean.TRUE);
        System.out.println("nilai Min =" + Boolean.FALSE);

    }
}
