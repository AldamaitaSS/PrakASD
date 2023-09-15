package pertemuan3;
import java.util.Scanner;
public class MainFaktorial {
    public static void main (String[] args) {
        Scanner al = new Scanner (System.in);
        

        long Awal = System.currentTimeMillis();
        System.out.println("Waktu Awal      : " + String.valueOf(Awal) + "  milidetik");
     
        System.out.println("==========================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
        int elemen = al.nextInt();

        Faktorial [] fk = new Faktorial[elemen];
        for (int i = 0; i < elemen; i++){
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-"+(i+1)+": ");
            fk[i].nilai = al.nextInt();
        }
        
        System.out.println("==========================================");
        System.out.println("Hasil faktorial dengan brute force:");
        for (int i = 0; i < elemen; i ++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah: "+fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("==========================================");
        System.out.println("Hasil faktorial dengan divide conquer:");
        for (int i = 0; i < elemen ; i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah: "+fk[i].faktorialDC(fk[i].nilai));
        }
        System.out.println("==========================================");

        long akhir = System.currentTimeMillis();
        System.out.println("Waktu Akhir      : " + String.valueOf(akhir) + "  milidetik");

        long interval = System.currentTimeMillis();
        System.out.println("Interval Waktu       : " + String.valueOf(interval) + "  milidetik");
        
    }
}
