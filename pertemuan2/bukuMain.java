package pertemuan2;

public class bukuMain {
    public static void main(String[] args) {
        buku[][] bukuArray = new buku[2][2];

        bukuArray[0][0] = new buku("Harry Potter", "J.K. Rowling");
        bukuArray[0][1] = new buku("To Kill a Mockingbird", "Harper Lee");
        bukuArray[1][0] = new buku("The Great Gatsby", "F. Scott Fitzgerald");
        bukuArray[1][1] = new buku("Pride and Prejudice", "Jane Austen");

       
        System.out.println("Daftar Buku:");
        for (int i = 0; i < bukuArray.length; i++) {
            for (int j = 0; j < bukuArray[i].length; j++) {
                buku buku = bukuArray[i][j];
                System.out.println("Judul: " + buku.getJudul() + ", Penulis: " + buku.getPenulis());
            }
        }
    }
}
