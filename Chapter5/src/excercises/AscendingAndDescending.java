package excercises;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingAndDescending {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("insert first number here >> ");
		num1 = input.nextInt();
		System.out.println("insert Second number here >> ");
		num2 = input.nextInt();
		System.out.println("insert Third number here >> ");
		num3 = input.nextInt();
		
		  
	
		  if (num1 > num2 && num2 > num3) {
		    System.out.println("The Order is " + num1 +" "+num2+" "+num3);
		    System.out.println("The Order is " + num3 +" "+num2+" "+num1);

		  } else if (num1 > num2 && num2 < num3) {
		   
			  System.out.println("The Order is " + num1 +" "+num3+" "+num2);
			  System.out.println("The Order is " + num2 +" "+num3+" "+num1);
		  } else if (num2 > num1 && num1 > num3) {
			  System.out.println("The Order is " + num2 +" "+num1+" "+num3);
			  System.out.println("The Order is " + num3 +" "+num1+" "+num2);

		  } else if (num2 > num1 && num1 < num3 && num3 < num2) {
		    
			  System.out.println("The Order is " + num2 +" "+num3+" "+num1);
			  System.out.println("The Order is " + num1 +" "+num3+" "+num2);
		  } else if (num3 > num1 && num1 > num2) {
			  System.out.println("The Order is " + num3 +" "+num1+" "+num2);
			  System.out.println("The Order is " + num2 +" "+num1+" "+num3);
		  }

		  else {
		    
			  System.out.println("The Order is " + num3 +" "+num2+" "+num1);
			  System.out.println("The Order is " + num1 +" "+num2+" "+num3);
		  }
	}

}
