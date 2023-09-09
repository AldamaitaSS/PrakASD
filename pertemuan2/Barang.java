package pertemuan2;

public class Barang {
    private String kodeBarang;
    private String namaBarang;
    private int harga;

    public Barang(String kodeBarang, String namaBarang, int harga) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.harga = harga;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Kode Barang: " + kodeBarang +
               "\nNama Barang: " + namaBarang +
               "\nHarga: " + harga;
    }

    public static void main (String[] args) {
        Barang film3 = new Barang("B001", "PopCorn", 50000);
        System.out.println(film3.toString());
    }
    


}
