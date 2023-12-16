import javax.xml.crypto.Data;

public class DataMahasiswa {
    String nim;
    String nama;
    String telp;

    public DataMahasiswa() {
    }

    public DataMahasiswa(String nim, String nama, String telp) {
        this.nim = nim;
        this.nama = nama;
        this.telp = telp;
    }

    @Override
    public String toString() {
        return nim + "\t" + nama + "\t\t" + telp;
    }
}
