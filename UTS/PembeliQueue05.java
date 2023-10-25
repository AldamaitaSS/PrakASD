
public class PembeliQueue05 {
    int max;
    int size;
    int front;
    int rear;
    Pembeli05 [] Q;


    public PembeliQueue05(int n){
        max = n;
        Q = new Pembeli05 [max];
        size = 0;
        front = rear = -1;
    }

    public void Create(){
        Q = new Pembeli05[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty(){
        if(size==0){
            return true;
        } else{
            return false;
        }
    }

    public boolean IsFull(){
         if(size==max){
            return true;
        } else{
            return false;
        }
    }

    public void Peek(){
        if (!IsEmpty()){
            System.out.println("Elemen terdepan: "+Q[front].noAntrian+" "+Q[front].namaPembeli+" "+Q[front].NoHp+" ");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Print(){
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            System.out.println("Daftar Pembeli:");
            int i = front;
            while (i != rear) {
                System.out.println("No. antri | Nama | No HP");
                System.out.println(Q[i].noAntrian + "\t" + Q[i].namaPembeli + "\t" + Q[i].NoHp);
                i = (i + 1) % max;
                ;
            }
            System.out.println("Nomor | Nama | No HP");
            System.out.println(Q[i].noAntrian + "\t" + Q[i].namaPembeli + "\t" + Q[i].NoHp);
        }

        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i!=rear){
                System.out.println(Q[i].noAntrian+" "+Q[i].namaPembeli+" "+Q[i].NoHp);
                i=(i+1)%max;
            }
            System.out.println(Q[i]+" ");
            System.out.println("Jumlah elemen = "+size);
        }
    }

    public void Clear(){
        if(!IsEmpty()){
            front=rear=-1;
            size=0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println( "Queue masih kosong ");
        }
    }

    public void Enqueue(Pembeli15 data) {
        if(IsFull()) {
            System.out.println("Antrian sudah penuh");
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
            Q[rear] = data;
            size++;
        }
    }

    public Pembeli15 Dequeue(){
        Pembeli05 data = new Pembeli05(max, null, null);
        if (IsEmpty()){
            System.out.println("Queue masih kosong");
        } else{
            data = Q[front];
            size--;
            if (IsEmpty()){
                front = rear = -1;
            } else {
                if(front==max-1){
                    front =0;
                }else{
                    front++;
                }
            }
        }
        return data;
    }   
}

