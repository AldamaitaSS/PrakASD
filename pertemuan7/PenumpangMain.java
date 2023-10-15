import java.util.Scanner;

public class PenumpangMain {
    public static void menu() {
        System.out.println("Pilih menu : ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek Antrian paling belakang");
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Scanner al = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue : ");
        int jumlah = al.nextInt();
        Queue antri = new Queue(jumlah);

        int pilih;
        do {
            menu();
            pilih = al.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Nama : ");
                    String nama = al.next();
                    System.out.print("Kota Asal : ");
                    String asal = al.next();
                    System.out.print("Kota Tujuan : ");
                    String tujuan = al.next();
                    System.out.print("Jumlah Tiket : ");
                    int jml = al.nextInt();
                    System.out.print("Harga : ");
                    int hrg = al.nextInt();
                    System.out.print("\n");
                    Penumpang p = new Penumpang(nama, asal, tujuan, jml, hrg);
                    antri.Enqueue(p);
                    break;
                case 2:
                    Penumpang data = antri.Dequeue();
                    if (!"".equals(data.nama) && !"".equals(data.kotaAsal) && !"".equals(data.kotaTujuan) && data.jumlahTiket != 0 && data.harga != 0) {
                        System.out.println("Antrian yang keluar : " + data.nama + " " + data.kotaAsal + " " + data.kotaTujuan + " " + data.jumlahTiket + " " + data.harga);
                    }
                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekRear();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}
