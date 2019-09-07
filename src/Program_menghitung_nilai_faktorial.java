import java.util.Scanner;
public class Program_menghitung_nilai_faktorial {
    public static void main (String[] args) {
        
        int bil, hasil = 1;
        Scanner noir = new Scanner(System.in);
        System.out.print("Masukan Angka ");
        bil = noir.nextInt();
        
        /*
        for (int i = bil; i > 0; i--) {
            hasil = hasil * i
        }
        */
        
        int i = bil;
        do {
            hasil = hasil * i;
            i--;
        } while ( i > 0);
        System.out.println("Nilai faktorial daro "+bil+" adalah " +hasil);
    }
}