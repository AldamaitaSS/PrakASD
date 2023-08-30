package pertemuan1;
import java.util.Scanner;
public class namaHari {
    public static void main (String[] args) {
        Scanner al = new Scanner (System.in);

        System.out.print ("Masukkan NIM anda : 2241760050");
        System.out.print ("\n=====================================\n");
        System.out.print (" Masukkan 2 digit terakhir NIM : ");
        int input = al.nextInt();
        int n = input%100;

        if (n<10) {
            n += 10;
        }
        

        String[] hari = {"senin", "selasa", "rabu", "kamis", "jumat", "sabtu", "minggu"};

        System.out.print("Output : ");
        for (int i=0; i<n; i++) {
            System.out.print(hari[i%7] + " ");
        }
        al.close();

    }
}        