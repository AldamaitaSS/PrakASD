public class DoublyLinkedListTugas1 {
    NodeTugas1 head;
    NodeTugas1 tail;
    int size;
    int nomor;

    public DoublyLinkedListTugas1() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String nama, int nomor) {
        if (isEmpty()) {
            NodeTugas1 node = new NodeTugas1(nama, nomor);
            head = node;
            tail = node;
        } else {
            NodeTugas1 node = new NodeTugas1(nama, nomor);
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public String remove() {
        if (isEmpty()) {
            return null;
        } else {
            String hapusNama = head.nama;
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            size--;
            return hapusNama;
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            NodeTugas1 current = head;
            System.out.println("========================");
            System.out.println("Daftar Pengantri Vaksin:");
            System.out.println("========================");

            System.out.println("| No.  |     Nama        |");

            int angka = 1;
            while (current != null) {
                System.out.printf("| %-4d | %-15s |\n", angka, current.nama);
                current = current.next;
                angka++;
            }

            System.out.println("+------+-----------------+");
            System.out.println("Sisa Antrian: " + size);
        } else {
            System.out.println("Antrian Vaksin Kosong");
        }
    }
}
