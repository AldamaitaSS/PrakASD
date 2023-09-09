package pertemuan2;

import java.util.Scanner;

public class MainTgsPer2 {
    public static void main(String[] args) {
        Scanner al = new Scanner(System.in);


        final int MAX_NASABAH = 5;

        TugasPer2[] nasabahArray = new TugasPer2[MAX_NASABAH];

        int jumlahNasabah = 0;

        boolean isExit = false;

        while (!isExit) {
            System.out.println("===========MENU==============================================");
            System.out.println("1. Buka Rekening");
            System.out.println("2. Lihat Saldo");
            System.out.println("3. Menabung");
            System.out.println("4. Tarik Tunai");
            System.out.println("5. Berhutang");
            System.out.println("6. Tutup Rekening");
            System.out.println("7. Keluar");
            System.out.print("Pilih tindakan (1-7): ");
            int choice = al.nextInt();
            System.out.println("=============================================================");

            switch (choice) {
                case 1:
                    if (jumlahNasabah < MAX_NASABAH) {
                        System.out.print("Masukkan nama: ");
                        String nama = al.next();
                        System.out.print("Masukkan alamat: ");
                        String alamat = al.next();
                        System.out.print("Masukkan nomor HP: ");
                        int noHP = al.nextInt();

                        TugasPer2 nasabahBaru = new TugasPer2(noHP, nama, alamat, noHP);
                        nasabahBaru.bukaRekening();
                        nasabahArray[jumlahNasabah] = nasabahBaru;

                        jumlahNasabah++;
                    } else {
                        System.out.println("Kapasitas maksimum nasabah telah tercapai.");
                    }
                    break;
                case 2:
                    System.out.print("Masukkan nomor rekening: ");
                    int noRekLihatSaldo = al.nextInt();
                    boolean found = false;
                    for (int i = 0; i < jumlahNasabah; i++) {
                        int saldo = nasabahArray[i].lihatSaldo(noRekLihatSaldo);
                        if (saldo >= 0) {
                            System.out.println("Saldo Anda: " + saldo);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Nomor rekening tidak ditemukan.");
                    }
                    break;
                case 3:
                    System.out.print("Masukkan nomor rekening: ");
                    int noRekMenabung = al.nextInt();
                    boolean foundMenabung = false;
                    for (int i = 0; i < jumlahNasabah; i++) {
                        int saldo = nasabahArray[i].menabung(noRekMenabung, 0);
                        if (saldo >= 0) {
                            System.out.print("Masukkan jumlah yang ingin ditabung: ");
                            int deposit = al.nextInt();
                            int saldoBaru = nasabahArray[i].menabung(noRekMenabung, deposit);
                            if (saldoBaru >= 0) {
                                System.out.println("Penabungan berhasil. Saldo Anda sekarang: " + saldoBaru);
                            }
                            foundMenabung = true;
                            break;
                        }
                    }
                    if (!foundMenabung) {
                        System.out.println("Nomor rekening tidak ditemukan.");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nomor rekening: ");
                    int noRekTarikTunai = al.nextInt();
                    boolean foundTarikTunai = false;
                    
                    for (int i = 0; i < jumlahNasabah; i++) {
                        int saldo = nasabahArray[i].tarikTunai(noRekTarikTunai, 0);
                        if (saldo >= 0) {
                            System.out.print("Masukkan jumlah yang ingin ditarik: ");
                            int withdrawal = al.nextInt();
                            int saldoBaru = nasabahArray[i].tarikTunai(noRekTarikTunai, withdrawal);
                            if (saldoBaru >= 0) {
                                System.out.println("Penarikan berhasil. Saldo Anda sekarang: " + saldoBaru);
                            }
                            foundTarikTunai = true;
                            break;
                        }
                    }
                    
                    if (!foundTarikTunai) {
                        System.out.println("Nomor rekening tidak ditemukan.");
                    }
                    break;
                case 5:
                    System.out.print("Masukkan nomor rekening: ");
                    int noRekBerhutang = al.nextInt();
                    boolean foundBerhutang = false;
                    
                    for (int i = 0; i < jumlahNasabah; i++) {
                        int saldo = nasabahArray[i].lihatSaldo(noRekBerhutang);
                        if (saldo >= 0) {
                            System.out.print("Masukkan jumlah hutang: ");
                            float hutang = al.nextFloat();
                            nasabahArray[i].berhutang(hutang);
                            foundBerhutang = true;
                            break;
                        }
                    }
                    
                    if (!foundBerhutang) {
                        System.out.println("Nomor rekening tidak ditemukan.");
                    }
                    break;
                case 6:
                    System.out.print("Masukkan nomor rekening: ");
                    int noRekTutup = al.nextInt();
                    boolean foundTutup = false;

                    for (int i = 0; i < jumlahNasabah; i++) {
                        nasabahArray[i].tutupRekening(noRekTutup);
                        foundTutup = true;
                        break; 
                    }

                    if (!foundTutup) {
                        System.out.println("Nomor rekening tidak ditemukan.");
                    }
                break;
                case 7:
                    isExit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
                    break;

            }        
        }
    }
}    