package _04_amazing_games._2_dragon_fight;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {

	public static void main(String[] args) {

		Random ran = new Random();    //This will be used later to make random numbers. 

		ImageIcon dragon = new ImageIcon("src/_04_amazing_games/_2_dragon_fight/dragonPicture.jpg");
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);

		// 1. Create some variables to hold health levels
		 
			// playerHealth to store your health - set it equal to 100
		int health = 100;
			// dragonHealth to store the dragon's health - set it equal to 100
		int dHealth = 100;		
		// 2. Create some variables to hold the attack strengths. These will be given different values later. 
			
			// playerAttack to store the damage the player's attack will do - set it equal
			// to 0 for now.
		int strength = 0;
			// dragonAttack to store the damage the dragon's attack will do - set it equal
			// to 0 for now.
		int dStrength = 0;
		
		//  This while statement will cause the game attack code to repeat
		while (true) {

			// THE PLAYER ATTACKS THE DRAGON

				// 3. Ask the player in a pop-up if they want to attack the dragon with a yell
				// or a kick
			String input = JOptionPane.showInputDialog("null, Want to attack? (Choices: yell, or kick.)");
				// 4. If they typed in "yell":
				if (input.equalsIgnoreCase("yell")) {
				strength = ran.nextInt(11);
					}
					  // -- Find a random number between 0 and 10 and store it in playerAttack. Use
					  // ran.nextInt(10)
			
				// 5. If they typed in "kick":
				if (input.equalsIgnoreCase("kick")) {
				strength = ran.nextInt(26);
				}
					  // -- Find a random number between 0 and 25 and store it in playerAttack.
		
				// 6. Subtract the player attack value from the dragon's health
				dHealth -=strength;
			// THE DRAGON RETALIATES

				
				// 7. Find a random number between 0 and 35 and store it in dragonAttack
				dStrength = ran.nextInt(36);
				// 8. Subtract the dragon attack value from the player's health
				health-=dStrength;
			// ASSESS THE DAMAGE
				
				// 9. If the player's health is less than or equal to 0, the game is over,
				//    call the playerLost() method
				if (health <= 0) {
				playerLost();
				}
			
				// 10. If the dragon's health is less than or equal to 0, the game is over,
				//     call the dragonLost() method
				if (dHealth <= 0) {
				dragonLost();	
				}
			
				// 11.  Pop up a message that tells us how much health the player and
				// 		dragon have left.
				JOptionPane.showMessageDialog(null,"You have " + health + " health left. The dragon has " + dHealth + " health left.");
			
			// (Bonus: Also display the amount of health that was lost by each in this
			// round)
			

		} // this is the end of the while loop

	}

	static void playerLost() {
		// 11. Tell the player that they have been defeated by the dragon and have no treasure
				JOptionPane.showMessageDialog(null, "You died, and you failed to get the desire of treasure. :("); 

		System.exit(0);   //This code ends the program
	}

	static void dragonLost() {
		// 12. Tell the user that the dragon has been defeated and they get a ton of gold!
				JOptionPane.showMessageDialog(null, "You defeated the dragon and have won a ton of gold!");
		System.exit(0);   //This code ends the program
	}

}
