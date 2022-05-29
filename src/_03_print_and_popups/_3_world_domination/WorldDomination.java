package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		
		// 1. Ask the user if they know how to write code.
		String question = JOptionPane.showInputDialog ("Do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.
		if (question .equalsIgnoreCase("yes")) {
		JOptionPane.showMessageDialog(null,"You will take over the world.");
		}
		else {
		JOptionPane.showMessageDialog(null,"Sign up at The League of Amazing Programmers!");
		}
		// 3. Otherwise, tell them to sign up for classes at The League.

	}
}

