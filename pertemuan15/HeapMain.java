import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HeapMain {
    public static void main(String[] args) throws IOException {
       
        int value, value2;
            HeapTugas theHeap = null;

            System.out.print("Pilih jenis heap (m = Max Heap, n = Min Heap): ");
            char heapType = getChar();

            if (heapType == 'm') {
                theHeap = new HeapTugas(100, true); // Max heap
            } else if (heapType == 'n') {
                theHeap = new HeapTugas(100, false); // Min heap
            } else {
                System.out.println("Jenis heap tidak valid. Keluar.");
                return;
            }

            boolean success;
            theHeap.insert(70);
            theHeap.insert(40);
            theHeap.insert(50);
            theHeap.insert(20);
            theHeap.insert(60);
            theHeap.insert(100);
            theHeap.insert(80);
            theHeap.insert(30);
            theHeap.insert(10);
            theHeap.insert(90);

            while (true) {

                System.out.print("Masukkan huruf pertama dari ");
                System.out.print("show, insert, remove, change: ");
                int choice = getChar();
                switch (choice) {
                    case 's': // show heap structure
                        theHeap.displayHeap();
                        break;
                    case 'i': // insert node
                        System.out.print("Masukkan nilai yang ingin dimasukkan: ");
                        value = getInt();
                        success = theHeap.insert(value);
                        if (!success)
                            System.out.println("Tidak dapat memasukkan; heap penuh");
                        break;
                    case 'r': // remove
                        if (!theHeap.isEmpty())
                            theHeap.remove();
                        else
                            System.out.println("Tidak dapat menghapus; heap kosong");
                        break;
                    case 'c': // change
                        System.out.print("Masukkan indeks saat ini dari item: ");
                        value = getInt();
                        System.out.print("Masukkan kunci baru: ");
                        value2 = getInt();
                        success = theHeap.change(value, value2);
                        if (!success)
                            System.out.println("Indeks tidak valid");
                        break;
                    default:
                        System.out.println("Entri tidak valid\n");
                } // end switch
            } // end while
        } // end main

        //-------------------------------------------------------------
        public static String getString() throws IOException {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String s = br.readLine();
            return s;
        }

        public static char getChar() throws IOException {
            String s = getString();
            return s.charAt(0);
        }
        //-------------------------------------------------------------

        public static int getInt() throws IOException {
            String s = getString();
            return Integer.parseInt(s);
        }
    


       // N0 1

        /*int value, value2;
        HeapTugas theHeap = new HeapTugas(100); // use MinHeap instead of Heap
        boolean success;
        theHeap.insert(70);
        theHeap.insert(40);
        theHeap.insert(50);
        theHeap.insert(20);
        theHeap.insert(60);
        theHeap.insert(100);
        theHeap.insert(80);
        theHeap.insert(30);
        theHeap.insert(10);
        theHeap.insert(90);

        while (true) {

            System.out.print("Enter first letter of ");
            System.out.print("show, insert, remove, change: ");
            int choice = getChar();
            switch (choice) {
                case 's': // show heap structure
                    theHeap.displayHeap();
                    break;
                case 'i': // insert node
                    System.out.print("Enter value to insert: ");
                    value = getInt();
                    success = theHeap.insert(value);
                    if (!success)
                        System.out.println("Can’t insert; heap full");
                    break;
                case 'r': // remove
                    if (!theHeap.isEmpty())
                        theHeap.remove();
                    else
                        System.out.println("Can’t remove; heap empty");
                    break;
                case 'c': // change
                    System.out.print("Enter current index of item: ");
                    value = getInt();
                    System.out.print("Enter new key: ");
                    value2 = getInt();
                    success = theHeap.change(value, value2);
                    if (!success)
                        System.out.println("Invalid index");
                    break;
                default:
                    System.out.println("Invalid entry\n");
            } // end switch
        } // end while
    } // end main

    //-------------------------------------------------------------
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }
    //-------------------------------------------------------------

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }*/


    
}
    

