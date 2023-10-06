public class DaftarAnggotaPaskibra {
    
    Paskibra listPeserta[] = new Paskibra [10];
    int id;

    void tambah(Paskibra p) {
        if (id < listPeserta.length && p.tinggi >= 170) {
            listPeserta[id] = p;
            id++;
        } else if (p.tinggi < 170) {
            System.out.println("Tinggi badan kurang dari 170 cm, siswa tidak memenuhi syarat!");
            System.out.print("\n");
        } else {
            System.out.println("Data penuh!");
        }
    }

    void tampil() {
        for (Paskibra p : listPeserta) {
            if (p != null) {
                p.tampilIdentitas();
                System.out.println("----------------------");
            }
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listPeserta.length - 1; i++) {
            for (int j = 1; j < listPeserta.length - i; j++) {
                if (listPeserta[j] != null && listPeserta[j - 1] != null && listPeserta[j].tinggi > listPeserta[j - 1].tinggi) {
                    Paskibra tmp = listPeserta[j];
                    listPeserta[j] = listPeserta[j - 1];
                    listPeserta[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listPeserta.length - 1; i++) {
            if (listPeserta[i] == null) {
                continue; 
            }
            int idMin = i;
            for (int j = i + 1; j < listPeserta.length; j++) {
                if (listPeserta[j] != null && listPeserta[j].tinggi < listPeserta[idMin].tinggi) {
                    idMin = j;
                }
            }
            if (listPeserta[idMin] != null) {
                Paskibra tmp = listPeserta[idMin];
                listPeserta[idMin] = listPeserta[i];
                listPeserta[i] = tmp;
            }
        }
    }

}
