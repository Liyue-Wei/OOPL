package Practice;

public class Random {
    public static void main(String[] args) {    // low_range = 50; high+range = 100
        for (int i = 0; i < 2048; i++) {
            int rand = 50 + (int)(Math.random() * (100 - 50));
            System.out.println(rand);
        }
    }
}
