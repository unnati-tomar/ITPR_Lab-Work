import java.util.Scanner;
class Averagenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[15];
        int sum = 0;
        System.out.println("Enter 15 numbers:");
        for (int i = 0; i < 15; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i]; // add to sum
        }
        double average = sum / 15.0; // divide total sum by 15
        System.out.println("Average is: " + average);
    }
}
