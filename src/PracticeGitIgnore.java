import java.util.Scanner;
public class PracticeGitIgnore {
    public static void main(String[] args) {

        String name= Helper.getInput("Enter your name: ");
        int age= Helper.getIntInput("Enter your age: ");
        System.out.println("Hi Mr. "+name+" your age is "+age);
        Helper.closeScanner();
    }
}