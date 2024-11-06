import java.util.Scanner;
public class Helper {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
    // Method to get integer input
    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        // Code to check for integer input
        return scanner.nextInt(); // replace with actual integer input
    }
    // Method to close scanner
    public static void closeScanner() {
        scanner.close();
    }
}
