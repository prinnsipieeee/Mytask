import java.util.Scanner;

public class Task5 {
    public static void main(String... args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("\nEnter Three Numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int largest;

        if (num1 == num2 && num1 == num3) {
            System.out.println("ALL NUMBERS ARE EQUAL");
        } else {
            largest = num1;

            if (num2 > largest) {
                largest = num2;     
            }

            if (num3 > largest) {
                largest = num3;
            }

            System.out.println("The Largest number is: " + largest);
        
        scanner.close();
        }
    }
}
