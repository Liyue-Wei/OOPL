package HomeWork.HW4_Ch05;

public class HW {
    public static void main(String[] args) {
        double principal = 10e5;
        double interest = 0.02;
        int year = 5;
        for (int i = 1; i <= year; i++) {
            principal *= (1 + interest);
        }
        System.out.println("5年後本利和為" + principal);
    }
}
