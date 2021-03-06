package algo.binaryTree;

public class BinaryTreeDemo {
    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);

        tree.root.left = new Node(2);

        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);

        System.out.println("Binary Tree: "+ tree.root);
    }
}

class BinaryTree {
    Node root;

    BinaryTree(int key) {
        root = new Node(key);
    }
    BinaryTree() {
        root = null;
    }
}

class Node {
    int key;
    Node left, right;
    Node(int item) {
        key = item;
        left = right = null;
    }
}
