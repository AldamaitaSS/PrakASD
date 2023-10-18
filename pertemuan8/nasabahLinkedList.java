public class nasabahLinkedList {
    nasabah head;
    int size;
    int maxSize;

  
    public nasabahLinkedList(int maxSize) {
        this.maxSize = maxSize;
    }

    public boolean isFull() {
        return size == maxSize;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(String nama, String alamat, String nomorRekening) {
        if (!isFull()) {
            nasabah nb = new nasabah(nama, alamat, nomorRekening);
            nb.next = null;

            if (isEmpty()) {
                head = nb;
            } else {
                nasabah current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = nb;
            }

            size++;
            System.out.println("Nasabah " + nama + " telah ditambahkan ke antrian.");
        } else {
            System.out.println("Antrian penuh. Tidak dapat menambahkan lebih banyak nasabah.");
        }
    }

    public nasabah dequeue() {
        if (!isEmpty()) {
            nasabah nasabah = head;
            head = head.next;
            size--;
            System.out.println("Nasabah " + nasabah.nama + " telah dikeluarkan dari antrian.");
            return nasabah;
        } else {
            System.out.println("Antrian kosong. Tidak ada nasabah yang dapat dikeluarkan.");
            return null;
        }
    }

    public void displayList() {
        nasabah current = head;
        while (current != null) {
            current.display();
            System.out.println("===================================================");
            current = current.next;
        }
    }
}
