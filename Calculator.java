import java.util.*;

class Calculator {
    public static int Add(int a, int b) {
        return a + b;
    }

    public static int Subtract(int a, int b) {
        return a - b;
    }

    public static int Multiply(int a, int b) {
        return a * b;
    }

    public static int Divide(int a, int b) {
        if (b == 0) {
            System.out.println("Invalid Operation: Division by zero");
            return 0; // Return a default value
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Calculator World");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("If you want to add then type add and same for subtract, multiply, and divide:");
        String abc = sc.next();

        if (abc.equals("add")) {
            int ans = Add(a, b);
            System.out.println("Result: " + ans);
        } else if (abc.equals("subtract")) {
            int ans = Subtract(a, b);
            System.out.println("Result: " + ans);
        } else if (abc.equals("multiply")) {
            int ans = Multiply(a, b);
            System.out.println("Result: " + ans);
        } else if (abc.equals("divide")) {
            int ans = Divide(a, b);
            System.out.println("Result: " + ans);
        } else {
            System.out.println("Invalid Operation: Please type a valid operation (add, subtract, multiply, divide)");
        }

        sc.close(); // Close the Scanner
    }
}
