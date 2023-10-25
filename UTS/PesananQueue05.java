import java.util.Arrays;
import java.util.Comparator;

public class PesananQueue05 {
   
    Pesanan05[] pesanan;
    int front;
    int rear;
    int size;
    int max;

    public PesananQueue05(int n) {
        max = n;
        pesanan = new Pesanan05 [max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(Pesanan05 pesan) {
        if(IsFull()) {
            System.out.println("Pesanan sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max -1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            pesanan[rear] = pesan;
            size++;
        }
    }

    public Pesanan05 dequeue() {
        Pesanan05 pesan = new Pesanan05(front, front, null);
        if (IsEmpty()) {
            System.out.println("Pesanan masih kosong");
        } else {
            pesan = pesanan[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max -1) {
                    front = 0;
                } else {
                    front++;
                }
            }
            
        }
        return pesan;
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Pesanan masih kosong");
        } else {
            Pesanan05[] pesananArray = new Pesanan05[size];
            int i = front;
            int index = 0;
    
            while (i != rear) {
                pesananArray[index] = pesanan[i];
                i = (i + 1) % max;
                index++;
            }
            pesananArray[index] = pesanan[i];
    
            Arrays.sort(pesananArray, (a, b) -> a.namaPesanan.compareTo(b.namaPesanan)); 
             
            System.out.println("---------------------------------------");
            System.out.println("Daftar Pesanan Masuk Resto Royal Delish");
            System.out.println("---------------------------------------");
            System.out.println("| No |    Nama Pesanan  |   Harga  |");
            System.out.println("---------------------------------------");
                for (i = 0; i < pesananArray.length; i++) {
                    System.out.println("|" + pesanan[i].kodePesanan + "|" + "\t" + pesanan[i].namaPesanan + "|" +"\t" + pesanan[i].harga);
                }
                System.out.println("Semua Pesanan berhasil dicetak");
        }
    }

    public int total() {
        int total = 0;
        if (IsEmpty()) {
            System.out.println("Pesanan masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                total += pesanan[i].harga;
                i = (i + 1) % max;
            }
            total += pesanan[i].harga;
        }
        return total;
    }
}

