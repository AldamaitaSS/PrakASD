public class Bom {
    
    public int xc;
    public int yc;
    public int[][] posisiMusuh;
    public int[] radiusBom;

    Bom() {
        // Kode konstruktor default di sini
        xc = 0; // Inisialisasi xc dengan nilai default yang sesuai
        yc = 0; // Inisialisasi yc dengan nilai default yang sesuai
        posisiMusuh = new int[0][0]; // Inisialisasi posisiMusuh dengan array kosong atau nilai default yang sesuai
        radiusBom = new int[0]; // Inisialisasi radiusBom dengan array kosong atau nilai default yang sesuai
    }

    int[] hitungMusuhTerkena() {
        int N = posisiMusuh.length;
        int Q = radiusBom.length;

        int[] hasil = new int[Q];

        // Menghitung jumlah karakter musuh yang terkena ledakan untuk setiap jenis bom
        for (int i = 0; i < Q; i++) {
            int r = radiusBom[i];
            int count = 0;

            // Memeriksa setiap karakter musuh
            for (int j = 0; j < N; j++) {
                int x = posisiMusuh[j][0];
                int y = posisiMusuh[j][1];

                // Menghitung jarak antara karakter musuh dan titik bom
                double jarak = Math.sqrt((x - xc) * (x - xc) + (y - yc) * (y - yc));

                // Jika karakter berada dalam atau tepat di keliling lingkaran bom, tambahkan ke count
                if (jarak <= r) {
                    count++;
                }
            }

            hasil[i] = count;
        }

        return hasil;
    }
}
