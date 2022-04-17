public class KonvesiTipeData {
  public static void main(String[] args) {

    // program untuk konversi tipe data numeric

    int nilaiInt = 450; // 32bit
    System.out.println("nilai int = " + nilaiInt);

    // memperluas rentang ke tipe data yang lebih besar
    long nilaiLong = nilaiInt;
    System.out.println("nilai int = " + nilaiLong);

    // memperkecil rentang ke tipe data yang lebih kecil
    byte nilaiByte = (byte) nilaiInt; // cesting type data
    System.out.println("nilai int" + nilaiByte);
    System.out.println("nilai max byte =" + Byte.MAX_VALUE);
    System.out.println("nilai min byte =" + Byte.MIN_VALUE);

    // casting pembagian
    int a = 10;
    int b = 4;
    float c = (float) a / b; // jika tidak di (float) hasilnya akan berbeda

    System.out.printf("%d / %d = %f \n", a, b, c); // %f menunjukan format floting point

  }

}