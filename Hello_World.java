import java.util.Scanner;

public class Hello_World {
    public static void main(String[] args) {
        System.out.println("Hello World from Java with JetBrains intelliJ IDEA");

        System.out.println("Press enter to continue...");
        try {
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
        }
        catch (Exception e) {}
    }
}
