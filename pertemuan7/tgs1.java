public class tgs1 {
    
    int max;
    int size;
    int front;
    int rear;
    int[] Q;

    public tgs1 (int n) {
        max = n;
        Create();
    }

    public void Create() {
        Q = new int [max];
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

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdapat : " + Q[front]);
        }
        else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        }
        else {
            int i = front;
            while (i != rear) {
                System.out.print(Q[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(Q[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        }
        else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(int data) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (size == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            Q[rear] = data;
            size++;
        }
        
    }

    public int Dequeue() {
        int data = 0;
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            data = Q[front];
            size--;
            if (!IsEmpty()) {
                front = (front + 1) % max;
            } else {
                front = rear = -1;
            }
        }
        return data;
    }

    public void peekPosition(int data) {
        if (!IsEmpty()) {
            for (int i = 0; i < size; i++) {
                if (Q[i] == data) {
                    System.out.println("Posisi data dengan nilai " + data + " adalah " + i);
                    return;
                }
            }
            System.out.println("Data dengan nilai " + data + " tidak ditemukan di dalam antrian.");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekAt(int position) {
        if (!IsEmpty() && position >= 0 && position < size) {
            System.out.println("Data pada posisi " + position + ": " + Q[(front + position) % max]);
        } else {
            System.out.println("Posisi tidak valid atau antrian masih kosong.");
        }
    }
}
