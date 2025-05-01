class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class StackLL {
    Node head;
    StackLL() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    void push(int data) {
        Node temp = new Node(data);
        if(isEmpty()) {
            head = temp;
            return;
        }
        
        temp.next = head;
        head = temp;
    }

    int pop() {
        if(isEmpty()) {
            return -1;
        }

        Node temp = head;
        head = head.next;
        return temp.data;        
    }
}
