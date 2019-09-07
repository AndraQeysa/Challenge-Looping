import java.util.Scanner;
public class Program_membentuk_bangun_segitiga_siku_siku {
    public static void main (String[] arg){
        int tinggi;
        Scanner noir = new Scanner (System.in);
        System.out.println ("Masukkan jumlah tinggi segitiga: ");
        tinggi = noir.nextInt();
        
        /*
        int i = 1;
        int j;
        while (i <= tinggi) {
            j = 1;
            while (j <= i) {
                System.out.print (" * ");
                j++;
            }
            System.out.println("");
            i++;
        }
        */
        
        for (int i = 1; i <= tinggi; i++){
            for (int j = 1; j <= i; j++ ){
                System.out.print (" * ");
            }
            System.out.println ("");
        }
    }
}
