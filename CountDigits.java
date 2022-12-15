/* 2.	Write a Java class called CountDigits. Here you need to accept a number as input.
 And you have to find how many digits are there in that number. For example, 
 if you get a number as 37921, then your output should be 5. You MAY assume that accepted number is a positive integer.
 */

import java.util.Scanner;

public class CountDigits 
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter number:");
        int no = sc.nextInt();
        if(no > 0)
		{
           while(no !=0)
		   {
               no = no/10;
               count++;
		   }
        }
		else 
		{
            System.out.println("Input should be positive number.");
        }
        System.out.println("Number of digits:"+count);
    }
}