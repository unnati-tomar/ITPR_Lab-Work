import java.util.Scanner;

class Operator {

    // Method to add two numbers
    static int add(int c, int d) {
        return c + d;
    }

    // Method to find difference
    static int difference(int c, int d) {
        return c - d;
    }

    // Method to find product
    static int product(int c, int d) {
        return c * d;
    }
    // Method to find division
    static int division(int c, int d){
        return c / d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int p = sc.nextInt();

        System.out.print("Enter second number: ");
        int q = sc.nextInt();

        System.out.println("Addition: " + add(p, q));
        System.out.println("Difference: " +difference(p, q));
        System.out.println("Product: " + product(p, q));
        System.out.println("Division:" + division(p,q));
    }
}
