package pertemuan1;
import java.util.Scanner;
public class bukanKelipt4 {
    public static void main(String[] args) {
        Scanner al = new Scanner (System.in);
        
        System.out.print("Masukkan angka : ");
        int angka = al.nextInt();
        
        for (int i= 2; i < angka; i++) {
            if (i % 4 != 0) {
                System.out.print(i + " ");
            }
        }
        
      }
}
