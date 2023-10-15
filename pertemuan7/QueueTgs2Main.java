import java.util.Scanner;

public class QueueTgs2Main {
    public static void main(String[] args) {
        Scanner al = new Scanner(System.in);
        System.out.print("Masukkan kapasitas antrian: ");
        int kapasitas = al.nextInt();
        
        QueueTgs2 antrianMahasiswa = new QueueTgs2(kapasitas);

        int pilih;
        do {
            System.out.println("--------------------------");
            System.out.println("        Pilih menu        ");
            System.out.println("--------------------------");
            System.out.println("1. Antrian baru");
            System.out.println("2. Antrian keluar");
            System.out.println("3. Cek Semua Antrian");
            System.out.println("4. Cek Antrian terdepan");
            System.out.println("5. Cek Antrian paling belakang");
            System.out.println("6. Cek Posisi Mahasiswa");
            System.out.println("7. Cek Mahasiswa pada Posisi Tertentu");
            System.out.println("8. Keluar");
            System.out.println("--------------------------");
            
            pilih = al.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = al.next();
                    System.out.print("Nama: ");
                    String nama = al.next();
                    System.out.print("Absen: ");
                    int absen = al.nextInt();
                    System.out.print("IPK: ");
                    double ipk = al.nextDouble();
                    
                    Mahasiswa mahasiswa = new Mahasiswa(nim, nama, absen, ipk);
                    antrianMahasiswa.Enqueue(mahasiswa);
                    break;
                case 2:
                    int result = antrianMahasiswa.Dequeue();
                    if (result == 1) {
                        System.out.println("Mahasiswa dikeluarkan dari antrian.");
                    } else {
                        System.out.println("Antrian masih kosong.");
                    }
                    break;
                case 3:
                    antrianMahasiswa.print();
                    break;
                case 4:
                    antrianMahasiswa.peek();
                    break;
                case 5:
                    antrianMahasiswa.peekRear();
                    break;
                case 6:
                    System.out.print("NIM Mahasiswa yang dicari: ");
                    String searchNIM = al.next();
                    antrianMahasiswa.peekPosition(searchNIM);
                    break;
                case 7:
                    System.out.print("Posisi Mahasiswa yang ingin dilihat: ");
                    int pos = al.nextInt();
                    antrianMahasiswa.printMahasiswa(pos);
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7); 
    }
}
