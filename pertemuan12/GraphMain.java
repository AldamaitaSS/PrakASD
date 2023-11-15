import java.util.Scanner;

public class GraphMain {
    public static void main (String[] args) throws Exception {
        Scanner al = new Scanner(System.in);
        /*Graph graph = new Graph(6);
        graph.addEdge(0,1);
        graph.addEdge(0,4);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.addEdge(3,0);
        graph.printGraph();
        graph.degree(2);

        // Penambahan Pemanggilan method removeEdge()
        graph.removeEdge(1,2);
        graph.printGraph();*/


        // Tugas 1 

        /*Graph graph = new Graph(6);
        int vertex, edge, source, destination;

        System.out.print("Masukkan Vertexn : ");
        vertex = al.nextInt();

        System.out.print("Masukkan Edge : ");
        edge = al.nextInt();

        System.out.println("--------------------------------");
        for(int i = 0; i<edge; i++) {
            System.out.print("Masukkan Source : ");
            source = al.nextInt();
            System.out.print("Masukkan Destination : ");
            destination = al.nextInt();

            graph.addEdge(source, destination);
        }
        System.out.println("--------------------------------");
        graph.printGraph();
        graph.degree(2); 

        graph.removeEdge(1,2);
        graph.printGraph();*/

        
        // Tugas 2

        /*Graph graph = new Graph(6);
        int vertex, edge, source, destination;

        boolean graphType = false;

        
        System.out.print("Masukkan Vertex : ");
        vertex = al.nextInt();

        System.out.print("Masukkan Edge : ");
        edge = al.nextInt();

        System.out.println("------------------------------------");
        System.out.println("1. Directed Graph");
        System.out.println("2. Undirected Graph");
        System.out.println("------------------------------------");
        System.out.print("Pilih Type Graph: ");
        int intGraphType = al.nextInt();
        graphType = intGraphType == 1 ? true : false;

        if (graphType) {
            System.out.println("Menggunakan directed graph");
        } else {
            System.out.println("Menggunakan undirected graph");
        }
        System.out.println("------------------------------------");

        for (int i = 0; i < edge; i++) {
            System.out.print("Masukkan Source : ");
            source = al.nextInt();
            System.out.print("Masukkan Destination : ");
            destination = al.nextInt();

            if (graphType) {
                graph.addEdge(source, destination);
            } else {
                graph.addEdge(source, destination);
                graph.addEdge(destination, source);
            }
        }

        System.out.println("------------------------------------");
        graph.printGraph();
        graph.degree(2);

        // Tugas 3
        
        graph.removeEdge(1,3);
        graph.printGraph();*/

        // Tugas 4
        System.out.print("Masukkan Vertex : ");
        String[] vertex = new String[al.nextInt()];
        al.nextLine();

        for (int i = 0; i < vertex.length; i++) {
            System.out.print("Masukkan data Vertex ke-" + i + " : ");
            vertex[i] = al.nextLine();
        }

        Graph<String> graph = new Graph<>(vertex);

        System.out.print("Masukkan Edge : ");
        int edge = al.nextInt();

        int menu;
        do {
            System.out.println("--------------------------");
            System.out.println("           MENU           ");
            System.out.println("--------------------------");
            System.out.println("1. Directed Graph");
            System.out.println("2. Undirected Graph");
            System.out.println("--------------------------");
            System.out.print("Pilih Type Graph : ");
            menu = al.nextInt();

            if (menu == 1) {
                System.out.println("Masukkan Edge: <from> <to>");
                for (int i = 0; i < edge; i++) {
                    graph.addEdge(al.nextInt(), al.nextInt());
                }
                graph.printGraph();
                break;
            } else if (menu == 2) {
                System.out.println("Masukkan Edge : <from> <to>");
                for (int i = 0; i < edge; i++) {
                    graph.addEdge(al.nextInt(), al.nextInt());
                    graph.addEdge(al.nextInt(), al.nextInt());
                }
                graph.printGraph();
            }
        } while (menu == 1 || menu == 2);

    }
}
