import java.util.Scanner;
public class PencarianMain {
    public static void main (String[] args) {
        Scanner al = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah elemen dalam array: ");
        int jumlahElemen = al.nextInt();

        double[] data = new double [jumlahElemen];

        System.out.println("Masukkan elemen-elemen array secara berurutan:");
        for (int i = 0; i < jumlahElemen; i++) {
            data[i] = al.nextDouble();
        }
        
        OrderedSearch sal = new OrderedSearch(data);
        System.out.println("Isi elemen array :    ");
        sal.tampilkan();

        double key = 3.12;
        int index = sal.cari(key);

        if (index!= -1) {
            System.out.print("Data " + key + " pada Index " + index);
        }else {
            System.out.println("Data " + key + " tidak ditemukan");
        }
    }
}
