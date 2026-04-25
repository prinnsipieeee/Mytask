import java.util.Scanner;

public class Task7 {

    
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.print("Enter a first number: ");
        double num1 = t.nextDouble();

        System.out.print("Enter a Second Number: ");
        double num2 = t.nextDouble ();

        System.out.println("-RESULT-");
        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));

        if (num2 != 0) {
            System.out.println("Divide: " + divide(num1, num2));
        } else {
            System.out.println("Error Cannot divide by Zero");
        }
        t.close();
    } 
    public static double add(double num1, double num2){
        return num1 + num2;
    }
    public static double subtract(double num1, double num2){
        return num1 - num2;
    }
    public static double multiply(double num1, double num2){
        return num1 * num2;
    }
    public static double divide(double num1, double num2){
        return num1/num2;
    }
}
