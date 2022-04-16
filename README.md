**TUORIAL JAVA**

- Hallo guys ini adalah pembelaajaran java pertama saya
- disini berisikan tutorial Java Dasar

**COMENT DI JAVA**

- coment di java sama seperti bahasa programe lain nya
- `//singel line coment`
- double line coment `/*comen here*/`

  **MENGENAL JAVA**

- java adalah bahasa program yang harus di compile ke Baitcode terlebih dahulu
- untuk mengCompile Java kita harus melalu comenline
- dengan mengetikan perintah `javac Namafile.java`
- hal ini akan menghasilka file baru yang bernama `NamaFile.class` yang akan di `execute` oleh macine

**_java exsecute_**

- untuk bisa menjalankan suatu program java yang telah di compile kita perlu untuk menjalankan nya secara manual (jika tidak menggunkan IDE)
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

**_gerbang/ program di mulai_**

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

**STRUKTUR FOLDER**

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

**_memahami String[] args_**

- apa itu String[] args?
- adalah tempat kita menampung data yang akan di imput pada akhir comentline pada saat execute program
- _contoh execute_

```
$c/tutorial java/memahami Sring arg> java namaFile dita maria

// output arg[0] => dita

//contoh lain nya
 C:\Dev\memahamiStringArg\out\production> java com.tutorial.Main ucuoop
hallo teman-teman 1
hallo ucuoop


```

- `String[]` maksudnya data di simpan pada `[array]` dan `String` type data nya
- dan untuk mengakses value nya `args[?]`
  **VARIABEL**
- variabel adalah tempat kita menaro data
- pada dasarnya kita bisa membuat deklarasi dan assign data
- jika ` Sring frisName ;` hanya seperti ini kita mendeklarasikan data tampa mengmasukanan nilai nya (deklarasi)
- jika ` Sring frisName = "andre" ;` dan `firstName="andre";`berarti kita meng assign (memasukan data/ nilai)

**TIPE DATA**

- pada java sebelum kita mebuat sebuah variabel kita harus menentukan tipe datanya terlebih dahulu (tipe dari variabel)

  - **INTEGER**
  - adalah tipe data numerik (angka) yang mewakili seluruh bilangan bulat
  - tipe data ini tidakmemiliki angka desimal
  - integer masih memiliki turunan tipe data nya
    - `Int`
    - `Long`
    - `Byte`
    - `Short`

- **Data Primitif**

```
package com.tutorial;

public class Main {
    public static void main(String[] args){
        // tipe data di java
        // integer, byte, short, long, double, float, chart, boolean

        //integer
        int angka = 10;
        System.out.println("****INTEGER****");
        System.out.println("nilai integer angka ="+(angka+1));
        System.out.println("nilai Min =" + Integer.MAX_VALUE);
        System.out.println("nilai Min =" + Integer.MIN_VALUE);
        System.out.println("Besar Integer ="+Integer.BYTES+"bytes");
        System.out.println("Besar Integer ="+Integer.SIZE+"Bit");

        //byte (satuan)
        int satuan = 10;
        System.out.println("****BYTE****");
        System.out.println("nilai byte satuan ="+ satuan);
        System.out.println("nilai Min =" + Byte.MAX_VALUE);
        System.out.println("nilai Min =" + Byte.MIN_VALUE);
        System.out.println("Besar Integer ="+Byte.BYTES+"bytes");
        System.out.println("Besar Integer ="+Byte.SIZE+"Bit");

        //short
        int st = 10;
        System.out.println("****SHORT****");
        System.out.println("nilai integer angka ="+st);
        System.out.println("nilai Min =" + Short.MAX_VALUE);
        System.out.println("nilai Min =" + Short.MIN_VALUE);
        System.out.println("Besar Integer ="+Short.BYTES+"bytes");
        System.out.println("Besar Integer ="+Short.SIZE+"Bit");

        //long
        long l=10l;
        System.out.println("****LONG****");
        System.out.println("nilai integer angka ="+l);
        System.out.println("nilai Min =" + Long.MAX_VALUE);
        System.out.println("nilai Min =" + Long.MIN_VALUE);
        System.out.println("Besar Integer ="+Long.BYTES+"bytes");
        System.out.println("Besar Integer ="+Long.SIZE+"Bit");

        //Double (Koma ,Bilangan Real)
        double dl= -10.5d;
        System.out.println("****DOUBLE****");
        System.out.println("nilai integer angka ="+dl);
        System.out.println("nilai Min =" + Double.MAX_VALUE);
        System.out.println("nilai Min =" + Double.MIN_VALUE);
        System.out.println("Besar Integer ="+Double.BYTES+"bytes");
        System.out.println("Besar Integer ="+Double.SIZE+"Bit");

        //Chart
        long crt=10L;
        System.out.println("****CHART****");
        System.out.println("nilai integer angka ="+crt);
        System.out.println("nilai Min =" + Character.MAX_VALUE);
        System.out.println("nilai Min =" + Character.MIN_VALUE);
        System.out.println("Besar Integer ="+Character.BYTES+"bytes");
        System.out.println("Besar Integer ="+Character.SIZE+"Bit");

        //float (Koma, Bilangan real)
        float fl= -8.5f;
        System.out.println("****FLOAT****");
        System.out.println("nilai integer angka ="+fl);
        System.out.println("nilai Min =" + Float.MAX_VALUE);
        System.out.println("nilai Min =" + Float.MIN_VALUE);
        System.out.println("Besar Integer ="+Float.BYTES+"bytes");
        System.out.println("Besar Integer ="+Float.SIZE+"Bit");

        //Boolean
        boolean val = true;
        System.out.println("****BOOLEAN****");
        System.out.println("nilai integer angka ="+val);
        System.out.println("nilai Min =" + Boolean.TRUE);
        System.out.println("nilai Min =" + Boolean.FALSE);
    }
}

```

**OPERASI ARITMATIKA**

```
package com.tutorial;

public class Main {
    public static void main(String[] arg){

        //Operasi aritmatika
        int variabel1 = 10;
        int variabel2 = 3;
        int hasil;

        //1.Penjumblahan
        hasil =variabel1+variabel2;
        System.out.println(hasil);
        System.out.println(variabel1+"+"+variabel2+"="+hasil);

        //2.Pengurangan
        hasil =variabel1-variabel2;

        //pritf format
        System.out.printf("%d-%d=%d \n", variabel1,variabel2,hasil);

        //3.Perkalian
        hasil =variabel1*variabel2;
        System.out.printf("%dx%d=%d \n", variabel1,variabel2,hasil);

        //4.Pembagian
        hasil =variabel1/variabel2;
        System.out.printf("%d:%d=%d \n", variabel1,variabel2,hasil);

        float a = 6;
        float b = 5;
        float hasilFloat = a/b;
        System.out.println("menggunkan tipe data float");
        System.out.println(a+":"+b+"="+hasilFloat);

        //5.Modulus
        hasil =variabel1%variabel2;

        System.out.printf("%d %% %d = %d",variabel1,variabel2,hasil);
        // printf pada modulus agak berbeda agar tanda persen nya muncul
    }
}
```
