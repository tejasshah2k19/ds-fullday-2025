
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
            int cost = scr.nextInt(); // 5 

            graph[source][dest] = cost;
            graph[dest][source] = cost;

        }

        for (int i = 0; i < totalVertex; i++) {
            for (int j = 0; j < totalVertex; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println("");
        }

        //source -> 1 
        //      dest -> 2 , 0 
        System.out.println("Enter source : ");
        int search = scr.nextInt();

        for (int i = 0; i < totalVertex; i++) {

            if (graph[search][i] != 0) {
                System.out.println("  " + i+": "+graph[search][i]);
            }
        }


        //source --- destination 

        //direct ? 
        //cost ? 


        

    }

    public static void main1(String args[]) {

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

        for (int i = 0; i < totalVertex; i++) {
            for (int j = 0; j < totalVertex; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println("");
        }

        //source -> 1 
        //      dest -> 2 , 0 
        System.out.println("Enter source : ");
        int search = scr.nextInt();

        for (int i = 0; i < totalVertex; i++) {

            if (graph[search][i] == 1) {
                System.out.println("  " + i);
            }
        }

    }
}
