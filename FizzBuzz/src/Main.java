public class Main {
    public static void main(String[] args) {
        // Write a simple FizzBuzz program here
        int counter = 1;
        while(counter < 101){
            if (counter % 15 == 0){
                System.out.println("FIZZBUZZ");
            }
            else if(counter % 3 == 0){
                System.out.println("FIZZ");
            }
            else if (counter % 5 == 0) {
                System.out.println("BUZZ");
            }
            else {
                System.out.println(counter);
            }
            counter++;
        }
    }
}