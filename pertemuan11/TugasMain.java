public class TugasMain {
    public static void main(String[] args) {
        Tugas al = new Tugas();
        al.add(6);
        al.add(4);
        al.add(8);
        al.add(3);
        al.add(5);
        al.add(7);
        al.add(9);
        al.add(10);
        al.add(15);

        al.traversePreOrder(al.root);
        System.out.println();
        al.traverseInOrder(al.root);
        System.out.println();
        al.traversePostOrder(al.root);
        System.out.println();
        System.out.println(al.find(5));
        al.delete(8);
        al.traversePreOrder(al.root);
        System.out.println();

        // Tugas 1
        al.addRekursif(14);

        al.traversePreOrder(al.root);
        System.out.println();

        // Tugas 2
        System.out.println("Nilai paling kecil : " + al.findMinimum());
        System.out.println("Nilai paling besar : " + al.findMaksimum());

        // Tugas 3
        System.out.println("Data Leaf yang ada : ");
        al.printLeaf(al.root);

        // Tugas 4
        System.out.println();
        System.out.print("Jumlah Leaf : " + al.countLeaf(al.root));

    }
}
