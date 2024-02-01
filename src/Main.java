import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //generate random number

        //Greeting
        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello "+ name);

        //Ask if should start game
        System.out.println("1.Play Game \n2.Exit");
        int choice = input.nextInt();

        if(choice == 1){
           Game();
        } else if (choice == 2) {
            System.out.println("Exiting...");

            System.exit(0);
        }


    }
    //Game logic
    public static void Game(){
        int count = 1;
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(20)+1;
        System.out.println("Enter a number between 1-20");
        int guess = input.nextInt();

        //core game logic
        while(guess != number && count<5){
            if(guess<number){
                System.out.println("The mystery number is greater than your guess");
                count++;
                System.out.println("Enter a number between 1-20");
                guess = input.nextInt();
            }

            if(guess>number){
                System.out.println("The mystery number is less than your guess");
                count++;
                System.out.println("Enter a number between 1-20");
                guess = input.nextInt();
            }

            //user fails if does not guess in under 5 tries
            if(count == 5){
                System.out.println("You failed to guess the correct number "+number);

              break;
            }
            //User wins if guesses correct number
            if(guess == number){
                System.out.println("Congratulions you guessed the correct number: "+number);

                break;
            }

        }



    }
}