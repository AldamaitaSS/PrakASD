public class PengurutanBuku {
    
    public static void bubbleSortUkuranBuku(Buku[] bukuArr) {
        int n = bukuArr.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (bukuArr[i].UkuranBuku > bukuArr[i + 1].UkuranBuku) {
                    // Tukar posisi buku
                    Buku temp = bukuArr[i];
                    bukuArr[i] = bukuArr[i + 1];
                    bukuArr[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static void selectionSortJumlahHalaman(Buku[] bukuArr) {
        int n = bukuArr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (bukuArr[j].JumlahHalaman < bukuArr[minIdx].JumlahHalaman) {
                    minIdx = j;
                }
            }

            // Tukar posisi buku
            Buku temp = bukuArr[minIdx];
            bukuArr[minIdx] = bukuArr[i];
            bukuArr[i] = temp;
        }
    }
}
