import java.util.Scanner;

public class BukuMain {
    public static void main (String[] args) {

        Scanner al = new Scanner(System.in);
        Buku st = new Buku(10);

        char pilih;
        do {
            System.out.println("==========  Menu  ==========");
            System.out.println("1. Tambah buku");
            System.out.println("2. Hapus buku teratas");
            System.out.println("3. Lihat buku teratas");
            System.out.println("4. Tampilkan seluruh stack");
            System.out.println("5. Keluar");

            System.out.print("Pilih operasi (1/2/3/4/5): ");
            pilih = al.next().charAt(0);

            switch (pilih) {
                case '1':
                    al.nextLine();
                    System.out.print("Judul: ");
                    String judul = al.nextLine();
                    System.out.print("Nama Pengarang: ");
                    String nama = al.nextLine();
                    System.out.print("Tahun Terbit: ");
                    int tahun = al.nextInt();
                    System.out.print("Jumlah Halaman: ");
                    int jml = al.nextInt();
                    System.out.print("Harga: ");
                    int hrg = al.nextInt();

                    Buku bk = new Buku(judul, nama, tahun, jml, hrg);
                    st.push(bk);
                    break;
                case '2':
                    st.pop();
                    break;
                case '3':
                    st.peek();
                    break;
                case '4':
                    st.print();
                    break;
                case '5':
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilih != '5');
        st.print();
        st.pop();
        st.peek();
        st.print();

    }

}
