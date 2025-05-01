import java.util.ArrayList;

public class StackAL {
    ArrayList<Integer> ls;

    StackAL() {
        ls = new ArrayList<>();
    }

    boolean isEmpty() {
        return ls.size() == 0;
    }

    void push(int data) {
        ls.add(data);
    }

    int pop() {
        if(isEmpty()) {
            System.out.println("Stack UnderFlow!!");
            return -1;
        }

        int ans = ls.get(ls.size() - 1);
        ls.remove(ls.size() - 1);
        return ans;
    }
    public static void main(String[] args) {
        StackAL st = new StackAL();

        st.push(65);
        st.push(45);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}
