
public class AVLTree {

    Node root = null;

    int getHeight(Node root) {
        int lh = 0;
        int rh = 0;

        if (root.left != null) {
            lh = root.left.height;
        }

        if (root.right != null) {
            rh = root.right.height;
        }

        if (lh > rh) {
            return lh + 1;
        } else {
            return rh + 1;
        }

    }

    Node addNode(Node root, int data) {//null , data:60 
        if (root == null) {
            root = new Node();
            root.data = data;
            root.left = null;
            root.right = null;
            root.height = 1;
            return root;
        } else if (data > root.data) {
            //right 
            root.right = addNode(root.right, data);
        } else {
            //left 
            root.left = addNode(root.left, data);
        }

        root.height = getHeight(root);
        return root;
    }

    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data + "(" + root.height + ")");
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {

        AVLTree avl = new AVLTree();
        avl.root = avl.addNode(avl.root, 30);
        avl.addNode(avl.root, 50);
        avl.addNode(avl.root, 60);
        avl.addNode(avl.root, 20);

        avl.inOrder(avl.root);//30(2) 50(1) 

        // System.out.println(avl.getHeight(avl.root));

        // avl.addNode(avl.root, 10);

        // avl.inOrder(avl.root);//10 20 30 50 60 

    }
}

class Node {

    int data;
    Node left;
    Node right;
    int height;
}
