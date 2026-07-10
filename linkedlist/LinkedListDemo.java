
public class LinkedListDemo {

    Node head = null, last = null;

    void addNode(int num) {
        if (head == null) {
            Node tmp = new Node();
            tmp.data = num;
            tmp.next = null;
            head = tmp;
            last = tmp;
        } else {
            Node tmp = new Node();
            tmp.data = num;
            tmp.next = null;
            last.next = tmp;
            last = tmp;
        }
    }

    void display() {
        Node p = head;

        while (p != null) {
            System.out.println(p.data + ":" + p + "==> ");//10 20 
            p = p.next;
        }
    }

    void addNodeBEG(int num) {
        Node tmp = new Node();
        tmp.data = num;
        tmp.next = head;
        head = tmp;
    }

    void addNodeAny(int src, int num) {


        if(last.data == src){
            addNode(num);
        }

        Node p = head;
        boolean isFound = false;
        while (p != null) {
            if (p.data == src) {
                isFound = true;
                break;
            }
            p = p.next;
        }

        if (isFound == false) {
            System.out.println("Invallid Source");
        } else {
            Node tmp = new Node();
            tmp.data = num;
            tmp.next = p.next;
            p.next = tmp;
        }

    }

    void linearSearch(int key) {

        //90 10 20 30 40 50 
        //p 
        Node p = head;
        boolean isFound = false;
        while (p != null) {
            if (p.data == key) {
                isFound = true;
                break;
            }
            p = p.next;
        }

        if (isFound) {//isFound == true 
            System.out.println(key + " Found ");
        } else {
            System.out.println(key + " not found");
        }

    }

    int count() {

        return 0;
    }

    void deleteBeg() {

        Node p = head;
        System.out.println(p.data + " Removed");
        head = head.next;
        p = null;

    }

    void deleteEnd() {
        Node p = head; 
        while(p.next != last){
            p = p.next; 
        }

        p.next=null;
        last =p;

    }

    void deleteAny(int src){
        if(head.data == src){
            deleteBeg();
        }else if(last.data == src){
            deleteEnd();
        }else{
            //search 
            //invalid source 
            
            //
        }
    }



    public static void main(String[] args) {

        LinkedListDemo list = new LinkedListDemo();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
        list.addNode(50);

        list.display();//10 20 30 40 50 

        list.addNodeBEG(90);

        list.display();// 90 10 20 30 40 50 

        list.linearSearch(100);//100 not found 
        list.linearSearch(40); //40 present 

        System.out.println(list.count());//6

        list.addNodeAny(1000, 100);//invalid 
        list.addNodeAny(30, 33);
        list.addNodeAny(33, 35);
        list.addNodeAny(50, 65);//

        list.display();// 90 10 20 30 33 35 40 50 

        list.deleteBeg();//90 removed

        list.display();//  10 20 30 33 35 40 50 

        list.deleteEnd();//50 removed 

        list.display();//  10 20 30 33 35 40   

        //insert at end 
        //insert at beg 
        //insert at any {src,position} {30 after 40} { 30 befre 40}
        //delete end 
        //delete beg 
        //delete any {src,position} {src before} {src after} 
        //display 
    }
}
