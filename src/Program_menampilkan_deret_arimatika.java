import java.util.Scanner;
public class Program_menampilkan_deret_arimatika {
    public static void main (String[] args) {
        int a,b,jumlah;
        Scanner noir = new Scanner (System.in);
        System.out.println("Masukan nilai suku awal");
        a = noir.nextInt();
        System.out.println("Masukan nilai beda tiap suku");
        b = noir.nextInt();
        System.out.println("Masukan jumlah suku");
        jumlah = noir.nextInt();
        System.out.println("Berikut tampilan deret arimatika!");
        int i = 1;
        
        /*
        do {
            System.out.print(a + " ");
            a+=b;
            i++;
        } while (i<=jumlah)
        */
        
        while(i <= jumlah){           
            System.out.print(a + " ");
            a+=b;
            i++;
        }
    }
}
