public class Stack {
    int[] arr;
    int top;

    Stack(int size) {
        arr = new int[size];
        top = -1;
    }

    int peek() {
        return isEmpty() ? -1 : arr[top];
    }

    void push(int data) {
        if(isFull()) {
            System.out.println("Stack OverFlow!");
            return;
        }

        arr[top++] = data;
    }

    int pop() {
        if(isEmpty()) {
            return -1;
        }
        
        return arr[top--];
    }

    boolean isEmpty() {
        return top == -1;
    }

}

class Main {
    public static void main(String[] args) {
        Stack s = new Stack(10);

        for(int i = 0; i < )
        s.push(1);

    }
}
