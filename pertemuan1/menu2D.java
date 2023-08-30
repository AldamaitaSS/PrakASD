package pertemuan1;
import java.util.Scanner;
public class menu2D {
    static Scanner al = new Scanner(System.in);

    static void menu() {
        int pilihan;
        do {
            System.out.println("=================================================");
            System.out.println("|                  Menu Utama                   |");
            System.out.println("-------------------------------------------------");
            System.out.println("| No. | Menu                                    |");
            System.out.println("-------------------------------------------------");
            System.out.println("|  1  | Hitung Luas Segitiga                    |");
            System.out.println("|  2  | Hitung Luas Persegi Panjnag             |");
            System.out.println("|  3  | Hitung Luas Lingkaran                   |");
            System.out.println("|  4  | Keluar                                  |");
            System.out.println("=================================================");
            System.out.print("Pilih menu (1-4): ");
            pilihan = al.nextInt();

            switch (pilihan) {
                case 1:
                    luasSegitiga();
                    break;
                case 2:
                    luasPersegiPanjang();
                    break;
                case 3:
                    luasLingkaran();;
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid!");
            }
            
        } while (pilihan != 4);
    }

    static void luasSegitiga() {
        System.out.print("Masukkan alas segitiga = ");
        double alas = al.nextDouble();
        System.out.print("Masukkan tinggi segitiga = ");
        double tinggi = al.nextDouble();
        System.out.print("\n------------------------------\n");
        double hasil = 0.5*alas*tinggi;
        System.out.print("Luas segitiga = " + hasil);
        System.out.print("\n------------------------------\n");
    }

    static void luasPersegiPanjang() {
        System.out.print("Masukkan panjang = ");
        double panjang = al.nextDouble();
        System.out.print("Masukkan lebar = ");
        double lebar = al.nextDouble();
        System.out.print("\n------------------------------\n");
        double hasil = panjang*lebar;
        System.out.print("Luas persegi panjang = " + hasil);
        System.out.print("\n------------------------------\n");
    }

    static void luasLingkaran() {
        System.out.print("Masukkan jari-jari = ");
        double jariJari = al.nextDouble();
        System.out.print("\n------------------------------\n");
        double hasil = Math.PI*jariJari*jariJari;
        System.out.print("Luas lingkaran = " + hasil);
        System.out.print("\n------------------------------\n");
    }

    public static void main (String[] args) {
        menu();
        luasSegitiga();
        luasPersegiPanjang();
        luasLingkaran();
    }
}
