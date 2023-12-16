public class Matakuliah {
    
    String kode;
    String mataKuliah;
    int sks;

    public Matakuliah() {
    }

    public Matakuliah(String kode, String mataKuliah, int sks) {
        this.kode = kode;
        this.mataKuliah = mataKuliah;
        this.sks = sks;
    }

    @Override
    public String toString() {
        //return kode + "\t" + mataKuliah + "\t\t\t" + sks;
        return String.format("%s\t%-40s%s", kode, mataKuliah, sks);
    }
}
