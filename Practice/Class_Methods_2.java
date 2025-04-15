package Practice;

public class Class_Methods_2 {
    private void printMSG() {
        System.out.println("Hello World, from Java private method!");
    }

    public void _printMSG() {
        System.out.println("Hello World, from Java public method!");
    }

    public static void main(String[] args) {
        Class_Methods_2 innerClass = new  Class_Methods_2();    // 不加 Static 必須先初始物件
        innerClass.printMSG();
        innerClass._printMSG();
    }
}
