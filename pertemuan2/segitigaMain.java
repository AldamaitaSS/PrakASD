package pertemuan2;

public class segitigaMain {
    public static void main(String[] args) {
        
        segitiga[] sgArray = new segitiga[4];
        sgArray[0] = new segitiga(10, 4);
        sgArray[1] = new segitiga(20, 10);
        sgArray[2] = new segitiga(15, 6);
        sgArray[3] = new segitiga(25, 10);

       
        for (int i = 0; i < sgArray.length; i++) {
            System.out.println("sgArray ke-" + i + "\talas: " + sgArray[i].alas + ", tinggi: " + sgArray[i].tinggi);
            double luas = sgArray[i].hitungLuas();
            double keliling = sgArray[i].hitungKeliling();
            System.out.println("Luas: " + luas);
            System.out.println("Keliling: " + keliling);
            System.out.println();
        }
    }
}
