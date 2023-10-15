public class tugas2 {
    
    String nomorTransaksi;
    String tanggalPembelian;
    int jumlahBarang;
    double totalHarga;
    String[] stack;
    int top;
    int maxSize;

    public tugas2(int size) {
        maxSize = size;
        stack = new String[maxSize];
        top = -1;
    }

    public boolean isEmpty() {
        if ( top == 1) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isFull() {
        if (top == maxSize - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(String item) {
        if (!isFull()) {
            stack[++top] = item;
            System.out.println("Struk Belanja ditambahkan ke stack.");
        } else {
            System.out.println("Stack penuh. Tidak bisa menambahkan struk belanja.");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            String x = stack[top];
            top--;
            System.out.println("Data yang keluar : " + x);
        } else {
            System.out.println("Stack struk belanja kosong.");
        }
    }

    public void peek() {
        System.out.println("\nStruk belanja teratas : " + stack[top]);
    }

    public void print() {
        System.out.println("\nDaftar Struk Belanja Dewi : ");
        for (int i = 0; i <= top; i++) {
            System.out.println("Nomor Transaksi: " + stack[i]);
        }
    }

    public void clear() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Semua struk belanja telah dihapus!");
        } else {
            System.out.println("Gagal! Stack masih kosong");
        }
    }

}
