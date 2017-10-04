package excercises;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int evenNumber;
		int oddNumber;
		int startingNumber;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("input a starting number here >> ");
		startingNumber = input.nextInt();
		
		if((startingNumber%2)==0) {
			System.out.println("Number is even");
		}
			   
			else {
				System.out.println("Number is odd");
			}
			  
		
		
		
	}

}
