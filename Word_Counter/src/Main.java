import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // A simple project to split input and count the words.
        System.out.println("Please enter a paragraph. Let me count the words.");
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        String input = scanner.nextLine();
        // String[] arrayOfInput = input.split(" ", 0); This is wasting ram, we have the input stored, just use that
        System.out.println("Your entered paragraph contains " + input.split(" ", 0).length + " words.");
    }
}