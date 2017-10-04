package tutorials;

import javax.swing.JOptionPane;

public class DoorChoice {

	public static void main(String[] args) {
		
		
		String choiceString;
		int doorChoice;
		
		
		
		choiceString = JOptionPane.showInputDialog(null, "Pick a door any door, 1, 2, 3.", "Door Choice" , JOptionPane.INFORMATION_MESSAGE);
				
				doorChoice = Integer.parseInt(choiceString);
				
				if(doorChoice == 1) {
					
					JOptionPane.showMessageDialog(null, "You win Nothing!!!");
					
					
				}
				if(doorChoice == 2) {
					
					JOptionPane.showMessageDialog(null, "You win less than Nothing!");
					
					
				}
				if(doorChoice == 3) {
					
					
					JOptionPane.showMessageDialog(null, "You win a brand new Huffy Bike!");
					
					
				}
				else 
					JOptionPane.showMessageDialog(null, "That number was not an option, I said 1-3.");
				
	
	
	
	}	
	

}
