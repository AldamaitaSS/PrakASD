public class QueueTgs2 {
    
    int max;
    int size;
    int front;
    int rear;
    Mahasiswa[] antrian;

    public QueueTgs2 (int max) {
        this.max = max ;
        Create();
    }

    public void Create() {
        antrian = new Mahasiswa[max];
        size =0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        }
        else {
            return false;
        }
    }

    public void Enqueue(Mahasiswa data) {
        if (!IsFull()) {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = data;
            size++;
        } else {
            System.out.println("Antrian sudah penuh.");
        }
        
    }

    public int Dequeue() {
        if (!IsEmpty()) {
            Mahasiswa data = antrian[front];
            size--;
            if (front == max - 1) {
                front = 0;
            } else {
                front++;
            }
            return 1;
        }
        return 0;
    }

    public void print() {
        if (!IsEmpty()) {
            int i = front;
            while (i != rear) {
                System.out.println("NIM: " + antrian[i].nim);
                System.out.println("Nama: " + antrian[i].nama);
                System.out.println("Absen: " + antrian[i].absen);
                System.out.println("IPK: " + antrian[i].ipk);
                System.out.println("--------------------------");
                i = (i + 1) % max;
            }
            System.out.println("NIM: " + antrian[i].nim);
            System.out.println("Nama: " + antrian[i].nama);
            System.out.println("Absen: " + antrian[i].absen);
            System.out.println("IPK: " + antrian[i].ipk);
            System.out.println("--------------------------");
        } else {
            System.out.println("Antrian masih kosong.");
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("NIM: " + antrian[front].nim);
            System.out.println("Nama: " + antrian[front].nama);
            System.out.println("Absen: " + antrian[front].absen);
            System.out.println("IPK: " + antrian[front].ipk);
        } else {
            System.out.println("Antrian masih kosong.");
        }
    }

    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("NIM: " + antrian[rear].nim);
            System.out.println("Nama: " + antrian[rear].nama);
            System.out.println("Absen: " + antrian[rear].absen);
            System.out.println("IPK: " + antrian[rear].ipk);
        } else {
            System.out.println("Antrian masih kosong.");
        }
    }

    public void peekPosition(String nim) {
        if (!IsEmpty()) {
            for (int i = 0; i < size; i++) {
                if (antrian[i].nim.equals(nim)) {
                    System.out.println("Posisi Mahasiswa dengan NIM " + nim + " adalah " + i);
                    return;
                }
            }
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan dalam antrian.");
        } else {
            System.out.println("Antrian masih kosong.");
        }
    }

    public void printMahasiswa(int posisi) {
        if (!IsEmpty() && posisi >= 0 && posisi < size) {
            System.out.println("NIM: " + antrian[(front + posisi) % max].nim);
            System.out.println("Nama: " + antrian[(front + posisi) % max].nama);
            System.out.println("Absen: " + antrian[(front + posisi) % max].absen);
            System.out.println("IPK: " + antrian[(front + posisi) % max].ipk);
        } else {
            System.out.println("Posisi tidak valid atau antrian masih kosong.");
        }
    }

}
