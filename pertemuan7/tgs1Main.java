import java.util.Scanner;

public class tgs1Main {

    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Peek Position");
        System.out.println("6. Peek At");
        System.out.println("7. Clear");
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {

        Scanner al = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue : ");
        int n = al.nextInt();

        tgs1 Q = new tgs1(n);

        int pilih;
        do {
            menu();
            pilih = al.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru : ");
                    int dataMasuk = al.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.print("Data yang dikeluarkan : " + dataKeluar);
                    }
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                    case 5:
                    System.out.print("Masukkan data yang dicari : ");
                    int dataCari = al.nextInt();
                    Q.peekPosition(dataCari);
                    break;
                case 6:
                    System.out.print("Masukkan posisi yang ingin dilihat : ");
                    int posisi = al.nextInt();
                    Q.peekAt(posisi);
                    break;
                case 7:
                    Q.clear();
                    break;

            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5  || pilih == 6 || pilih == 7);
    }
}
