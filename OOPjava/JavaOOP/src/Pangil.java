import java.util.*;

public class Pangil {
    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);

        System.out.print("masukan value 1 : ");
        int value1 = inputUser.nextInt();

        System.out.print("masukan operator : ");
        String operator = inputUser.next();

        System.out.print("masukan value 2 : ");
        int value2 = inputUser.nextInt();

        Kalkulator value = new Kalkulator(value1, value2, operator);

        switch (value.operator) {
            case "*":
                value.kali(value.value1, value.value2);
                System.out.println("hasil " + value.hasil);
                break;
            case "/":
                value.bagi(value.value1, value.value2);
                System.out.println("hasil " + value.hasil);
                break;
            case "+":
                value.tambah(value.value1, value.value2);
                System.out.println("hasil " + value.hasil);
                break;
            case "-":
                value.kurang(value.value1, value.value2);
                System.out.println("hasil " + value.hasil);
                break;
        }

    }
}
