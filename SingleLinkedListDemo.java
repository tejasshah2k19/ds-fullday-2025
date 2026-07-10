
public class SingleLinkedListDemo {

    public static void main(String[] args) {
        SL s = new SL();

        s.addNode(10);
        s.addNode(20);
        s.addNode(30);
        s.addNode(40);

        s.display();

    }
}

class SL {

    Node head;
    Node last;

    void addNode(int data) {

        Node tmp = new Node();
        tmp.data = data;
        tmp.next = null;

        if (head == null) {
            head = tmp;
            last = tmp;
        } else {
            last.next = tmp;
            last = tmp;
        }

    }

    void display() {
        Node p = head;

        while (p != null) {
            System.out.println(p.data);//10 20 30 40 
            p = p.next;
        }
    }

    void addNodeBEG(int data){
        //10 20 30 40
        
        //50 10 20 30 40
        
    }

}

class Node {

    int data;
    Node next;
}
