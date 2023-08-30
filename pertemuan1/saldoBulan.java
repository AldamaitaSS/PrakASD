package pertemuan1;

public class saldoBulan {
    public static void main(String[] args) {
        double uang = 1000000; 
        double target = 1500000; 
        double bunga = 0.02; 
        
        int months = 0; 
        
        while (uang < target) {
            uang += uang * bunga; 
            months++; 
            
            System.out.println("Bulan " + months + ": Saldo = Rp. " + uang);
        }
        
        System.out.println("Saldo mencapai 1,5 juta pada bulan ke-" + months);
    }
}
