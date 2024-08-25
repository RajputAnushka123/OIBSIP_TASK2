package bean;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
	 private static int minRange = 1;
	 private static int maxRange = 100;
	 private static int maxAttempt = 10;
	 private static int maxRound = 3;
	 public static void main(String args[]) {
		Random rand=new Random();
		Scanner sc=new Scanner(System.in);
		int totalScore=0;
		System.out.println("NUMBER GUESSING GAME");
        System.out.println("Total Number Of Rounds : 3");
        System.out.println("Attempts To Guess Number In Each Round : 10\n");
        for(int i=1;i<=maxRound;i++) {
        	int num=rand.nextInt(maxRange)+minRange;
        	int attempt=0;
        	System.out.printf("Round %d: Guess the Number between %d and %d in %d Attempts.\n", i, minRange, maxRange,maxAttempt);
        	
        	while(attempt<maxAttempt) {
        		System.out.println("Enter your Guess :");
        		int guessNo=sc.nextInt();
        		attempt+=1;
        		if (guessNo == num) {
                    int score = maxAttempt - attempt;
                    totalScore = totalScore + score;
                    System.out.printf("Hurray! Number Guessed Successfully. Attempts = %d. Round Score = %d\n",
                            attempt, score);
                    break;
                }

                else if (guessNo < num) {
                    System.out.printf("The Number is greater than %d. Attempts Left = %d.\n", guessNo,maxAttempt - attempt);
                }

                else if (guessNo > num) {
                    System.out.printf("The Number is less than %d. Attempts Left = %d.\n", guessNo,maxAttempt - attempt);
                }
        	}
        	if (attempt == maxAttempt) {
                System.out.printf("\nRound = %d\n", i);
                System.out.println("Attempts = 0");
                System.out.printf("The Random Number Is : %d\n\n", num);
            }
        }
        
        System.out.printf("Game Over. Total Score = %d\n", totalScore);
        sc.close();
        
        
	}
}
