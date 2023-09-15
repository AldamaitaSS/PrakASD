package pertemuan3;
import java.text.DecimalFormat;
import java.util.Scanner;
public class MainSum {
    public static void main (String[] args) {
        Scanner al = new Scanner (System.in);
        
        System.out.print("Masukkan jumlah perusahaan: ");
        int jumlahPerusahaan = al.nextInt();
        
        double[][] keuntunganPerusahaan = new double[jumlahPerusahaan][];

        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.print("Masukkan jumlah bulan untuk perusahaan " + (i + 1) + ": ");
            int jumlahBulan = al.nextInt();
            
            keuntunganPerusahaan[i] = new double[jumlahBulan]; 
            
            for (int j = 0; j < jumlahBulan; j++) {
                System.out.print("Masukkan keuntungan perusahaan " + (i + 1) + " bulan ke-" + (j + 1) + ": ");
                keuntunganPerusahaan[i][j] = al.nextDouble();
            }
        }
        
        for (int i = 0; i < jumlahPerusahaan; i++) {
            double totalKeuntungan = 0;
            for (int j = 0; j < keuntunganPerusahaan[i].length; j++) {
                totalKeuntungan += keuntunganPerusahaan[i][j];
            }
            System.out.println("Total keuntungan perusahaan " + (i + 1) + ": " + totalKeuntungan);
        }
    }
    
}
