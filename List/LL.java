package List;
import List.MyNode;

public class LL {
    MyNode head;
    MyNode tail;

    public LL() {
        head = new MyNode(-1);
        tail = head;
    }

    public void print() {
        MyNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void add(int data) {
        tail.next = new MyNode(data);
        tail = tail.next;
    }

    public void addFirst(int data) {
        MyNode temp = new MyNode(data);
        temp.next = head;
        head = temp;
    }
}
