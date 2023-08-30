package pertemuan1;

public class laundry {
    public static void main(String[] args) {
        
        int[] berat = {4, 15, 6, 11};
        double hargaPerKilo = 4500;
        int diskonBerat = 10;
        double persentaseDiskon = 0.05;
        int total = 0;
        double totalKeseluruhan = 0;
        
        for (int i = 0; i < berat.length; i++) {
            total += berat[i] * hargaPerKilo;
            if (berat[i] > diskonBerat) {
                totalKeseluruhan = total - (total * persentaseDiskon);
            }
        }
        System.out.println ("Pendapatan yang diperoleh : " +totalKeseluruhan);
    
  
    }
    
    
}
