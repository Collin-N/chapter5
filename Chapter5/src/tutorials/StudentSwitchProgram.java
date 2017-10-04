package tutorials;

import java.util.Scanner;

public class StudentSwitchProgram {

	public static void main(String[] args) {
	
		int user;
		
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.println("Please enter your student number >>>");
		user = input.nextInt();
		
		
		switch(user)
		{
		case 311508:
			System.out.println("Hello Keegan");
			break;
		case 132043:
			System.out.println("Hello Alyssa");
			break;
		case 201524:
			System.out.println("Hello Dylan");
			break;
		case 131512:
			System.out.println("Hello Austin");
			break;
		case 179978:
			System.out.println("Hello Braden");
			break;
		case 138445:
			System.out.println("Hello Chance");
			break;
		case 313011:
			System.out.println("Hello Aaron");
			break;
		case 122552:
			System.out.println("Hello Computer");
			break;
		case 300993:	
			System.out.println("Hello Collin");
			break;
		}

	}

}
