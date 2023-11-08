public class BinaryTreeArrayPrak2 {
    
    int[] data;
    int idxLast;
    
    public BinaryTreeArrayPrak2() {
        data = new int[10];
    }
    
    public void populateData(int[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
        
    }
    
    public void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }
    
    // Tugas 5 masukkan data ke dalam tree
    void add (int data) {
        if (idxLast == this.data.length-1) {
            System.out.println("Tree penuh, tidak bisa menambahkan data baru");
            return;
        }
        idxLast++;
        this.data[idxLast] = data;
    }

    // Tugas 5 menambahkan method traversePreOrder() dan traversePostOrder()
    public void traversePreOrder (int idxStart) {
        if (idxStart <= idxLast) {
            System.out.print(data[idxStart] + " ");
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }

    public void traversePostOrder (int idxStart) {
        if (idxStart <= idxLast) {
            traversePostOrder(2 * idxStart + 1);
            traversePostOrder(2 * idxStart + 2);
            System.out.print(data[idxStart] + " ");
        }
    }
}
