package HomeWork.HW2_Ch03;

public class HW {
    public static void main(String[] args) {
        double i = 10e5;
        for(int n = 0; n < 5; n++) {
            i*=1.02;
        }

        System.out.printf("5年後本利合為 : %.0f%n", i);
    }
}
