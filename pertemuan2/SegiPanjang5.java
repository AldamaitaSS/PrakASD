package pertemuan2;
import java.util.Scanner;
public class SegiPanjang5 {
    public static void main (String[] args) {
        Scanner al = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah persegi panjang : ");
        int jumlah = al.nextInt();

        PersegiPanjang5[] ppArray = new PersegiPanjang5[jumlah];
        
        for (int i = 0; i < jumlah; i++) {
            ppArray[i] = new PersegiPanjang5();
            System.out.println("Persegi panjang ke - " +i);
            System.out.print("Masukkan panjang : ");
            ppArray[i].panjang = al.nextInt();
            System.out.print("Masukkan lebar : ");
            ppArray[i].lebar = al.nextInt();
        }
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Persegi Panjang ke - " +i);
            System.out.println("Panjang : "+ppArray[i].panjang + ", lebar : " +ppArray[i].lebar);
        }


    }
    
}


