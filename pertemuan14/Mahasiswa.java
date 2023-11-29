public class Mahasiswa {
    
    String namaLengkap, nim;
    String programStudi, jurusan;

    public Mahasiswa(String nim, String namaLengkap, String programStudi, String jurusan ){

        this.nim = nim;
        this.namaLengkap = namaLengkap;
        this.programStudi = programStudi;
        this.jurusan = jurusan;
    }

   
    public String getNim() {
        return nim;
    }    
}
