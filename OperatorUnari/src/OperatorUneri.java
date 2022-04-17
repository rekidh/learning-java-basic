public class OperatorUneri {
  public static void main(String[] args) {

    // unery = operator yang dilakukan pada satu variabel

    // unary + dan -
    int angka = 1;
    System.out.printf("unary '+' %d menjadi %d\n", angka, +angka);
    System.out.printf("unary '-' %d menjadi %d\n", angka, -angka);

    // Unary decrement dan Increment
    int angka2 = 10;
    angka2++;
    System.out.println("unary '++' menjadi " + angka2);

    int angka3 = 10;
    angka3--;
    System.out.println("unary '--' menjadi " + angka3);

    int a = 5;
    System.out.printf("nilai ndengan '++'  %d \n", ++a); // prefix

    int b = 5;
    System.out.printf("nilai ndengan '++'  %d \n", b++); // postfix
    System.out.printf("nilai ndengan '++'  %d \n", b);

  }
}