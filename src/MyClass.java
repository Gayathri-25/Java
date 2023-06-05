public class MyClass{
    private static int myVariable;

    static {
        myVariable = initializeVariable();
    }

    public static int getVariable() {
        return myVariable;
    }

    private static int initializeVariable() {
        // Your initialization logic here
        return 42; // Just an example value
    }

    public static void main(String[] args) {
        System.out.println(getVariable());
    }
}
