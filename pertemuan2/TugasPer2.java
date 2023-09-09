package pertemuan2;

public class TugasPer2 {
    int id;
    String nama;
    String alamat;
    int noHP;
    int[] noRek;
    int[]saldo;
    float jmlHutang;
    boolean statusAktif;
   

    
    TugasPer2 (int i, String nm, String almt, int nh) {
        id = i;
        nama = nm;
        alamat = almt;
        noHP = nh; 
        noRek = new int[5];
        saldo = new int[5];
        jmlHutang = 0;
        statusAktif = false;
        
    }
    int lihatSaldo(int noRek) {
        for (int i = 0; i < this.noRek.length; i++) {
            if (this.noRek[i] == noRek) {
                return saldo[i];
            }
        }
        return -1;
    }
    int menabung(int deposit, int noRek) {
        if (statusAktif) {
            for (int i=0; i< this.noRek.length; i++) {
                if (this.noRek[i]==noRek) {
                    if (deposit > 0) {
                        saldo[i] += deposit;
                        return saldo[i];
                    }else {
                        System.out.println ("Jumlah yang dimasukkan harus lebih dari 0");
                        return saldo[i];
                    }

                    
                }
            }
            System.out.println("Nomor rekening tidak ditemukan");
        }else {
            System.out.println("Anda tidak memiliki rekening aktif");
        }
        return -1;
        
    }
    
    int tarikTunai (int jmlTarik, int noRek) {
        if (statusAktif) {
            for (int i=0; i< this.noRek.length; i++) {
                if (this.noRek[i]==noRek) {
                    if(saldo[i] >= jmlTarik) {
                        saldo[i] -= jmlTarik;
                        return saldo[i];
                    }else {
                        System.out.println("Saldo tidak mencukupi untuk melakukan penarikan");
                        return saldo[i];
                    }
                }
            }
            System.out.println("Nomor rekening tidak ditemukan.");
        } else {
            System.out.println("Anda tidak memiliki rekening aktif.");
        }
        return -1;

    }
    void bukaRekening() {
        if (!statusAktif) {
            for (int i = 0; i < noRek.length; i++) {
                if (noRek[i] == 0) {
                    noRek[i] = (int) (Math.random() * 1000000);
                    saldo[i] = 0;
                    statusAktif = true;
                    System.out.println("Rekening berhasil dibuka. Nomor rekening Anda: " + this.noRek[i]);
                    return;
                }
            }
            System.out.println("Anda sudah memiliki 5 rekening aktif.");
        } else {
            System.out.println("Anda sudah memiliki rekening aktif.");
        }

    }
    void tutupRekening(int noRek) {
        if (statusAktif) {
            for (int i = 0; i < this.noRek.length; i++) {
                if (this.noRek[i] == noRek) {
                    this.noRek[i] = 0;
                    saldo[i] = 0;
                    statusAktif = false;
                    System.out.println("Rekening berhasil ditutup.");
                    return;
                }
            }
            System.out.println("Nomor rekening tidak ditemukan.");
        } else {
            System.out.println("Anda tidak memiliki rekening aktif.");
        }

    }
    void berhutang(float jmlHutang) {
        if (statusAktif) {
            if (jmlHutang >= saldo[0]) {
                System.out.println("Ajuan peminjaman ditolak. Jumlah hutang melebihi saldo.");
            } else {
                this.jmlHutang = jmlHutang;
                float cicilanPerBulan = (float) jmlHutang / 6;
                System.out.println("Pinjaman disetujui.");
                System.out.println("Simulasi skema cicilan per bulan: " + cicilanPerBulan);
            }
        } else {
            System.out.println("Anda tidak memiliki rekening aktif.");
        }

    }
    public int getNoRek(int index) {
        if (index >= 0 && index < this.noRek.length) {
            return this.noRek[index];
        } else {
            return -1;
        }
    }
}
