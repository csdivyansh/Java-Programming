public class palindrome {
    public static void main(String[] args) {
        String tmp = "";
        String str = "Naman";
        str = str.toLowerCase();

        for (int i = str.length() - 1; i >= 0 ; i--) {
            tmp += str.charAt(i);
        } 
        System.out.println(tmp);
        if (tmp.equals(str)) {
            System.out.println("Palindrome!");
        } else {
            System.out.println("Not a palindrome");
        }

    }
}
