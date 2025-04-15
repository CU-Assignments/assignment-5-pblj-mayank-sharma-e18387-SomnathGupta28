import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter numbers separated by spaces: ");
        String input = scanner.nextLine();
        
        String[] numberStrings = input.split(" ");
        List<Integer> numbers = new ArrayList<>();
        
        for (String numberString : numberStrings) {
            try {
                Integer number = Integer.parseInt(numberString); // Autoboxing
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Error: '" + numberString + "' is not a valid integer.");
            }
        }
        
        int sum = 0;
        for (Integer number : numbers) {
            sum += number; // Unboxing
        }
        
        System.out.println("Sum of numbers: " + sum);
        
        scanner.close();
    }
}