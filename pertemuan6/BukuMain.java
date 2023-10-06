public class BukuMain {
    public static void main(String[] args) {
        
        Buku[] bukuArr = new Buku[4];
        
        bukuArr[0] = new Buku("Algoritma pemrograman", 1292, 25);
        bukuArr[1] = new Buku("Basis data", 400, 29.7);
        bukuArr[2] = new Buku("Dasar Pemrograman", 294, 50);
        bukuArr[3] = new Buku("Rekayasa Perangkat Lunak", 824, 70.7);

        System.out.println("Data sebelum pengurutan:");
        System.out.println("------------------------------------------");
        for (Buku buku : bukuArr) {
            System.out.println("Judul: " + buku.judul);
            System.out.println("Ukuran: " + buku.UkuranBuku );
            System.out.println("Jumlah Halaman: " + buku.JumlahHalaman );
            System.out.println("------------------------------------------");
        }

        PengurutanBuku.bubbleSortUkuranBuku(bukuArr);

        System.out.print("===================================================================");
        System.out.println("\nData setelah pengurutan berdasarkan Ukuran Buku (Bubble Sort) ");
        System.out.println("------------------------------------------");
        for (Buku buku : bukuArr) {
            System.out.println("Judul: " + buku.judul);
            System.out.println("Ukuran: " + buku.UkuranBuku );
            System.out.println("Jumlah Halaman: " + buku.JumlahHalaman );
            System.out.println("------------------------------------------");
        
        }

        PengurutanBuku.selectionSortJumlahHalaman(bukuArr);

        System.out.print("=========================================================================");
        System.out.println("\nData setelah pengurutan berdasarkan Jumlah Halaman (Selection Sort) ");
        System.out.println("------------------------------------------");
        for (Buku buku : bukuArr) {
            System.out.println("Judul: " + buku.judul);
            System.out.println("Ukuran: " + buku.UkuranBuku );
            System.out.println("Jumlah Halaman: " + buku.JumlahHalaman );
            System.out.println("------------------------------------------");
        
        }

    }
}
