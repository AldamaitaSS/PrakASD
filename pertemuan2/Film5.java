package pertemuan2;

public class Film5 {
    String judul, genre, rate;
    int jumlahTiket, hargaTiket;

    Film5() {
    
    }
    Film5(String jd, String gr, String rt, int jt, int ht) {
        judul = jd;
        genre = gr;
        rate = rt;
        jumlahTiket = jt;
        hargaTiket = ht;
    }
    void tampilFilm() {
        System.out.println("Judul : "+judul);
        System.out.println("Genre : "+genre);
        System.out.println("Rate : "+rate);
        System.out.println("Jumlah Tiket : "+jumlahTiket);
        System.out.println("Harga Tiket : "+hargaTiket);
    }
    void tambahTiket(int n) {
        jumlahTiket += n;
    }
    void kurangiTiket(int n) {
        if (jumlahTiket > 0) {
            jumlahTiket -= n;
        } else {
            System.out.println ("Stok Habis!");
        }
    }
    int totalRevenue(int jumlah) {
        return jumlah * hargaTiket;
    }

}
