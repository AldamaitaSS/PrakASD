package pertemuan2;

public class PersegiPanjang5 {
    public int panjang;
    public int lebar;
    
    
    public static void main (String[] args) {
        PersegiPanjang5[][] ppArray = new PersegiPanjang5[2][3];

        ppArray[0][0] = new PersegiPanjang5();
        ppArray[0][0].panjang = 110;
        ppArray[0][0].lebar = 30;

        ppArray[0][1] = new PersegiPanjang5();
        ppArray[0][1].panjang = 80;
        ppArray[0][1].lebar = 40;

        ppArray[0][2] = new PersegiPanjang5();
        ppArray[0][2].panjang = 100;
        ppArray[0][2].lebar = 20;

        ppArray[1][0] = new PersegiPanjang5();
        ppArray[1][0].panjang = 50;
        ppArray[1][0].lebar = 60;

        ppArray[1][1] = new PersegiPanjang5();
        ppArray[1][1].panjang = 70;
        ppArray[1][1].lebar = 90;

        ppArray[1][2] = new PersegiPanjang5();
        ppArray[1][2].panjang = 120;
        ppArray[1][2].lebar = 25;

        System.out.println("Persegi Panjang ke-0, panjang : " + ppArray[0][0].panjang + ", lebar : " + ppArray[0][0].lebar);
        System.out.println("Persegi Panjang ke-1, panjang : " + ppArray[1][1].panjang + ", lebar : " + ppArray[1][1].lebar);
        System.out.println("Persegi Panjang ke-2, panjang : " + ppArray[2][2].panjang + ", lebar : " + ppArray[2][2].lebar);
    }
}

