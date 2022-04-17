package com.tutorial;

public class OperatorLogika {
    public static void main(String[] args) {
        // Operator logika  --> operasi yang bisa kita lakakukan kepada tipe data boolean
        // AND,OR,XOR,negasai

        boolean a,b,c;

        // OR ( || )
        System.out.println("********** OR || *******");
        a =false;
        b = false;
        c = (a||b);
        System.out.println(a+ "||" + b +" =" +c);

        a =false;
        b = true;
        c = (a||b);
        System.out.println(a+ "||" + b +" =" +c);

        a =true;
        b = false;
        c = (a||b);
        System.out.println(a+ "||" + b +" =" +c);

        a =true;
        b = true;
        c = (a||b);
        System.out.println(a+ "||" + b +" =" +c);

        // AND ( && )
        System.out.println("********** AND && *******");
        a =false;
        b = false;
        c = (a&&b);
        System.out.println(a+ "&&" + b +" =" +c);

        a =false;
        b = true;
        c = (a&&b);
        System.out.println(a+ "&&" + b +" =" +c);

        a =true;
        b = false;
        c = (a&&b);
        System.out.println(a+ "&&" + b +" =" +c);

        a =true;
        b = true;
        c = (a&&b);
        System.out.println(a+ "&&" + b +" =" +c);

        // XOR ( ^ )
        System.out.println("********** XOR ^ *******");
        a =false;
        b = false;
        c = (a^b);
        System.out.println(a+ "^" + b +" =" +c);

        a =false;
        b = true;
        c = (a^b);
        System.out.println(a+ "^" + b +" =" +c);

        a =true;
        b = false;
        c = (a^b);
        System.out.println(a+ "^" + b +" =" +c);

        a =true;
        b = true;
        c = (a^b);
        System.out.println(a+ "^" + b +" =" +c);

        // NOT ( ! )
        System.out.println("********** NEGASI /NOT ! *******");
        a =true;
        c = !a;
        System.out.println(a+ " --> (!) =" +c);

        a =false;
        c = !a;
        System.out.println(a+ " --> (!) =" +c);


    }
}
