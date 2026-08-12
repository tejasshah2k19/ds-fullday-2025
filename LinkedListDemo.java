
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String args[]) {

        int arr[] = {1, 2, 3, 4, 5,6};
        leetcode876(arr);
        //0 1 2 3 4 
        //1 2 3 4 5  remove(2) =>size2/2 
        //
    
        // 0   1  2  3  4   5
        // 10  20 30 40 50  60 
        //        size/2 => 3 
    }

    //remove nth index from last 
    static void leetcode19(int arr[], int n) {
        LinkedList<Integer> ll = new LinkedList<>();

        for (int data : arr) {
            ll.add(data);
        }
        System.out.println("original list : " + ll);
        //logic 
        //nth index last remove 
        System.out.println("new list : " + ll);

    }

    static void leetcode876(int arr[]) {
        LinkedList<Integer> ll = new LinkedList<>();

        for (int data : arr) {
            ll.add(data);
        }
        System.out.println("original list : " + ll);
        //logic 
        //remove middle node 
        int size = ll.size(); 

        //5 => 5/2 => 2.5 =>2 [0 1 2 3 4 ] 
        //6 => 6/2 => 3 =>[0 1 2 3 4 5]
        
        ll.remove(size/2); //size=>int / int => int 
        System.out.println("new list : " + ll);

    }

}
