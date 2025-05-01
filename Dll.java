class Dll {
    class Node {
        int data;
        Node prev;
        Node next;
    
        Node(int val) {
            this.data = val;
        }
    
    }
    Node head;

    void addFirst(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        } 
        
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    void addLast(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
            newNode.prev = last;
        }
    }

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Dll dll = new Dll();
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(3);
        dll.print();
    }
}
