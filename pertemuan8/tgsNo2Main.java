public class tgsNo2Main {
    public static void main (String[] args) {
       
        SingleLinkedList singLL = new SingleLinkedList();
        
        singLL.addFirst("a");
        singLL.print();
        singLL.insertAfter("a", "b");
        singLL.print();
        singLL.insertAfter("b", "c");
        singLL.print();
        singLL.insertAfter("c", "d");
        singLL.print();
        singLL.insertAfter("d", "e");
        singLL.print();
        
    }
}
