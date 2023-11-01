public class NodeTugas1 {

    int data, nomor;
    String nama;
    NodeTugas1 next, prev;

    public NodeTugas1(String nama, int nomor) {
        this.nama = nama;
        this.next = null;
        this.prev = null;
        this.nomor = nomor;
    }
}
