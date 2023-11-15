import java.util.Scanner;

public class GraphArrayMain {
    public static void main(String[] args) {  
        
        int v, e, count = 1, to =0, from=0;
        Scanner al = new Scanner(System.in);
        GraphArray <String> graph;
        try {
            System.out.print("Masukkan jumlah vertices : ");
            v = al.nextInt();
            System.out.print("Masukkan jumlah edges : ");
            e = al.nextInt();

            String[] vertexs = new String[v + 1];
            al.nextLine();
            for (int i = 1; i <= v; i++) {
                System.out.print(" Masukkan Data Vertex ke-" + i + " : ");
                vertexs[i] = al.nextLine();
            }

            graph = new GraphArray<String>(vertexs);

            System.out.println("Masukkan edges: <to> <from>");
            while(count<=e){
                to = al.nextInt();
                from = al.nextInt();

                graph.makeEdge(to, from, 1);
                count++;
            }

            System.out.println("-----------------------------------------------");
            System.out.println("                     Array 2D                  ");
            System.out.println("-----------------------------------------------");
            System.out.print("\t ");
            for (int i = 1; i<=v; i++){
                System.out.print(vertexs[i]+"\t");
            }
            System.out.println();

            for(int i=1; i<=v; i++){
                System.out.print(vertexs[i]+"\t");
                for(int j=1; j<=v; j++){
                    System.out.print(graph.getEdge(i,j)+"\t");
                }
                System.out.println();
            }
            
        } catch (Exception E) {
            System.out.println("Error. Silakan cek kenbali\n"+E.getMessage());
        }
        al.close();
    }
    
}
