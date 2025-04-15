package HomeWork.HW5_Ch06;

public class HW {
    private int factorial(int x, int n) {
        if (n == 1) return x;
        else return x * factorial(x, n - 1);
    }

    public static void main(String[] args) {
        int i, n;
        java.util.Scanner input = new java.util.Scanner(System.in);
        HW innerclass = new HW();
        System.out.print("乘數=> ");
        i = input.nextInt();
        System.out.print("\n請輸入次方=> ");
        n = input.nextInt();
        System.out.printf("%d的%d次方=%d\n", i, n, innerclass.factorial(i, n));
    }
}
