public class EvenOrOdd{
 public static void main(String[] args) {
        // Declare and initialize the number
        int number = 15;

        // Using the conditional (ternary) operator to check if the number is even or odd
        String result = (number % 2 == 0) ? "Even" : "Odd";

        // Print the result
        System.out.println("The number " + number + " is " + result + ".");
    }
}
