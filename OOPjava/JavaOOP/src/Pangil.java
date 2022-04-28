import java.util.*;

public class Pangil {
    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);

        Kalkulator value = new Kalkulator();

        System.out.println("masukan valu 1");
        value.value1 = inputUser.nextInt();

        System.out.println("masukan operator");
        value.operator = inputUser.next();

        System.out.println("masukan valu 2");
        value.value2 = inputUser.nextInt();

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
