package pertemuan2;

public class Balok {
    public int panjang;
    public int lebar;
    public int tinggi;

    public Balok (int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public int hitungVolume () {
        return panjang * lebar * tinggi;
    }

    public static void main (String[] args) {
        Balok[] blArray = new Balok [3];

        blArray[0] = new Balok (100, 30, 12);
        blArray[1] = new Balok (120, 40, 15);
        blArray[2] = new Balok (210, 50, 25);

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume balok ke " + i + " : " + blArray[i].hitungVolume());
        }
        segitiga al = new segitiga (5, 8);
        System.out.println("Luas segitiga : " +segitiga.hitungLuas());
        System.out.println("Keliling segitiga : " + segitiga.hitugKeliling());
    }

}
