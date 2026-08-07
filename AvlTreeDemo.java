
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
            root.height = 1;
            return root;
        } else {

            if (data > root.data) {

                root.right = addNode(root.right, data);
            } else {
                root.left = addNode(root.left, data);
            }

            //height 
            int leftHeight = 0;
            int rightHeight = 0;

            if (root.left != null) {
                leftHeight = root.left.height;
            }

            if (root.right != null) {
                rightHeight = root.right.height;
            }

            if (leftHeight > rightHeight) {
                root.height = leftHeight + 1;
            } else {
                root.height = rightHeight + 1;
            }
            // balance factor 

            int balanceFactor = leftHeight - rightHeight;

            if (balanceFactor < -1) {
                //root->50 
                //data -> 55 

                if (data > root.right.data) {
                    System.out.println("RIGHT RIGHT Imbalance for => " + root.data + "(" + balanceFactor + ")" + " when we add " + data);
                } else {
                    System.out.println("RIGHT LEFT Imbalance for => " + root.data + "(" + balanceFactor + ")" + " when we add " + data);
                }

            } else if (balanceFactor > 1) {
                if (data < root.left.data) {
                    System.out.println("Left Left Imbalance => " + root.data + "(" + balanceFactor + ")" + "when we add " + data);

                } else {
                    System.out.println("Left Right Imbalance => " + root.data + "(" + balanceFactor + ")" + " when we add " + data);
                }
            }

            return root;
        }
    }

    void inOrder(Node root) {

        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data + "(" + root.height + ")"); //50(1)
            inOrder(root.right);
        }
    }
}

//node 
class Node {

    int data;
    Node left;
    Node right;
    int height;
}
