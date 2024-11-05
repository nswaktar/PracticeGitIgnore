import java.util.Scanner;
public class PracticeGitIgnore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the message: ");
        String message1 = scanner.nextLine();
        String message2 = scanner.nextLine();
        System.out.println(message1.concat(message2));
        scanner.close();
    }
}