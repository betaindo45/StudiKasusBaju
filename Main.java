import java.util.Scanner;

public class Main {
    private static final Scanner inp = new Scanner(System.in);
    public static void main(String[] args) {
        Baju baju = new Baju();

        
        System.out.print("Masukkan tipe baju yang anda inginkan\t\t: ");
        String jenis = inp.nextLine();
        System.out.print("Masukkan jumlah baju yang akan anda beli\t: ");
        int jumlah = inp.nextInt();

        baju.hasil(jenis,jumlah);

    }
}
