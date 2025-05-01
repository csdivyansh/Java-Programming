import java.util.Collections;
import java.*;

public class Student {
    int rollno;
    int marks;

    Student(int rollno, int marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    int compareTo(Student s){
        return this.marks - s.marks;
    }
    
}

public class comparison {
    public static void main(String[] args) {

        ArrayList<Student> sList = new ArrayList<>();

        Student s1 = new Student(7, 100);
        Student s2 = new Student(8, 99);
        sList.add(s1);
        sList.add(s2);
        Collections.sort(sList);
        System.out.println(sList);
    }
}
