public class Heap {

    private Node[] heapArray;
    private int maxSize;
    private int currentSize;

    public Heap(int mx) {
        maxSize = mx;
        currentSize = 0;
        heapArray = new Node[maxSize];
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean insert(int key) {
        if (currentSize == maxSize)
            return false;
        Node newNode = new Node(key);
        heapArray[currentSize] = newNode;
        trickleUp(currentSize++);
        return true;
    }
    
    public void trickleUp(int index) {
        int parent = (index-1) / 2; 
        Node bottom = heapArray[index];
        while( index > 0 &&
        heapArray[parent].getKey() < bottom.getKey() )
        {
            heapArray[index] = heapArray[parent]; // move it down 
            index = parent;
            parent = (parent-1) / 2;
        } // end while
       heapArray[index] = bottom;
    } // end trickleUp()

    public void trickleDown(int index) 
    {
        int largerChild;
        Node top = heapArray[index]; // save root
        while(index < currentSize/2) // while node has at least one child,
        {
        int leftChild = 2*index+1; 
        int rightChild = leftChild+1; 
                                        //find larger child
        if(rightChild < currentSize && //rightChild exists?
            heapArray[leftChild].getKey() <
            heapArray[rightChild].getKey()) 
            largerChild = rightChild;
        else
        largerChild = leftChild;
                                         // top >= largerChild? 
        if( top.getKey() >= heapArray[largerChild].getKey() )
        break;
                                         // shift child up 
        heapArray[index] = heapArray[largerChild];
        index = largerChild; // go down
        } // end while
        heapArray[index] = top; // root to index
    } // end trickleDown()
    
    public Node remove() { // delete item with max key { // (assumes non-empty list) 
        Node root = heapArray[0];
        heapArray[0] = heapArray[--currentSize]; 
        trickleDown(0);
        return root;
    } // end remove()
    
    public boolean change(int index, int newValue) {
        if(index<0 || index>=currentSize) 
            return false;
            int oldValue = heapArray[index].getKey(); // remember old
            heapArray[index].setKey(newValue); // change to new
            if(oldValue < newValue) // if raised,
            trickleUp(index); // trickle it up
        else // if lowered,
            trickleDown(index); // trickle it down
        return true;
    }

    public void displayHeap() {
        System.out.print("heapArray: "); // array format 
        for(int m=0; m<currentSize; m++)
        if(heapArray[m] != null)
        System.out.print( heapArray[m].getKey() + " ");// end change()
       else
        System.out.print( "--");
        System.out.println();
        int nBlanks = 32;
        int itemsPerRow = 1;
        int column = 0;
        int j = 0;
        String dots = "..............................." ;
        System.out.println(dots+dots);
        while(currentSize > 0) 
        {
            if(column == 0)
                for(int k=0; k<nBlanks; k++)
                    System.out.print(' ');
            System.out.print(heapArray[j].getKey());
        
            if(++j == currentSize)
                break;
            if(++column==itemsPerRow) 
            {
                nBlanks /= 2; 
                itemsPerRow *= 2; 
                column = 0; 
                System.out.println(); }
        else
            for(int k=0; k<nBlanks*2-2; k++)
            System.out.print(' '); // interim blanks 
        } // end for
            System.out.println("\n" +dots+dots); //dotted bottom line
    } // end displayHeap()

}