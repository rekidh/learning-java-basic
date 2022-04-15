**TUORIAL JAVA**

- Hallo guys ini adalah pembelaajaran java pertama saya
- disini berisikan tutorial Java Dasar

**_Java Compile_**

- java adalah bahasa program yang harus di compile ke Baitcode terlebih dahulu
- untuk mengCompile Java kita haru melalu comenline
- dengan mengetikan perintah `javac Namafile.java`
- hal ini akan menghasilka file baru yang bernama `NamaFile.class` yang akan di `execute` oleh macine

**_java exsecute_**

- untuk bisa merun suatu program java yang telah di compile kita perlu untuk menjalankan nya secara manula (jika tidak menggunkan IDE)
- caranya kita cukup mengetikan di coment promt

```
$c/Tutorial Java/Memahami Program/src> java NamaFile.class
```

**_dasar syntax_**

- syntax dasar yang harus di ketikan di file.jav adalah

```
public class Main{

}
```

- Public merupakan `visibiliti` untuk sebuah file
- dan dilajukan `class` yang menunjukan file ini merukan Object Oriented Programing
- setelah itu d lanjukan dengan Nama file yang awalan Nama Harus dengan huruf besar dan format penulisan `CamelCase`

**_dasar syntax => gerbang_**

- ini menunjukan file memiliki isi yang akan di `execute`

```
public class Main{

  public static void main(String[] args){
    system.out.print("hello word")
  }
}
```

- ini menunjukan pada system kalau ada bait code yang akan di execute

```
public static void main(){

}
```

**_struktur folder_**

- ini berfungsi untuk membuat folder kita lebih terstruktur
- pada dasarnya saat kit ameng compile `Main.java` pada `coment prom` hasil compile nya akan di letakan pada folder yang sama
- pada kasus ini kita tidak mau hasil compile kita tercampur di `Main.java` karena akan membuat file berantakan
- maka dari itu kita butuh memisakah `file utama` dengan hasil `compile`
- _caranya_

```
$c/Tutorial Java/Memahami Program> //ini adalah directory kita

// kita harus pindahkan directory ke
$cd c/Tutorial Java/Memahami Program/src

// karena semua Main.java di tempat kan di src

// seterlah itu kita lakukan compile
$c/Tutorial Java/Memahami Program/src> javac Main.java -d ../bin

/*
- javac  => sytax untuk mencompile
- Mian.java => file yang akan di compile
- -d  => peritah untuk memindahkan ke folder mana
- ../bin  => arah directory nya
*/
```

**_organisasi Program dengan Package_**

- apa itu package ?
- dimana suatu program di kelompokan dalam suatu folder
- apa funsinya?
- agar si program tidak tercampur satu sama lain
- bagaimana menulis nya?

```
package Main;

// yang berarti packege ini di kelompokan pada folder main

public class Main {

  public static void main(String[] args) {
    System.out.print("hello word");
  }
}
```

- **_packege execute_**

  - untuk mengexecute file yang menggunkan `packege`
  - kita membutukan perintah khusus dan meng execute nya dari `bin`
  - dengan mengetikan perintah berikut

  ```
  $c/Tutorial Java/Memahami Program/bin> java NamaPackege.NamaFile
  ```
