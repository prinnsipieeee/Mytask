import java.util.Random;
import java.util.Scanner;

public class GenerateRandom {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Enter a Number: ");
        int length = input.nextInt();

        String characters =  "ABCDEFGHIJKLMNOPQRSTUVWXYZ" 
                            + "abcdefghijklmnopqrstuvwxyz" 
                            + "0123456789"               
                            + "!@#$%^&*()-_=+[]{}|;:,.<>?";

        
        String result = "";

        for (int i = 0; i < length; i++) {

        int randomIndex = rand.nextInt(characters.length());

        char randomChar = characters.charAt(randomIndex);

        result += randomChar;

        }

        System.out.println("---");
        System.out.println("Generated output: " + result);
        System.out.println("---");

        input.close();



    }
    
}
