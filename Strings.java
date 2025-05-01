public class Strings {

    public static void fact(int n) {

    }
    public static void main(String[] args) {
        String str = "Hello";
        String str1 = "Hello"; // str and str2 refers to same object

        String str2 = new String("Hello"); // str2 will point to different obj

        if (str == str2) { //checks reference equality
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        if (str.equals(str2)) { //checks value equality
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        //checks lexicographical comparison
        System.out.println("HI".compareTo(str2));

        String str3 = str1 + str2;
        String str4 = str1.concat(str2);
        System.out.println(str3.compareTo(str4));

    }
}
