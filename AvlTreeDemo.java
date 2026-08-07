
import java.util.Scanner;

class AvlTreeDemo {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        AVL avl = new AVL();
        // avl.root = avl.addNode(avl.root, 100);
        // avl.addNode(avl.root, 200);
        // avl.addNode(avl.root, 50);

        int totalNode;

        System.out.println("How many nodes you want to enter");
        totalNode = scr.nextInt();//10 

        for (int i = 1; i <= totalNode; i++) {
            System.out.println("Enter data : ");
            int data = scr.nextInt();
            avl.root = avl.addNode(avl.root, data);
        }

        //tree print 
        //inOrder  - left:root:right  -> asc  
        //preOrder - root:left:right 
        //postOrder - left:right:root 
        avl.inOrder(avl.root);

    }
}

class AVL {

    Node root = null;

    Node addNode(Node root, int data) {//100, 200 
        if (root == null) {
            root = new Node();
            root.data = data;
            root.left = null;
            root.right = null;
            return root;
        } else {

            if (data > root.data) {

                root.right = addNode(root.right, data);
            } else {
                root.left = addNode(root.left, data);
            }

            return root;
        }
    }

    void inOrder(Node root) {

        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }
}

//node 
class Node {

    int data;
    Node left;
    Node right;
}
