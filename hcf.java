public class hcf {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int r = num1 % num2;

        while(r != 0) {
            num1 = num2;
            num2 = r;
            r = num1 % num2;
        }

        System.out.println("HCF is: " + num2);
    }
}
