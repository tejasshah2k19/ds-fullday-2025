
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

        System.out.println(bst.search(bst.root, 40));//true 
        System.out.println(bst.search(bst.root, 400));//false 

        // System.out.println("delete 1200 : ");
        // System.out.println(bst.deleteNode(bst.root, 1200));
        bst.inOrder(bst.root);

        bst.root = bst.deleteNode(bst.root, 20);
        System.out.println("after removing root");
        bst.inOrder(bst.root);

        /*
                            20
                    5               30
                1       15      25      40 
                    9 
                        12 

         */
        // System.out.println( bst.findMin(bst.root.left).data);
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

    boolean search(Node root, int key) {
        if (root != null) {
            if (root.data == key) {
                return true;
            } else if (key > root.data) {
                //right 
                return search(root.right, key);
            } else {
                return search(root.left, key);
            }
        }
        return false;
    }

    Node findMin(Node root) {//25
        if (root != null && root.left != null) {
            return findMin(root.left);
        }
        return root;
    }

    Node deleteNode(Node root, int key) {
        if (root != null) {
            if (root.data == key) {
                //0 child 

                if (root.left == null && root.right == null) {
                    System.out.println("delet with 0 child");
                    return null;
                } else if (root.right == null) {
                    System.out.println("deleted with 1 child");
                    return root.left;
                } else if (root.left == null) {
                    System.out.println("deleted with 1 child");
                    return root.right;
                } else {
                    System.out.println("deleted with 2 child");
                    //2 child 
                    //
                    Node smallestNode = findMin(root.right);
                    this.root.data = smallestNode.data;
                    deleteNode(this.root.right, smallestNode.data);
                    return root;
                }

            } else if (key > root.data) {
                root.right = deleteNode(root.right, key);
            } else {
                root.left = deleteNode(root.left, key);
            }
        }
        return root;
    }

}

class Node {

    int data;
    Node left;
    Node right;
}
