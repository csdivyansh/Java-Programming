class MyArrayList {
    Integer[] arr;
    int size;
    int capacity;

    public MyArrayList() {
        size = 0;
        capacity = 10;
        arr = new Integer[capacity];
    }

    public MyArrayList(int capacity) {
        size = 0;
        this.capacity = capacity;
        arr = new Integer[capacity];
    }

    public int get(Integer index) {
        return arr[index];
    }

    public void add(Integer ele) {
        arr[size] = ele;
        size++;
    }

    public void set(int index, int value){
        arr[index] = value;
    }

    public void remove() {
        size--;
    }

    public void display() {
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

class DemoClass {
    public static void main(String[] args) {
        MyArrayList ls = new MyArrayList();
        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(40);
        ls.remove();
        ls.remove();

        ls.display();
    }
}