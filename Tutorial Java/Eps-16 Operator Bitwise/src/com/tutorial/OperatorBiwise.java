package com.tutorial;

public class OperatorBiwise {
    public static void main(String[] args) {

        //Operator Bitwise --> adalah operator untuk melakukan operasi pada nilai bit

        byte a = 2;
        byte b,c;
        String a_bit,b_bit,c_bit;
        a_bit = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bit,a);

        //Operator SHIF LEFT
        System.out.println("*****SHIF LEFT (<<)*****");
        b =(byte)(a<<3);
        b_bit = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n",b_bit,b);

        //Operator SHIF RIGHT
        System.out.println("*****SHIF RIGHT (>>)*****");
        b =(byte)(a>>1);
        b_bit = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n",b_bit,b);

        //Operator Bitwise OR
        System.out.println("*****Bitwise OR (|)*****");
        a = 24;
        a_bit = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bit,a);
        b=12;
        b_bit = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n",b_bit,b);
        System.out.println("______OR_________");
        c =(byte)(a|b);
        c_bit = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d \n",c_bit,c);

        //Operator Bitwise AND
        System.out.println("*****Bitwise AND (&)*****");
        a = 24;
        a_bit = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bit,a);
        b=12;
        b_bit = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n",b_bit,b);
        System.out.println("______AND_________");
        c =(byte)(a&b);
        c_bit = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d \n",c_bit,c);

        //Operator Bitwise XOR
        System.out.println("*****Bitwise XOR (^)*****");
        a = 24;
        a_bit = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bit,a);
        b=12;
        b_bit = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n",b_bit,b);
        System.out.println("______XOR_________");
        c =(byte)(a^b);
        c_bit = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d \n",c_bit,c);

        //Operator Negasi /NOT
        System.out.println("*****Negasi /NOT (~)*****");
        a = 24;
        b=(byte)(~a);
        a_bit = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bit,a);
        b_bit = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n",b_bit,b);
    }
}
