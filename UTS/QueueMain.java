import java.util.Scanner;
public class QueueMain {
    public static void menu() {
        System.out.println("\nMenu ");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian");
        System.out.println("4. Laporan Pengurutan Pesanan by nama");
        System.out.println("5. Hitung Total Pendapatan");
        System.out.println("6. Keluar");
        System.out.print("Pilih (1-6): ");
    }

    public static void main(String[] args) {
        int MaxSize = 100;
        Pembeli05[] antrian = new Pembeli05[MaxSize];
        Pesanan05[] pesanan = new Pesanan05[MaxSize];
        Scanner alda = new Scanner(System.in);


        System.out.println("Dibuat oleh: Aldamaita Salwa Salsabila");
        System.out.println("NIM: 2241760050");
        System.out.println("Absen: 05");
        System.out.println("=================================");
        System.out.println("Sistem Antrian Resto Royal Delish");

        int antriSize = 0;
        int pesanSize = 0;
        int pilih;
        do {
            menu();
            pilih = alda.nextInt();
            switch (pilih) {
                case 1:
                    if (antriSize < MaxSize) {
                        System.out.println("---------------------");
                        System.out.println("Masukkan Data Pembeli");
                        System.out.println("---------------------");
                        System.out.println("Nomor Antrian: " + (antriSize + 1));
                        alda.nextLine();
                        System.out.print("Nama Customer: ");
                        String namaCustomer = alda.nextLine();
                        System.out.print("Nomor HP: ");
                        String nomorHP = alda.nextLine();
                        antrian[antriSize] = new Pembeli05(antriSize, namaCustomer, nomorHP);
                        antriSize++;
                    } else {
                        System.out.println("Antrian penuh.");
                    }
                    break;

                case 2:
                    System.out.println("--------------------------------------------------");
                    System.out.println("          Daftar Antrian Resto Royal Delish       ");
                    System.out.println("--------------------------------------------------");
                    System.out.println("| No. |    Nama Customer    |      No HP       |");

                    for (int i = 0; i < antriSize; i++) {
                        System.out.println("| " + (i + 1) + "| \t" + antrian[i].namaPembeli + "\t|" + antrian[i].NoHp);
                    }
                    System.out.println("Total Antrian : " + antriSize);
                    break;

                case 3:
                    if (antriSize > 0) {
                        Pembeli05 p = antrian[0];
                        for (int i = 0; i < antriSize - 1; i++) {
                            antrian[i] = antrian[i + 1];
                        }
                        antriSize--;

                        System.out.println(p.namaPembeli + " telah memesan Menu");
                        System.out.println("--------------------------------------");
                        System.out.println("        Transaksi Input Pesanan       ");
                        System.out.println("--------------------------------------");
                        System.out.print("Nomor Pesanan: ");
                        int kodePesanan = alda.nextInt();
                        alda.nextLine();
                        System.out.print("Pesanan: ");
                        String namaPesanan = alda.nextLine();
                        System.out.print("Harga: ");
                        int harga = alda.nextInt();
                        alda.nextLine();
                        System.out.println("--------------------------------------");
                        System.out.println("| No |    Nama Pesanan  |   Harga  |");
                        System.out.println("| " + kodePesanan + "   |   " + namaPesanan + "    | " + harga + "   |");
                        System.out.println("Semua pesanan berhasil dicetak");
                        System.out.println("--------------------------------------");
                        pesanan[pesanSize] = new Pesanan05(kodePesanan, harga, namaPesanan);
                        pesanSize++;
                    } else {
                        System.out.println("Antrian kosong.");
                    }
                    break;


                case 4:
                    System.out.println("---------------------------------------");
                    System.out.println("Daftar Pesanan Masuk Resto Royal Delish");
                    System.out.println("---------------------------------------");
                    System.out.println("| No |    Nama Pesanan  |   Harga  |");
                    System.out.println("---------------------------------------");
                    for (int i = 0; i < pesanSize; i++) {
                        System.out.println("|" + pesanan[i].kodePesanan + "|" + "\t" + pesanan[i].namaPesanan + "|" +"\t" + pesanan[i].harga);
                    }
                    System.out.println("Semua Pesanan berhasil dicetak");
                    break;

                case 5:
                    int total = 0;
                    for (int i = 0; i < pesanSize; i++) {
                        total += pesanan[i].harga;
                    }
                    System.out.println("-------------------");
                    System.out.println("Total Pendapatan");
                    System.out.println("-------------------");
                    System.out.println("Pendapatan hari ini : " + total);
                    break;

                case 6:
                    System.out.println("Terima kasih");
                    break;
                
            }
        }
        while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
        
    }
}

