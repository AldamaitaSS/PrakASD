import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class DoublyLinkedListFilmMain {
    public static int inputID() {
        Scanner al = new Scanner(System.in);
        System.out.print("ID: ");
        return scanner.nextInt();
    }

    public static String inputJudul() {
        Scanner al = new Scanner(System.in);
        System.out.print("  Judul Film: ");
        return scanner.nextLine();
    }

    public static double inputRating() {
        Scanner al = new Scanner(System.in);
        System.out.print("  Rating Film: ");
        return sc.nextDouble();
    }

    public static int tambahIndex() {
        Scanner al = new Scanner(System.in);
        System.out.print("Index: ");
        return sc.nextInt();
    }
    public static void main(String[] args) {
        DoublyLinkedList2 filmList = new DoublyLinkedList2();
        boolean film = true;
        Scanner sc = new Scanner(System.in);

        while (film) {
            System.out.println("================================");
            System.out.println("      DATA FILM LAYAR LEBAR     ");
            System.out.println("================================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film Desc");
            System.out.println("10. Keluar");
            System.out.println("================================");
            System.out.print("Pilih menu: ");

            int pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    int newId1 = inputID();
                    String newJudul1 = inputJudul();
                    double newRating1 = inputRating();
                    filmList.addFilmAtBeginning(newId1, newJudul1, newRating1);
                    break;
                case 2:
                    int newId2 = inputID();
                    String newJudul2 = inputJudul();
                    double newRating2 = inputRating();
                    filmList.addFilmAtEnd(newId2, newJudul2, newRating2);
                    break;
                case 3:
                    int newId3 = inputID();
                    String newJudul3 = inputJudul();
                    double newRating3 = inputRating();
                    int index3 = tambahIndex();
                    filmList.addFilmAtIndex(newId3, newJudul3, newRating3, index3);
                    break;
                case 4:
                    filmList.removeFirstFilm();
                    break;
                case 5:
                    filmList.removeLastFilm();
                    break;
                case 6:
                    int index6 = tambahIndex();
                    filmList.removeFilmAtIndex(index6);
                    break;
                case 7:
                    filmList.displayFilms();
                    break;
                case 8:
                    int searchId = inputID();
                    NodeFilm temuFilm = filmList.cariFilm(searchId);
                    if (temuFilm != null) {
                        System.out.println("Data ditemukan!");
                        System.out.println("Data ID Film:");
                        System.out.println("ID: " + temuFilm.id);
                        System.out.println("Judul Film: " + temuFilm.title);
                        System.out.println("Rating: " + temuFilm.rating);
                    } else {
                        System.out.println("Film dengan ID " + searchId + " tidak ditemukan");
                    }
                    break;
                case 9:
                    filmList.urutFilmDESC();
                    System.out.println("Film diurutkan dengan descending");
                    break;
                case 10:
                    film = false;
                    break;
                default:
                    System.out.println("Format tidak sesuai, ketik lagi");
            }
        }
    }    
}
