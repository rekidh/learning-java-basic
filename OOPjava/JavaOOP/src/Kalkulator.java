public class Kalkulator {

  int value1;
  int value2;
  int hasil;
  String operator;

  Kalkulator(int value1, int value2, String operator) {

    this.value1 = value1;
    this.value2 = value2;
    this.operator = operator;

  }

  void kali(int value1, int value2) {
    this.value1 = value1;
    this.value2 = value2;
    hasil = value1 * value2;
  }

  void bagi(int value1, int value2) {
    this.value1 = value1;
    this.value2 = value2;
    hasil = value1 / value2;
  }

  void tambah(int value1, int value2) {
    this.value1 = value1;
    this.value2 = value2;
    hasil = value1 + value2;

  }

  void kurang(int value1, int value2) {
    this.value1 = value1;
    this.value2 = value2;
    hasil = value1 - value2;
  }

}