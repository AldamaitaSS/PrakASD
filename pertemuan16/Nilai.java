import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Nilai {
    double nilai;
    String kodeNilai;
    DataMahasiswa mahasiswa;
    Matakuliah mk;

    public Nilai(String kodeNilai, double nilai, DataMahasiswa mahasiswa, Matakuliah mk) {
        this.nilai = nilai;
        this.kodeNilai = kodeNilai;
        this.mahasiswa = mahasiswa;
        this.mk = mk;
    }

    List<DataMahasiswa> mhs = new ArrayList<>();
    List<Matakuliah> MKuliah = new ArrayList<>();
    //queue
    private Queue<DataMahasiswa> mhsQueue = new LinkedList<>();
    
    public void tambahMhs(DataMahasiswa... mahasiswa){
        mhs.addAll(Arrays.asList(mahasiswa));
        // queue
        mhsQueue.addAll(Arrays.asList(mahasiswa));
    }
    
    public void tambahMatkul(Matakuliah... matkul){
        MKuliah.addAll(Arrays.asList(matkul));
    }

    public void tampilMhs() {
        mhs.forEach(mahasiswa -> {
            System.out.println(mahasiswa.toString());
        });
    }

    public void tampilMatkul(){
        MKuliah.stream().forEach(mk -> {
                System.out.println("" + mk.toString());
        });
    }

    int linearSearchMhs(String nim){
            for(int i = 0; i < mhs.size(); i++){ 
                if(nim.equals(mhs.get(i).nim)){
                    return i;
                }
            }
            return -1;
    }
    
    int linearSearchMatkul(String matkul){
            for(int i = 0; i < MKuliah.size(); i++){ 
                if(matkul.equals(MKuliah.get(i).kode)){
                    return i;
                }
            }
            return -1;
    }
    
    DataMahasiswa cariMhs(String nim){
        for(int i = 0; i < mhs.size(); i++){
            if(nim.equals(mhs.get(i).nim)){
                return mhs.get(i);
            }
        }
        return null;
    }
   
    Matakuliah cariMatkul(String matkul){
        for(int i = 0; i < MKuliah.size(); i++){
            if(matkul.equals(MKuliah.get(i).kode)){
                return MKuliah.get(i);
            }
        }
        return null;
    }

    public String toString(int idx1, int idx2){
        return mhs.get(idx1).nim + "\t" + mhs.get(idx1).nama + "\t" + MKuliah.get(idx2).mataKuliah + "\t" + MKuliah.get(idx2).sks + "\t";
    }
    
    //Tugas no 2
    public void hapusMhs() {
        if (!mhsQueue.isEmpty()) {
            DataMahasiswa removedMhs = mhsQueue.poll();
            System.out.println("Removed student: " + removedMhs.toString());
        } else {
            System.out.println("Queue is empty. No student to remove.");
        }
    }

    static Comparator<Nilai> CompNilai = (n1, n2) ->{
        if(n1.nilai < n2.nilai){
            return -1;
        } else if (n1.nilai > (n2).nilai){
            return 1;
        } else {
            return 0;
        }
    };

    public static void main (String [] args) { 
        //int pilihan = 0;
        
        Scanner al = new Scanner(System.in);
        List<Nilai> nilai = new ArrayList<>();
        Nilai n = new Nilai(null, 0, null, null);
        
        DataMahasiswa m1 = new DataMahasiswa("20001", "Thalhah", "021xxx");
        DataMahasiswa m2 = new DataMahasiswa("20002", "Zubair", "021xxx");
        DataMahasiswa m3 = new DataMahasiswa("20003", "Abdulah", "021xxx");
        DataMahasiswa m4 = new DataMahasiswa("20004", "Sa'ad", "021xxx");
        DataMahasiswa m5 = new DataMahasiswa("20005", "Sa'id", "021xxx");
        DataMahasiswa m6 = new DataMahasiswa("20006", "Ubaidah", "021xxx");

        n.tambahMhs(m1, m2, m3, m4, m5, m6);

        Matakuliah mk1 = new Matakuliah("00001", "Internet of Things", 3);
        Matakuliah mk2 = new Matakuliah("00002", "Algoritma dan Struktur Data", 2);
        Matakuliah mk3 = new Matakuliah("00003", "Algoritma dan Pemrograman", 2);
        Matakuliah mk4 = new Matakuliah("00004", "Praktikum Algoritma dan Struktur Data", 2);
        Matakuliah mk5 = new Matakuliah("00005", "Praktikum Algoritma dan Pemrograman", 3);
        Matakuliah mk6 = new Matakuliah("00006", "Internet of Things", 3);

        n.tambahMatkul(mk1, mk2, mk3, mk4, mk5, mk6);
        
        Nilai nl = null;
        int pilihan = 0;
        do {
            System.out.println("===============================================");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("===============================================");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Hapus Mahasiswa");
            System.out.println("6. Keluar");
            System.out.println("=============================");
            System.out.print("Pilih: ");
            pilihan = al.nextInt();
            System.out.print("\n");

            switch (pilihan) {
                case 1:
                System.out.println("Masukkan data ");
                System.out.print("Kode: ");
                String kode = al.next();
                System.out.print("Nilai: ");
                double nilaiMhs = al.nextDouble();
                System.out.println("");

                System.out.println("*********************************************");
                System.out.println("              DAFTAR MAHASISWA               ");
                System.out.println("*********************************************");
                System.out.println("NIM\tNama\t\tTelf");
                n.tampilMhs();

                System.out.println("---------------------------------------------");
                System.out.print("Pilih mahasiswa by nim: ");
                String nim = al.next();
                DataMahasiswa mahasiswa;
                mahasiswa = n.cariMhs(nim);

                System.out.println("\n*********************************************");
                System.out.println("              DAFTAR MATA KULIAH             ");
                System.out.println("*********************************************");
                System.out.println("Kode\tMata Kuliah\t\t\t\tSKS");
                n.tampilMatkul();

                System.out.println("---------------------------------------------");
                System.out.print("Pilih MK by kode: ");
                String kodes = al.next();
                Matakuliah mataKuliahs;
                mataKuliahs = n.cariMatkul(kodes);

                nl = new Nilai (kodes, nilaiMhs, mahasiswa, mataKuliahs);

                nilai.add(nl);
                System.out.println("");

                break;

                case 2:
                System.out.println("**************************************************************");
                System.out.println("                      DAFTAR NILAI MAHASISWA                  ");
                System.out.println("**************************************************************");
                System.out.println("NIM\tNama\tMata Kuliah\t\tSKS\tNilai");
                    for(int i=0; i<nilai.size(); i++){
                        n.linearSearchMhs(nilai.get(i).mahasiswa.nim);
                        n.linearSearchMatkul(nilai.get(i).mk.kode);
                        System.out.println(n.toString(n.linearSearchMhs(nilai.get(i).mahasiswa.nim), n.linearSearchMatkul(nilai.get(i).mk.kode))+ nilai.get(i).nilai);
                    }
                    System.out.println("");
                break;

                case 3:
                System.out.println("**************************************************************");
                System.out.println("                      DAFTAR NILAI MAHASISWA                  ");
                System.out.println("**************************************************************");
                System.out.println("NIM\tNama\tMata Kuliah\t\tSKS\tNilai");
                    int sks = 0;
                    for(int i=0; i<nilai.size(); i++){
                        n.linearSearchMhs(nilai.get(i).mahasiswa.nim);
                        n.linearSearchMatkul(nilai.get(i).mk.kode);
                        System.out.println(n.toString(n.linearSearchMhs(nilai.get(i).mahasiswa.nim), n.linearSearchMatkul(nilai.get(i).mk.kode))+ nilai.get(i).nilai);
                    }
                    
                    System.out.println("----------------------------------------------------------");
                    System.out.print("Masukkan Data Mahasiswa NIM : ");
                    String input = al.next();
                    System.out.println("----------------------------------------------------------");
                    for (int i = 0; i < nilai.size(); i++){
                        if(input.equalsIgnoreCase(nilai.get(i).mahasiswa.nim)){
                            sks += n.MKuliah.get(i).sks;
                            n.linearSearchMhs(nilai.get(i).mahasiswa.nim);
                            n.linearSearchMatkul(nilai.get(i).mk.kode);
                            System.out.println(n.toString(n.linearSearchMhs(nilai.get(i).mahasiswa.nim), n.linearSearchMatkul(nilai.get(i).mk.kode)) + nilai.get(i).nilai);    
                        }
                    }
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Total SKS " + sks + " Telah Diambil");
                    System.out.println("----------------------------------------------------------");
                break;

                case 4:
                
                    System.out.println("**************************************************************");
                    System.out.println("                      DAFTAR NILAI MAHASISWA                  ");
                    System.out.println("**************************************************************");
                    System.out.println("NIM\tNama\tMata Kuliah\t\tSKS\tNilai");
                    nilai.sort(CompNilai);
                    for (int i = 0; i < nilai.size(); i++){
                        n.linearSearchMhs(nilai.get(i).mahasiswa.nim);
                        n.linearSearchMatkul(nilai.get(i).mk.kode);
                        System.out.println(n.toString(n.linearSearchMhs(nilai.get(i).mahasiswa.nim), n.linearSearchMatkul(nilai.get(i).mk.kode)) + nilai.get(i).nilai);
                    }
                    System.out.println("");
                    break;

                case 5:
                    n.hapusMhs();
                    break;

                case 6:
                System.out.println("Terimakasih!");
                break;

                default:
                System.out.println("Pilihan tidak valid!");
                break;
            }
        } while (pilihan != 7);
    } 

}
