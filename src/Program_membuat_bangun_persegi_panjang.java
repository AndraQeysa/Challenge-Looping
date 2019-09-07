import java.util.Scanner;
public class Program_membuat_bangun_persegi_panjang {
    public static void main (String[] args){
        int panjang, lebar;
        Scanner noir = new Scanner (System.in);
        System.out.println("Masukkan nilai panjang: ");
        panjang = noir.nextInt ();
        System.out.println("Masukkan nilai lebar: ");
        lebar = noir.nextInt();
        
        /*
        for (int i = 1; i <= lebar; i++) {
            for (int j = 1; j <= panjang; j++) {
                System.out.print(" * ");
            {
            System.out.println("");
        }
        */
        
        int i = 1;
        int j;
        
        while (i <= panjang) {
            j = 1;
            while (j <= lebar) {
                j++;
                System.out.print(" * ");
            }
            i++;
            System.out.println ("");
        } 
    }
}
