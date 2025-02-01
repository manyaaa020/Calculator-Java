import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInput userInput = new UserInput(scanner);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.println("Select operation: \n1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Fibonacci\n6. Sum of Array\n7. Mean\n8. Variance\n9. Standard Deviation\n10. Exit");
            int choice = scanner.nextInt();

            if (choice == 10) break;

            userInput.handleChoice(choice, calculator);
        }
        scanner.close();
    }
}