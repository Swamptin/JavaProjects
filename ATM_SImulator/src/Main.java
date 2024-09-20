import java.io.InputStreamReader;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numFive, numTen, numTwenty, numFifty, remainder;
        numFive = numTen = numTwenty = numFifty = remainder = 0;


        // Ask the user for input
        System.out.println("Please enter the amount of money you would like to withdraw:");
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        Integer total = Optional.ofNullable(scanner.nextLine())
                .filter(input -> !input.isEmpty())
                .filter(input -> input.matches("^\\d+"))
                .map(Integer::parseInt)
                .orElseGet(() -> {
                    System.out.println("Please enter a valid value greater than 5");
                    return 0;
                });
        remainder = total;

        // Figure out the note breakdown
        while (remainder > 0){
            if(remainder/50 > 0){
                numFifty = remainder/50;
                remainder = remainder%50;
            }
            if(remainder/20 > 0){
                numTwenty = remainder/20;
                remainder = remainder%20;
            }
            if(remainder/10 > 0){
                numTen = remainder/10;
                remainder = remainder%10;
            }
            if(remainder/5 > 0){
                numFive = remainder/5;
                remainder = remainder%5;
            }
        }
        System.out.println("The total number of notes to dispense "+total+"is:\n"+numFifty+" €50\n"+numTwenty+" €20\n"+numTen+" €10\n"+numFive+" €5");
    }
}