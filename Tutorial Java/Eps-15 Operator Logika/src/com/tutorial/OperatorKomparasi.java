package com.tutorial;

public class OperatorKomparasi {
    public static void main(String[] args) {

        //opeerstor ini akan menghasilkan nilai dalam bentuk boolean

        int a,b;
        boolean hasilcomparasi;

        //operator equal atau persamaan
        System.out.println("#######PERSAMAAN");
        a=10;
        b=10;
        hasilcomparasi=(a==b);
        System.out.printf("%d apakah sama dengan %d ? %s \n",a,b,(a==b));

        a=10;
        b=12;
        hasilcomparasi=(a==b);
        System.out.printf("%d apakah sama dengan %d ? %s \n",a,b,(a==b));

        //operator not equal atau pertidak samaan
        System.out.println("#######PER TIDAK SAMAAN");
        a=10;
        b=10;
        hasilcomparasi=(a!=b);
        System.out.printf("%d apakah tidak sama dengan %d ? --> %s \n",a,b,(a!=b));

        a=10;
        b=12;
        hasilcomparasi=(a!=b);
        System.out.printf("%d apakah tidak sama dengan %d ? --> %s \n",a,b,(a!=b));

        //operator less atau kurang dari
        System.out.println("#######KURANG DARI");
        a=10;
        b=10;
        hasilcomparasi=(a<b);
        System.out.printf("%d apakah kurang dari %d ? --> %s \n",a,b,(a<b));

        a=10;
        b=12;
        hasilcomparasi=(a<b);
        System.out.printf("%d apakah kurang dari %d ? --> %s \n",a,b,(a<b));

        //operator greater atau lebih dari
        System.out.println("#######LEBIH DARI");
        a=10;
        b=10;
        hasilcomparasi=(a>b);
        System.out.printf("%d apakah lebih dari %d ? --> %s \n",a,b,(a>b));

        a=10;
        b=12;
        hasilcomparasi=(a>b);
        System.out.printf("%d apakah lebih dari %d ? --> %s \n",a,b,(a>b));

        //operator less than equal atau kurang dari sama dengan
        System.out.println("#######KURANG ATAU SAMA DENGAN");
        a=10;
        b=10;
        hasilcomparasi=(a<=b);
        System.out.printf("%d apakah sama atau kurang dari %d ? --> %s \n",a,b,(a<=b));

        a=10;
        b=12;
        hasilcomparasi=(a<=b);
        System.out.printf("%d apakah sama atau kurang dari %d ? --> %s \n",a,b,(a<=b));

        //operator greater than equal atau lebih dari sama dengan
        System.out.println("#######LEBIH ATAU SAMA DENGAN");
        a=10;
        b=10;
        hasilcomparasi=(a>=b);
        System.out.printf("%d apakah lebih atau sama dengan %d ? --> %s \n",a,b,(a>=b));

        a=10;
        b=12;
        hasilcomparasi=(a>=b);
        System.out.printf("%d apakah lebih atau sama dengan %d ? --> %s \n",a,b,(a>=b));
    }
}
