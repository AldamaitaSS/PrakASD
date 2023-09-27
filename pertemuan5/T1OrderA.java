public class T1OrderA {
    public double[] nilai;

    
    public T1OrderA(double arrayNilai[]) {
        nilai = new double[arrayNilai.length];
        for (int i = 0; i < nilai.length; i++) {
            nilai[i] = arrayNilai[i];
            
        }
    }

    public int cari (double diketahui) {
        int index = -1;
        for (int i = 0; i < nilai.length; i++) {
            if (diketahui == nilai[i]) {
                index = i;
                break;
            } else {
                if (diketahui < nilai [i]) {
                    break;
                    
                }
            }
            
        }
        return index;

    }

    public void tampilkan() {
        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i] + " ");
        }
        System.out.println(" ");
    }
}
