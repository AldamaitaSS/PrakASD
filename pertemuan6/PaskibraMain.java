import java.util.Scanner;
public class PaskibraMain {
    public static void main(String[] args) {
        Scanner al = new Scanner(System.in);
        Scanner sal = new Scanner(System.in);
        
        DaftarAnggotaPaskibra data = new DaftarAnggotaPaskibra();
        int jumPst = 10;

        for (int i = 0; i < jumPst; i++) {
            System.out.print("Nama = ");
            String nama = sal.nextLine();
            System.out.print("Kelas = ");
            String kelas = al.nextLine();
            System.out.print("Tinggi badan (cm) = ");
            int tinggi = al.nextInt();
            al.nextLine();
            System.out.print("\n");

            Paskibra m = new Paskibra(nama, kelas, tinggi);
            data.tambah(m);


        }
            
        System.out.println("==============================");
        System.out.println("Data peserta sebelum sorting ");
        data.tampil();
        System.out.print("\n");

        System.out.println("-------------------------------------------------------");
        System.out.println("Data peserta setelah sorting dengan Bubble Sort");
        data.bubbleSort();
        data.tampil();
        System.out.print("\n");

        System.out.println("Data peserta setelah sorting dengan Selection Sort");
        data.selectionSort();
        data.tampil();
    }
}
