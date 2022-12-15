/*
1.	You have to design the code such that the user has only three tries to guess the correct pin of the account. 
You set the pin as a constant. When correct display “Correct, welcome back.” 
When incorrect display “Incorrect, try again.”. When ran out of three tries display “Sorry but you have been locked out.”
 */

import java.util.Scanner;
public class GuessThePin
{
	public static void main(String[] args)
	{
		
		final int pin=07;
		int guessPin;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i<=3; i++)
		{
			System.out.println("Guess the pin of the correct pin of the account: ");
			guessPin = sc.nextInt();
			
			if (guessPin == pin)
			{
				System.out.println("Correct, welcome back.");
				break;
			}
			else{
				count++;
				if(count >= 3)
				{
					System.out.println("Sorry but you have been locked out.");
					break;
				}				
			
				System.out.println("Incorrect, try again.");
				
				
			}
			
		}	

	}
}