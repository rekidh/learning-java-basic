public class Yeild {
    public static void main(String[] args) {
        // yeild sama hal nya dengan lamda
        // dia tersedia pada java versi 14

        String nilai = "B";
        String ucapan = switch (nilai){
            case "A" :
                yield "case A";
            case "B" :
                yield "case B";
            case "C" :
                yield "case C";
            default:
                yield "aksi defauld";
        };
        System.out.println(ucapan);
    }
}
