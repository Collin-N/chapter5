package excercises;

import java.util.Scanner;

public class pizzaHut {

	public static void main(String[] args) {
		
		String choiceYes;
		String size;
		String pizzaKind;
		String choiceHotDog;
		double mediumCost = 9.99;
		double largeCost = 12.99;
		double smallCost = 6.99;
		double hotDogCost = 11.99;
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Would you like a pizza? Yes or No?>>>>> ");
		choiceYes = input.nextLine();
		if("Yes".equalsIgnoreCase(choiceYes)||"Y".equalsIgnoreCase(choiceYes))
		{
			System.out.println("You said " + choiceYes + " to having pizza.");
			 System.out.println("Please chosse a size small, medium or large? >>> ");
			 size = input.nextLine();
			 if("Small".equalsIgnoreCase(size))
			 {
				 
				 System.out.println("You said " + size + " pizza size.");
				 System.out.print("What kind of Pizza do you want? Peperoni, Sausage, Cheese?");
				 pizzaKind = input.nextLine();
				 if("Pepperoni".equalsIgnoreCase(pizzaKind) || "Sasage".equalsIgnoreCase(pizzaKind) || "Cheese".equalsIgnoreCase(pizzaKind)) 
						 {
					 		
					 		System.out.println("You ordered is " +  size  +" "+ pizzaKind + "pizza for $" + smallCost);
					 
					 
						 } 
			 }
			if("Medium".equalsIgnoreCase(size)) {
				
				
				 System.out.println("You said " + size + " pizza size.");
				 System.out.print("What kind of Pizza do you want? Peperoni, Sausage, Cheese?");
				 pizzaKind = input.nextLine();
				 if("Pepperoni".equalsIgnoreCase(pizzaKind) || "Sasage".equalsIgnoreCase(pizzaKind) || "Cheese".equalsIgnoreCase(pizzaKind)) 
						 {
					 
					 		
					 System.out.println("You ordered is " +  size  +" "+ pizzaKind + " pizza for $" + mediumCost);
					 
						 } 
				
				
			}
			if("large".equalsIgnoreCase(size)) {
				
				
				 System.out.println("You said " + size + " pizza size.");
				 System.out.print("What kind of Pizza do you want? Peperoni, Sausage, Cheese?");
				 pizzaKind = input.nextLine();
				 if("Pepperoni".equalsIgnoreCase(pizzaKind) || "Sasage".equalsIgnoreCase(pizzaKind) || "Cheese".equalsIgnoreCase(pizzaKind)) 
						 {
					 
					 System.out.println("You ordered is " +  size  +" "+ pizzaKind + "pizza for $" + largeCost);
					 
					 
						 } 
			}
			if("No".equalsIgnoreCase(choiceYes) || "N".equalsIgnoreCase(choiceYes)) {
				
				System.out.println("Would you like a hotdog instead Yes or No >> ");
				choiceHotDog = input.nextLine();
				if("Yes".equalsIgnoreCase(choiceHotDog) || "Y".equalsIgnoreCase(choiceHotDog)) {
				
					System.out.println("you ordered a hotdog for $" + hotDogCost);
					
					
				}
				if("No".equalsIgnoreCase(choiceHotDog) || "N".equalsIgnoreCase(choiceHotDog)) {
					
					System.out.println("why are you here if you are not going to order");
				
				}
			}
				
			
			
			
			
		}
			
				
	}

}
