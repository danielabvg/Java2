package unidad4;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BST {
    Node root;

    // Insertar nodo
    void insert(int data) {
        root = insertRec(root, data);
    }

    Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data)
            root.left = insertRec(root.left, data);
        else if (data > root.data)
            root.right = insertRec(root.right, data);

        return root;
    }

    // Preorden
    void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // Inorden
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Postorden
    void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BST tree = new BST();

        // CONJUNTO 1
        int[] values = {50, 30, 80, 20, 45, 70, 95, 15, 35, 85};

        for (int value : values) {
            tree.insert(value);
        }

        System.out.print("Preorden: ");
        tree.preorder(tree.root);

        System.out.print("\nInorden: ");
        tree.inorder(tree.root);

        System.out.print("\nPostorden: ");
        tree.postorder(tree.root);
    }
}
