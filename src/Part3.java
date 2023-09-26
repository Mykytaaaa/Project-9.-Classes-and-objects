public class Part3 {
    public static void main(String[] args) {
        MyClass.value = 5;
        MyClass class1 = new MyClass();
        MyClass class2 = new MyClass();
        System.out.println("class1.value = " + class1.value);
        System.out.println("class2.value = " + class2.value);
        class1.value = 3;
        System.out.println("Value changed for class1");
        System.out.println("class1.value = " + class1.value);
        System.out.println("class2.value = " + class2.value);

        MyClass.printA();
        class1.callPrintA();
        class1.callPrintAStatic();
    }
}

class MyClass {
    public static int value = 0;
    public static void printA() {
        System.out.println("a");
    }
    public void callPrintA() {
        printA();
    }
    public static void callPrintAStatic() {
        printA();
        //callPrintA();
    }
}
