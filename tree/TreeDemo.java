
public class TreeDemo {

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();//root==> null 

        bst.root = bst.addNode(bst.root, 20);//30

        bst.addNode(bst.root, 5);//30
        bst.addNode(bst.root, 1);//30

        bst.addNode(bst.root, 15);//30

        bst.addNode(bst.root, 9);//30

        bst.addNode(bst.root, 12);//30

        bst.addNode(bst.root, 30);//30

        bst.addNode(bst.root, 25);//30

        bst.addNode(bst.root, 40);//30

        bst.inOrder(bst.root);//asc 
    }
}

class BinarySearchTree {

    Node root;

    Node addNode(Node localRoot, int data) {//null,90
        if (localRoot == null) { //
            localRoot = new Node();
            localRoot.data = data;
            localRoot.left = null;
            localRoot.right = null;
            return localRoot;
        } else {
            if (data > localRoot.data) {//90 > 60 
                localRoot.right = addNode(localRoot.right, data);//null,90
            } else {
                localRoot.left = addNode(localRoot.left, data);
            }
        }
        return localRoot;
    }

    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }

    void preOrder(Node root) {
        if (root != null) {
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data);

        }
    }
}

class Node {

    int data;
    Node left;
    Node right;
}
