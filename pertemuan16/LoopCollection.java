import java.util.Stack;
import java.util.Iterator;
import java.util.Collections;

public class LoopCollection {
    public static void main (String [] args) { 
        
        Stack<String> fruits = new Stack<>();
        fruits.push("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.add("Salak");

        // Ganti elemen terakhir dengan "Strawberry" (no.5)
        fruits.set(fruits.size() - 1, "Strawberry");

        // Tambahkan 3 elemen baru (no.6)
        fruits.push("Mango");
        fruits.push("Guava");
        fruits.push("Avocado");

        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }
    
        System.out.println("\n" + fruits.toString());
    
        while (!fruits.empty()) {
            System.out.printf("%s ", fruits.pop());
        }

        // Dihilangkan (no.2)
        /*fruits.push("Melon");
        fruits.push("Durian");*/

        System.out.println("");
        for (Iterator<String> it = fruits.iterator(); it.hasNext();) {
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }
        System.out.println("");
        fruits.stream().forEach(e -> {
            System.out.printf("%s ", e);
        });
        System.out.println("");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("%s ", fruits.get(i));
        }


    }
}
