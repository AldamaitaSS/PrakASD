public class NodeFilm {
    int id;
    String title;
    double rating;
    NodeFilm prev;
    NodeFilm next;
    
     public NodeFilm(int kode, String judul, double rating) {
        id = kode;
        title = judul;
        this.rating = rating;
    }
}
