
class LinkedList {

    public class Node {
        int data;
        Node next;
    
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    
    Node head;

    void delete(int data) {
        Node temp = head;
        if (head == null) {
            System.out.println("Mpty");
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        while(temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Not found");
        } else {
            temp.next = temp.next.next;
        }

    }

    void add(Node head, int data) {
        if (head == null) {
            Node n = new Node(data);
            head = n;
        } else {
            Node temp = head;
            while(temp.next!= null) {
                temp = temp.next;
            }
            Node n = new Node(data);
            temp.next = n;
        }
    }
    
    static void insertAtTail(Node tail, int data) {
        Node temp = new Node(data);
        tail.next = temp;
        tail = temp;
    }
    static void print(Node head){
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList head = new LinkedList(10);
        LinkedList tail = head;
        insertAtTail(tail, 20);
        insertAtTail(tail, 30);
        insertAtTail(tail, 40);
        LinkedList.print(head);
    }
}