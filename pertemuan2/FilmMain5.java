package pertemuan2;

public class FilmMain5 {
    public static void main (String[] args) {
        Film5 film1 = new Film5();

        film1.judul = "Quantumania Mancing";
        film1.genre = "Action Comedy";
        film1.rate = "Remaja";
        film1.jumlahTiket = 3000;
        film1.hargaTiket = 40000;

        film1.tambahTiket(1);
        film1.kurangiTiket(3);
        film1.tampilFilm();

        int income = film1.totalRevenue(4);

        System.out.println("Total jual 4 tiket = "+income);

        System.out.println("===========\n");

        Film5 film2 = new Film5 ("Maniaquantum", "Horor", "Dewasa", 200, 40000);
        film2.tampilFilm();
    }
}
