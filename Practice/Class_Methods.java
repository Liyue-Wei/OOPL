package Practice;

public class Class_Methods {
    private static void printMSG() {
        System.out.println("Hello World, from Java private static method!");
    }

    public static void _printMSG() {
        System.out.println("Hello World, from Java public static method!");
    }

    public static void main(String[] args) {
        printMSG();
        Class_Methods.printMSG();

        _printMSG();
        Class_Methods._printMSG();

        // innerClass = new Class_Methods();
        // innerClass.printMSG();
        // innerClass._printMSG();
    }
}
