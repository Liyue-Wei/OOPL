package Practice;

public class Class_Methods {    // Class
    private static void printMSG() {    // Method
        System.out.println("Hello World, from Java private static method!");
    }

    public static void _printMSG() {    // Method
        System.out.println("Hello World, from Java public static method!");
    }

    public static void main(String[] args) {    // Main Method
        printMSG();
        Class_Methods.printMSG();    // 加 Static 可以直接呼叫

        _printMSG();
        Class_Methods._printMSG();

        Class_Methods innerClass = new Class_Methods();    // 初始物件
        innerClass.printMSG();
        innerClass._printMSG();
    }
}
