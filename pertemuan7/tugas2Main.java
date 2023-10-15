import java.util.Scanner;

public class tugas2Main {
    public static void main (String[] args) {
        tugas2 stack = new tugas2(8); 
        Scanner al = new Scanner(System.in);

        for (int i = 1; i <= 8; i++) {
            System.out.println("Masukkan data untuk Struk Belanja ke-" + i);
            System.out.print("Nomor Transaksi: ");
            String nomorTransaksi = al.nextLine();
            stack.push(nomorTransaksi);
        }

        stack.print();

        System.out.println("\nMengambil lima struk belanja untuk ditukarkan dengan voucher belanja:");
        for (int i = 0; i < 5; i++) {
            
            stack.pop();
            
        }

        stack.peek();
        stack.print();
        

        
    
    }
    

}
