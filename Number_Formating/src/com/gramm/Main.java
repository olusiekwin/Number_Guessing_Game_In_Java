package com.gramm;
import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        int attempt = 1;
        int userGuessNumber = 0;
        int secretNumber = (int) (Math.random() * 99 + 1);
        Scanner userInput = new Scanner(System.in);
        System.out.println("Hey): Want to try Guess Number Game \n Guess A Number To Win The Game \nYou have 5 Attempts remaining");
        do {
            System.out.print("please enter a guess number between 1 to 100\n");
            if(userInput.hasNextInt()) {
                userGuessNumber = userInput.nextInt();
                if (userGuessNumber == secretNumber)
                {
                    System.out.println("Gaddamitt!, Your Number is Correct. You Win the Game!");
                    break;
                }
                else if (userGuessNumber < secretNumber)
                    System.out.println("Your Guess Number is much less.");
                else if (userGuessNumber > secretNumber)
                    System.out.println("Your Guess Number is much higher.");
                if(attempt == 5) {
                    System.out.println("Sorry mate you have exceeded the maximum attempt. Try Again");
                    break;
                }
                attempt++;
            }else {
                System.out.println("Please enter a Valid Integer Number");
                break;
            }
        } while (userGuessNumber != secretNumber);
    }
}
