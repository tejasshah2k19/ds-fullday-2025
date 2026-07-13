
public class Node {

    int data;
    Node next;
    Node prev;

    public static void main(String[] args) {

        DoubleLinkedList dl = new DoubleLinkedList();
        dl.addNode(10);
        dl.addNode(20);
        dl.addNode(30);
        dl.addNode(40);
        dl.addNode(50);

        dl.display();//10 20 30 40 50 
    }
}

class DoubleLinkedList {

    Node head = null;
    Node last;//defalt => null 

    void addNode(int data) {

        if (head == null) {
            //first time
            head = new Node();
            head.data = data;
            head.next = null;
            head.prev = null;
            last = head;
        } else {
            Node tmp = new Node();
            tmp.data = data;
            tmp.next = null;
            tmp.prev = last;
            last.next = tmp;
            last = tmp;
        }
    }

    void display() {
        Node p = head;

        System.out.println("Linked List : ");
        while (p != null) {
            System.out.print(p.data+"<->");//10 20 
            p = p.next;
        }
        System.out.println("\b\b\b   ");

    }

}
