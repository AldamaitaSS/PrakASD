import java.util.Scanner;

public class HashTableTugasMain {
    public static void main(String[] args) {
        HashTableTugas mt= new HashTableTugas();
        Scanner al = new Scanner(System.in);

        while (true) {
            System.out.println("\n");
            System.out.println("===============================");
            System.out.println("              MENU             ");
            System.out.println("===============================");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Cari Data Mahasiswa");
            System.out.println("3. Hapus Data Mahasiswa");
            System.out.println("4. Tampilkan Keseluruhan NIM Mahasiswa");
            System.out.println("5. Keluar");
            System.out.println("-------------------------------");
            System.out.print("Pilih menu (1-5): ");
            
            int choice = al.nextInt();
            al.nextLine();  // consume newline
            
            switch (choice) {
                case 1:
                    System.out.println("\n");
                    System.out.println("  Tambahkan Data Mahasiswa!   ");
                    System.out.println("------------------------------");
                    System.out.print("NIM : ");
                    String nim = al.nextLine();
                    System.out.print("Nama Lengkap : ");
                    String namaLengkap = al.nextLine();
                    System.out.print("Jurusan : ");
                    String jurusan = al.nextLine();
                    System.out.print("Program Studi : ");
                    String programStudi = al.nextLine();

                    Mahasiswa newMahasiswa = new Mahasiswa(nim, namaLengkap, jurusan, programStudi);
                    mt.set(newMahasiswa);
                    System.out.println(" Data Sudah Disimpan! ");
                    break;

                case 2:
                    System.out.println("\n");
                    System.out.println("     Cari Data Mahasiswa!     ");
                    System.out.println("------------------------------");
                    System.out.print("Masukkan NIM Mahasiswa yang dicari : ");
                    String nimCari = al.nextLine();
                    
                    Mahasiswa mhsCari = mt.get(nimCari);
                    if (mhsCari != null) {
                        System.out.println("Mahasiswa ditemukan!");
                        System.out.println("NIM : " + mhsCari.nim);
                        System.out.println("Nama Lengkap : " + mhsCari.namaLengkap);
                        System.out.println("Jurusan : " + mhsCari.jurusan);
                        System.out.println("Program Studi : " + mhsCari.programStudi);
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + nimCari + " tidak ditemukan.");
                    }
                    break;

                case 3:
                    System.out.println("\n");
                    System.out.println("     Hapus Data Mahasiswa!    ");
                    System.out.println("------------------------------");
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String nimHapus = al.nextLine();
                    
                    if (mt.remove (nimHapus)) {
                        System.out.println("Mahasiswa dengan NIM " + nimHapus + " telah dihapus.");
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + nimHapus + " tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.println("\n");
                    System.out.println(" Seluruh Data NIM Mahasiswa   ");
                    System.out.println("------------------------------");
                    mt.printTable();
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu 1-5! : ");
            }
        }
    }
}
