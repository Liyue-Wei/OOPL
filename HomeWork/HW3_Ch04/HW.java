package HomeWork.HW3_Ch04;

public class HW {
    public static void main(String[] args) {
        double d;
        int flag;
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("請輸入金額：");
        d = input.nextDouble();
        if (d > 10e5) flag = 1;
        else flag = 2;

        switch (flag) {
            case 1:
                for(int n = 0; n < 5; n++) {
                    d*=1.02;
                }
                break;
            case 2:
                for(int n = 0; n < 5; n++) {
                    d*=1.01;
                }
                break;
        }
        System.out.println("5年後本利和為"+d);
    }
}