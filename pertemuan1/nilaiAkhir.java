package pertemuan1;
import java.util.Scanner;
public class nilaiAkhir {
    public static void main (String[] args) {
        Scanner al = new Scanner (System.in);

        double tugas = 0.2;
        double uas = 0.45;
        double uts = 0.35;
        
        System.out.print ("Program Menghitung Nilai Akhir\n");
        System.out.print ("====================================\n");

        System.out.print ("Masukkan Nilai Tugas Mahasiswa : ");
        int nTugas = al.nextInt();
        System.out.print ("Masukkan Nilai Uts Mahasiswa : ");
        int nUts = al.nextInt();
        System.out.print ("Masukkan Nilai UAS Mahasiswa : ");
        int nUas = al.nextInt();

        System.out.print ("\n====================================\n====================================\n");
        
        double input = ((nTugas*tugas) + (nUts*uts) + (nUas*uas));
        System.out.println ("Nilai Akhir   : " + input);
        

        if (input >  0 && input <= 100) {
            
            String nilaiHuruf;

            if (input > 80 && input <= 100) {
                nilaiHuruf = "A";
            }else if (input > 73 && input <= 80) {
                nilaiHuruf = "B+";
            }else if (input > 65 && input <= 73) {
                nilaiHuruf = "B";
            }else if (input > 60 && input <= 65) {
                nilaiHuruf = "C+";
            }else if (input > 50 && input <= 60) {
                nilaiHuruf = "C";
            }else if (input > 39 && input <= 50) {
                nilaiHuruf = "D";
            }else {
                nilaiHuruf = "E";
            }

            System.out.print ("Nilai Huruf  : " + nilaiHuruf);
            System.out.print ("\n====================================\n");

            if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
                System.out.println ("SELAMAT LULUS");
            }else {
                System.out.println ("TIDAK LULUS");
            }

        }else {
            System.out.println ("Nilai yang anda masukkan tidak valid");
        }

    

    
    }
}
