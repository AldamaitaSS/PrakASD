package pertemuan1;

public class tokoBunga {
    public static void main(String[] args) {
        int[][] stock = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        int[] harga = {75000, 50000, 60000, 10000};

        
        int[] totalStock = new int[4];
        for (int i = 0; i < stock.length; i++) {
            for (int j = 0; j < stock[i].length; j++) {
                totalStock[j] += stock[i][j];
            }
        }

        System.out.print("=====================================================================================\n");
        System.out.println("Jumlah Stock Berdasarkan Jenis Bunga di Seluruh Cabang:");
        System.out.println("Aglonema    : " + totalStock[0]);
        System.out.println("Keladi      : " + totalStock[1]);
        System.out.println("Alocasia    : " + totalStock[2]);
        System.out.println("Mawar       : " + totalStock[3]);

        System.out.print("=====================================================================================\n");

       
        int totalPendapatan = 0;
        int[] penguranganStock = {-1, -2, 0, -5};
        for (int i = 0; i < stock[0].length; i++) {
            totalPendapatan += (stock[0][i] + penguranganStock[i]) * harga[i];
        }

        System.out.println("Total Pendapatan dari RoyalGarden 1 Jika Semua Bunga Terjual Habis adalah :  " + totalPendapatan);
        System.out.print("=====================================================================================\n");
    }
}
