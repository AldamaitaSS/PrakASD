public class HashTableMain {
    public static void main(String[] args) {
        HashTable table = new HashTable();

        /*System.out.println( table.hash("apple") );
        System.out.println( table.hash("banana") );
        System.out.println( table.hash("cherry") );
        System.out.println( table.hash("date") );
        System.out.println( table.hash("eggplant") );*/

    
        //Setelah menambahkan method get()
        System.out.println( table.hash("apple") );
        System.out.println( table.hash("banana") );
        System.out.println( table.hash("cherry") );
        System.out.println( table.hash("date") );
        System.out.println( table.hash("eggplant") );

        //Seletah menambahkan method set() 
        table.set("apple", 100);
        table.set("banana", 50);
        table.set("cherry", 300);
        table.set("date", 500);
        table.set("eggplant", 10);

        table.printTable();

        //Setelah menambahkan method get()
        System.out.println("Apple:");
        System.out.println( table.get("apple") );

        System.out.println("\nDate:");
        System.out.println( table.get("date") );

        //Setelah menambahkan method keys()
        System.out.println( table.keys() );

        

    }
}
