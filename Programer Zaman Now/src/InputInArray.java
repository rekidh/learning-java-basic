public class InputInArray {
    public static String [] array = new String[5];  // variabel
    public static java.util.Scanner scanner = new java.util.Scanner(System.in); // instansiasi scanner

    public static void main(String[] args) {        // main method
        view();  // call method view

    }

    public static String input (String input){      // method 1
        System.out.print(input + " : ");    //
        String data = scanner.nextLine();
        return data;
    }

    public static void view(){
        var input = input("Masukkan Data");
        mat(input);
    }

    public static void mat (String number){
        boolean isFull = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null){
                array [i] = number;
                isFull= false;
                break;
        }
        }
        if (isFull){
            var temp = array;
            array = new String[array.length*2];
            for (int i = 0; i < temp.length; i++) {
                array[i]=temp[i];
            }

        }
        show();
    }

    public static void show (){
        System.out.println("Isi Array");

        for (int i = 0; i < array.length; i++) {
            var todo = array[i];
            var no = i + 1;

            if (array[i]!=null){
                System.out.println(no + ". " + todo);
            }
        }
        view();
    }

}
