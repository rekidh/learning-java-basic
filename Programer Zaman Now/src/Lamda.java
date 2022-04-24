public class Lamda {
    public static void main(String[] args) {
        // lamda ada semenjak java versi 14
        // lamda akan mempermudah kita dalam membuat switch statement


        String nilai = "B";
        switch (nilai){
            case "A" -> System.out.println("case a");
            case "B","C" -> System.out.println("case B dan C");
            default -> System.out.println("default");
        }

    }
}
