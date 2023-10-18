public class nasabahMain {
    public static void main (String[] args) {
        
        nasabahLinkedList daftarNasabah = new nasabahLinkedList(6);

        daftarNasabah.enqueue("Akmal", "Suratan, Mojokerto", "19876767623456");
        daftarNasabah.enqueue("Raihan", "Genggong, Mojokerto", "98798775789012");
        daftarNasabah.enqueue("Amelia", "Gedeg, Mojokerto", "98367547345678");
        daftarNasabah.enqueue("Astrid", "Mlirp, Mojokerto", "98276352410298");
        daftarNasabah.enqueue("Dinda", "Wates, Mojokerto", "13231426354781");
        daftarNasabah.enqueue("Elisa", "Jagalan, Mojokerto", "42316253415243");

        System.out.println("===================================================");
        System.out.println("Daftar Nasabah Bank:");
        System.out.println("===================================================");

        daftarNasabah.displayList();

        System.out.println("\n \n");
        System.out.println("Nasabah yang di-dequeue:");
        System.out.println("===================================================");
        nasabah nasabah1 = daftarNasabah.dequeue();
        if (nasabah1 != null) {
            nasabah1.display();
            System.out.println("===================================================");
        }

        nasabah nasabah2 = daftarNasabah.dequeue();
        if (nasabah2 != null) {
            nasabah2.display();
            System.out.println("===================================================");
        }

        System.out.println("\n \n");
        System.out.println("Setelah dua nasabah di-dequeue:");
        System.out.println("===================================================");
        daftarNasabah.displayList();
    }
}
    
