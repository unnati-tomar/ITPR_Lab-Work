import java.util.Scanner;
import java.util.Scanner;
public class Evennumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers; //declaration of array
        numbers = new int[19]; // intialize array of 19 numbers
        System.out.println("Enter 19 numbers:");
        for (int i = 0; i < 19; i++) {
            numbers[i] = sc.nextInt();
        }

        // Display even numbers
        System.out.println("Even numbers are:");
        for (int i = 0; i < 19; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }

        sc.close();
    }
}
