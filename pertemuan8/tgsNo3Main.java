public class tgsNo3Main {
    
    public static void main (String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();
        
        singLL.addFirst("Bahasa");
        singLL.print();
        singLL.insertBefore("Bahasa", "Android");
        singLL.print();
        singLL.insertBefore("Android", "Komputer");
        singLL.print();
        singLL.insertBefore("Komputer", "Basis Data");
        singLL.print();
        singLL.insertBefore("Basis Data", "Matematika");
        singLL.print();
        singLL.insertBefore("Matematika", "Algoritma");
        singLL.print();
        singLL.insertBefore("Algoritma", "Statistika");
        singLL.print();
        singLL.insertBefore("Statistika", "Multimedia");
        singLL.print();
    }

}
