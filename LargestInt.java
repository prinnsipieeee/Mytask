import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LargestInt{
    public static void main(String[] args) {
        System.out.println("Enter a number(input a non-integer to stop): ");
        Scanner input = new Scanner(System.in);
        List<Integer> o = new ArrayList<>();
        boolean allNumEq = true;

        while (input.hasNextInt()) {
            int current = input.nextInt();
            o.add(current);

            // I-check kung ang bagong number ay kapareho ng nauna
            if (o.size() > 1) {
                if (!o.get(o.size() - 1).equals(o.get(o.size() - 2))) {
                allNumEq = false; // Kapag may isang hindi nag-match, false na forever
            }
        }
    }

        if (o.isEmpty()){
            System.out.println("No numbers entered.");
        } else {
            System.out.println((allNumEq) ? "All numbers are equal" : "The largest int: " + Collections.max(o));
        }
        input.close();
    }

}