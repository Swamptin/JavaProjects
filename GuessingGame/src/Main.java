import java.io.InputStreamReader;
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int bound = 10;
        Integer ans = new Random().nextInt(bound);

        System.out.println("Please guess a number between 0 and "+bound);
        while (true){
            Scanner scanner = new Scanner(new InputStreamReader(System.in));
            Integer guess = Optional.ofNullable(scanner.nextLine())
                    .filter(input -> !input.isEmpty())
                    .filter(input -> input.matches("^\\d+"))
                    .map(Integer::parseInt)
                    .orElseGet(() -> {
                        System.out.println("You must input an integer");
                        return -1;
                    });

            if(guess > bound){
                System.out.println("That guess was greater than the limit. \nPlease guess within the limit of 0 and "+bound);
            } else if (guess.equals(ans)){
                System.out.println("You guessed correctly!!!");
                break;
            } else {
                System.out.println("Your guess was incorrect. Please try again.");
            }
        }
    }
}