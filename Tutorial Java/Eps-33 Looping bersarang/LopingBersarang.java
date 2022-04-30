public class LopingBersarang {

  public static void main(String[] args) {

    // loping bersarang

    for (int lv1 = 0; lv1 < 10; lv1++) {

      for (int lv2 = lv1; lv2 < 10; lv2++) {
        System.out.print("*");

        for (int lv3 = lv2; lv3 < 10; lv3++) {
          System.out.print("-");
        }
      }
      System.out.println('\n');
    }

  }
}
