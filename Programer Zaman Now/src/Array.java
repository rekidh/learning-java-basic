import java.util.*;

public class Array {
    public static void main(String[] args) {

//        loopi("kamu",23,3,4,6);
        int[] a= new int[9];
        Scanner inputUser = new Scanner(System.in);
        int i =0 ;
        while (i<=a.length){

            System.out.println("masukann data ke "+i);
            a[i] = inputUser.nextInt();
            i++;

        }


    }

    static void loopi(int berhitung,int...data){

        for (int hasil:data) {
            System.out.println(berhitung+" "+hasil);
        }

    }
}
