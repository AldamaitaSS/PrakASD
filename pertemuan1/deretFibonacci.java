package pertemuan1;
import java.util.Scanner;
public class deretFibonacci {

    static Scanner al = new Scanner(System.in);

    public static int fibonancci(int nilai) {
        if (nilai <= 1) {
            return nilai;
        } else {
            return fibonancci(nilai-1) + fibonancci(nilai-2);
        }
    }

    static void perulanangan (int nilai) {
        System.out.println (">>>>>>>>> PERULANGAN <<<<<<<<<");
        int bil1 = 0, bil2 = 1;
        System.out.print(bil1 + " " +bil2);

        for (int i = 2; i < nilai; i++) {
            int total = bil1 + bil2;
            System.out.print(" " +total);
            bil1 = bil2;
            bil2 = total;
        }
        System.out.println();
    }

    static void rekursif(int nilai) {
        System.out.println (">>>>>>>>> REKURSIF <<<<<<<<<");
        for (int i = 0; i < nilai; i++) {
            System.out.print(fibonancci(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.print("Masukkan batas angka = ");
        int nilai = al.nextInt();

        fibonancci(nilai);
        perulanangan(nilai);
        rekursif(nilai);



        

    }
}