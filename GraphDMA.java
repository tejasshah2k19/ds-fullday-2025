import java.util.ArrayList; 
import java.util.Scanner;


public class GraphDMA {

    public static void main(String[] royal) {

        //14  
        //object 
        //

        // ArrayList<Integer> edges = new ArrayList<Integer>();
        // edges.add(10);
        // edges.add(110);
        // edges.add(101);
        // edges.add(1010);
        // edges.add(100);
        // edges.add(1000);
        // edges.add(110);
        // edges.add(1110);
        // edges.add(11000);
        
        
        // System.out.println(edges.get(0));//10 

        Scanner scr = new Scanner(System.in);

        ArrayList<Edge> edges = new ArrayList<Edge>();

        for (int i = 1; i <= 7; i++) {
            Edge e = new Edge(); //source , destination 
            System.out.println("Enter source and destination");
            e.source = scr.nextInt();
            e.destination = scr.nextInt();
            edges.add(e);//10 1 

            Edge rev = new Edge();
            rev.source = e.destination; 
            rev.destination = e.source; 
            edges.add(rev);
        }



        //print-> 
        //10    1
        //1     11
        //11    6
        //6     10
        //10    7
        //7     1
        //7     11
        System.out.println("Source  Dest");
        for (int i = 0; i <  14; i++) {
            System.out.println(edges.get(i).source +"  :  "+edges.get(i).destination);
        }
    }
}

class Edge {

    int source;
    int destination;

}
