public class nasabah {
    
    String nama, alamat, nomorRekening;
    nasabah next;


    public nasabah (String namna, String alamat, String nomorRekening) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorRekening = nomorRekening;
        this.next = null;

    }

    public void display() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Nomor Rekening: " + nomorRekening);
    }
}
