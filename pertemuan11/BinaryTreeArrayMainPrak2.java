public class BinaryTreeArrayMainPrak2 {
    
    public static void main(String[] args) {
        BinaryTreeArrayPrak2 bta = new BinaryTreeArrayPrak2();
        int[] data = { 6,4,8,3,5,7,9,0,0,0 };
        int idxLast = 6;
        bta.populateData(data, idxLast);
        bta.traverseInOrder(0);

        // Tugas 5
        bta.add(10);
        bta.add(2);
        System.out.println();

        System.out.println("=====================");
        System.out.println("Tranverse Pre-Order  ");
        System.out.println("=====================");
        bta.traversePreOrder(0);
        System.out.println();
        System.out.println(" ");

        System.out.println("=====================");
        System.out.println("Tranverse Post-Order ");
        System.out.println("=====================");
        bta.traversePostOrder(0);
        System.out.println();




    }

}
