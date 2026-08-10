
import java.util.Scanner;

public class GraphMat {

    public static void main(String args[]) {

        Scanner scr = new Scanner(System.in);
        int graph[][];

        int totalVertex;
        int totalEdges;

        System.out.println("How many vertex and edges you have? ");
        totalVertex = scr.nextInt();//5 {0 1 2 3 4}
        totalEdges = scr.nextInt();//4  

        graph = new int[totalVertex][totalVertex];

        for (int i = 1; i <= totalEdges; i++) {
            System.out.println("Enter source and Destination ");
            int source = scr.nextInt();//0
            int dest = scr.nextInt();//1 

            graph[source][dest] = 1; 
            graph[dest][source] = 1; 
            
        }

        for(int i=0;i<totalVertex;i++){
            for(int j=0;j<totalVertex;j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
