package internship;
import java.util.Random;
import java.util.Scanner;
public class Codsoftproject1 {

	public static void main(String[] args) {
		
		  Scanner scanner = new Scanner(System.in);

	        Random random = new Random();

	        
	        int range = 100; 
	        int maxAttempts = 10; 
	        int rounds = 3;
	        int score = 0; 
	        System.out.println("Welcome to the number guessing game!");
	        System.out.println("You have to guess a number between 1 and " + range + " in " + maxAttempts + " attempts.");
	        System.out.println("You will play " + rounds + " rounds. Your score will be based on the number of attempts taken.");
	        System.out.println("Let's begin!");

	        
	        for (int round = 1; round <= rounds; round++) {
	            int number = random.nextInt(range) + 1;
	            int attempts = 0;
	            System.out.println("\nRound " + round + ":");
	            while (true) {
	                System.out.print("Enter your guess: ");
	                int guess = scanner.nextInt();
	                attempts++;

	                if (guess == number) {
	                    System.out.println("You got it! The number was " + number + ".");
	                    break;
	                } else if (guess > number) {
	   
	                    System.out.println("Your guess is too high.");
	                } else {
	                 
	                    System.out.println("Your guess is too low.");
	                }

	                if (attempts == maxAttempts) {
	                    System.out.println("Sorry, you have used up all your attempts. The number was " + number + ".");
	                    break;
	                }
	            }
	            score += maxAttempts - attempts;
	            System.out.println("Your score after round " + round + " is: " + score);
	        }
	        System.out.println("\nThank you for playing the number guessing game! Your final score is: " + score);
	        scanner.close();
		}

	
	}
