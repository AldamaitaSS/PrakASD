public class Paskibra {
    String nama;
    String kelas;
    int tinggi;

    Paskibra (String a, String b, int c) {
        nama = a;
        kelas = b;
        tinggi = c;
    }

    void tampilIdentitas () {
        System.out.println("Nama = "+nama);
        System.out.println("Kelas = "+kelas);
        System.out.println("Tinggi = "+tinggi);
    }
}
