import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DoublyLinkedListFilm {
    
    NodeFilm head;
    NodeFilm tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void addFilm(int kode, String judul, double rating) {
        NodeFilm film = new NodeFilm(kode, judul, rating);
        if (isEmpty()) {
            head = film;
            tail = film;
        } else {
            tail.next = film;
            film.prev = tail;
            tail = film;
        }
    }

    public void addFilmAtBeginning(int kode, String judul, double rating) {
        NodeFilm film = new NodeFilm(kode, judul, rating);
        if (isEmpty()) {
            head = film;
            tail = film;
        } else {
            film.next = head;
            head.prev = film;
            head = film;
        }
    }

    public void addFilmAtEnd(int kode, String judul, double rating) {
        addFilm(kode, judul, rating);
    }

    public void addFilmAtIndex(int kode, String judul, double rating, int index) {
        if (index < 0) {
            System.out.println("Invalid index. Film not added.");
            return;
        }

        NodeFilm film = new NodeFilm(kode, judul, rating);
        if (isEmpty()) {
            head = film;
            tail = film;
        } else if (index == 0) {
            addFilmAtBeginning(kode, judul, rating);
        } else {
            NodeFilm current = head;
            int i = 0;
            while (i < index - 1 && current.next != null) {
                current = current.next;
                i++;
            }
            if (current.next != null) {
                film.prev = current;
                film.next = current.next;
                current.next = film;
                film.next.prev = film;
            } else {
                tail = film;
                current.next = film;
                film.prev = current;
            }
        }
    }

    public void removeFirstFilm() {
        if (isEmpty()) {
            System.out.println("Tidak ada film yang dihapus");
            return;
        }
        head = head.next;
        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }
    }

    public void removeLastFilm() {
        if (isEmpty()) {
            System.out.println("Tidak ada film yang dihapus");
            return;
        }
        tail = tail.prev;
        if (tail == null) {
            head = null;
        } else {
            tail.next = null;
        }
    }

    public void removeFilmAtIndex(int index) {
        if (isEmpty()) {
            System.out.println("Tidak ada film untuk dihapus");
            return;
        }
        if (index == 0) {
            removeFirstFilm();
        } else {
            NodeFilm current = head;
            int i = 0;
            while (i < index && current != null) {
                current = current.next;
                i++;
            }
            if (current != null) {
                if (current.next != null) {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                } else {
                    removeLastFilm();
                }
            } else {
                System.out.println("index tidak ditemukan, film tidak berhasil dihapus");
            }
        }
    }

    public NodeFilm cariFilm(int id) {
        NodeFilm current = head;
        while (current != null) {
            if (current.id == id) {
                return current;
            }
            current = current.next;
        }
        return null; 
    }


    public void urutFilmDESC() {
        List<NodeFilm> filmsList = new ArrayList<>();
        NodeFilm current = head;
        while (current != null) {
            filmsList.add(current);
            current = current.next;
        }
    
        Collections.sort(filmsList, (film1, film2) -> Double.compare(film2.rating, film1.rating));
    
        head = filmsList.get(0);
        head.prev = null;
        tail = filmsList.get(filmsList.size() - 1);
        tail.next = null;
    
        for (int i = 0; i < filmsList.size() - 1; i++) {
            filmsList.get(i).next = filmsList.get(i + 1);
            filmsList.get(i + 1).prev = filmsList.get(i);
        }
    }
    

    public void displayFilms() {
        if (!isEmpty()) {
            NodeFilm current = head;
            System.out.println("Cetak Data");
            while (current != null) {
                System.out.println("ID: " + current.id);
                System.out.println("  Judul Film: " + current.title);
                System.out.println("  ipk: " + current.rating);
                current = current.next;
            }
        } else {
            System.out.println("Belum ada data film, silahkan isi! ");
        }
    }

}
