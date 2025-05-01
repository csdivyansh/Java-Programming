import java.util.*;
public class BinaryTree {
    Node root;

    class Node {
        int data;
        Node left;
        Node right;
         
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }        
    }

    BinaryTree() {
        Node root = null;
    }
    
    public Node buildTree(Node root, Scanner sc) {
        
        System.out.println("Enter the data: ");
        int data = sc.nextInt();
        root = new Node(data);
        if(data == -1) {
            return null;
        }
        System.out.println("Enter the data for left node: ");
        root.left = buildTree(root.left, sc);
        System.out.println("Enter the data for right node: ");
        root.right = buildTree(root.right, sc);
        return root;
    }
    
    // public void levelOrderTraversal(Node root) {
    //     Queue<Node> q = new Queue<>();
    //     Node temp = root;
    //     q.push(temp);
    //     q.push(null);
        
    // }
    public void preOrder(Node root) {
        //NLR
        if(root == null) {
            return;
        }
    
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }


    public void inOrder(Node root) {
        //LNR
        if(root == null) {
            return;
        }
        
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    
    public void postOrder(Node root) {
        //LRN
        if(root == null) {
            return;
        }
        
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner sc = new Scanner(System.in);
        tree.root = tree.buildTree(tree.root, sc);
        //  1 3 7 -1 -1 11 -1 -1 5 17 -1 -1 -1
        System.out.println("Printing Preorder Traversal: ");
        tree.preOrder(tree.root);
        System.out.println();

        System.out.println("Printing Inorder Traversal: ");
        tree.inOrder(tree.root);
        System.out.println();

        System.out.println("Printing Postorder Traversal: ");
        tree.postOrder(tree.root);
        System.out.println();
    }
    
}
