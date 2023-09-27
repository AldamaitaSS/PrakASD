import java.util.Scanner;
public class T1OrderAMain {
    public static void main (String[] args) {
        Scanner al = new Scanner (System.in);

        double[] angka = {17, 20, 26, 33, 37, 41, 53, 65, 73, 83};

        OrderedSearch sal = new OrderedSearch(angka);
        System.out.println("Elemen array :    ");
        sal.tampilkan();

        double key = 41;
        int index = sal.cari(key);

        if (index!= -1) {
            System.out.print("Data " + key + " pada Index " + index);
        }else {
            System.out.println("Data " + key + " tidak ditemukan");
        }
    }
}
