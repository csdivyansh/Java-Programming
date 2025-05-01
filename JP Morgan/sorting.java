import java.util.*;

public class sorting {
    static class Student {
        int marks;
        String name;
        int age;

        public Student(String name, int age, int marks) {
            this.name = name;
            this.age = age;
            this.marks = marks;
        }
    }

    public static void main(String[] args) {
        Student[] stu = new Student[5];
        stu[0] = new Student("raj", 22, 76);
        stu[1] = new Student("ankit", 21, 45);
        stu[2] = new Student("kunal", 78, 84);
        stu[3] = new Student("ankita", 88, 12);
        stu[4] = new Student("shiv", 24, 19);
        
        Arrays.sort(stu, (a, b) -> b.marks - a.marks);
        for(int i = 0; i < 5; i++) {
            System.out.println(stu[i].name + " " + stu[i].marks);
        }
    }

}
