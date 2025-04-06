package Practice;

public class Recursion {
    private double factorial(int i) {
        if (i == 1) return 1;
        else return i * factorial(i - 1);
    }

    public static void main(String[] args) {
        Recursion fact = new Recursion();
        int i = 0;
        System.out.print("輸入 n 階層 : ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        i = input.nextInt();
        System.out.println(fact.factorial(i));
    }
}
