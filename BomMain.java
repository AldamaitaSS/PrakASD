import java.util.Scanner;

public class BomMain {
    public static void main(String[] args) {
        Scanner al = new Scanner(System.in);

        System.out.print("Masukkan koordinat lokasi jatuhnya bom : ");
        int xc = al.nextInt();
        int yc = al.nextInt();

        System.out.println("----------------------------------------------------------");
        System.out.print("Masukkan jumlah karakter musuh : ");
        int N = al.nextInt();

        System.out.println("----------------------------------------------------------");
        System.out.println("Masukkan koordinat karakter musuh (x y) : ");
        int[][] musuh = new int[N][2];
        for (int i = 0; i < N; i++) {
            musuh[i][0] = al.nextInt();
            musuh[i][1] = al.nextInt();
        }

        System.out.println("----------------------------------------------------------");
        System.out.print("Masukkan jumlah jenis bom : ");
        int Q = al.nextInt();

        System.out.println("----------------------------------------------------------");
        System.out.println("Masukkan jari-jari lingkaran jangkauan setiap jenis bom : ");
        int[] radiusBom = new int[Q];
        for (int i = 0; i < Q; i++) {
            radiusBom[i] = al.nextInt();
        }

        // Membuat objek Bom
        Bom bom = new Bom();
        bom.xc = xc;
        bom.yc = yc;
        bom.posisiMusuh = musuh;
        bom.radiusBom = radiusBom;

        // Menggunakan metode hitungMusuhTerkena dari objek Bom
        int[] hasil = bom.hitungMusuhTerkena();

        System.out.println("==========================================================");
        System.out.println("                           Hasil                          ");
        System.out.println("----------------------------------------------------------");
        // Menampilkan jumlah karakter musuh yang terkena ledakan untuk setiap jenis bom
        for (int i = 0; i < Q; i++) {
            System.out.println("Jumlah karakter musuh yang terkena ledakan bom " + (i + 1) + " : " + hasil[i]);
        }
    }
}
