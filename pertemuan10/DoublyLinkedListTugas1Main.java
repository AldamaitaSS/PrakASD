import java.util.Scanner;

public class DoublyLinkedListTugas1Main {

    public static void menu() {
        System.out.println(" ");
        System.out.println("==============================");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("==============================");
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
    }

    public static int Pilih() {
        Scanner al = new Scanner(System.in);
        System.out.print("Masukkan pilihan Anda: ");
        return al.nextInt();
    }

    public static String DataPasien() {
        Scanner al = new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.print("Masukkan Data penerima vaksin: ");
        System.out.println("-----------------------------");
        return al.next();
    }

    public static int noAntrian() {
        Scanner al = new Scanner(System.in);
        System.out.print("Masukkan nomor antrian: ");
        return al.nextInt();
    }

    public static void main(String[] args) {
        DoublyLinkedListTugas1 dll = new DoublyLinkedListTugas1();
        boolean vaksin = true;

        while (vaksin) {
            menu();
            int pilih = Pilih();

            switch (pilih) {
                case 1:
                    String nama = DataPasien();
                    int nomor = noAntrian();
                    dll.addFirst(nama, nomor);
                    System.out.println(nama + " telah ditambahkan ke antrian dengan nomor " + nomor + ".");
                    break;
                case 2:
                    String removedName = dll.remove();
                    if (removedName != null) {
                        System.out.println(removedName + " telah selesai divaksinasi.");
                    } else {
                        System.out.println("Antrian sudah kosong.");
                    }
                    break;
                case 3:
                    dll.print();
                    break;
                case 4:
                    vaksin = false;
                    break;
                default:
                    System.out.println("Format ketikan salah, silahkan ketik ulang.");
            }
        }
    }
}
