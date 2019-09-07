import java.util.Scanner;
public class Program_membentuk_bangun_persegi {
    public static void main (String[] args){
        int sisi;
        Scanner noir = new Scanner(System.in);
        System.out.println("Masukkan jumlah sisi persegi");
        sisi = noir.nextInt();
        
        /*
        for (int i = 1; i <= sisi; i++) {
            for (int j = 1; j <= sisi; j++) {
                System.out.print(" * ");
            }
            System.out.print("");
        }
        */
        
        int i = 1;
        int j;
        
        while (i <= sisi) {
            j = 1;
            while (j <= sisi) {
                j++;
                System.out.print(" * ");
            }
            i++;
            System.out.println("");
        }
    }
}
