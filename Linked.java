class Node {
    int data;
    Node next;
    Node prev;

    Node() {
        this.next = null;
        this.prev = null;
    }

    Node(int val) {
        this.data = val;
        this.next = null;
        this.prev = null;
    }
}

class Node2 extends Node {
    String name;

    Node2() {
        super(Node);
        this.name = "";
    }

    Node2(String name, int val) {
        super(Node);
        this.name = name;
    }
}

public class Linked {
    
    static Node head;
    static Node2 head2;

    Linked() {
        head = new Node();
        
    }

    Linked(String name, int val) {
        head = new Node(val);
        head2 = new Node2(name, val);
    }

    static void addLast(int val) {
        Node n = new Node(val);
        if (head == null) {
            n = head;
            return;
        }

        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = n;
        n.prev = temp;
        // temp.next = head;
    }
    // addFirst - 2 - 1
    static void addFirst(int val) {
        Node n = new Node(val);
        if (head == null) {
            n = head;
            return;
        }
        
        n.next = head;
        head.prev = n;
        head = n;
        
    }

    //insert
    static void insert(int val, int x) {
        Node temp = head;

        while(temp.data != x) {
            if (temp.next == null) {
                System.out.println("Error, Node not found!");
                return;
            }
            temp = temp.next;
        }

        Node n = new Node(val);
        Node bkp = temp.next;
        temp.next = n;
        n.next = bkp;
    }
    
    static int getMiddle() {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }

        return slow.data;
    }
    static void print() {
        Node temp = head;

        while(temp != null) {
            if (temp.next == null) {
                System.out.print(temp.data);
                break;
            }
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println();
    } 

    static boolean detectLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast ) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        Linked ll = new Linked("Div", 2);
        // new Linked(2);
        // addFirst(1);
        // addLast(3);
        // insert(4, 3);
        // addLast(5);
        // addLast(6);
        // System.out.println(getMiddle());
        // print();
        // System.out.println(detectLoop(head));
        System.out.println(ll.head2.name);
        
    }
}
