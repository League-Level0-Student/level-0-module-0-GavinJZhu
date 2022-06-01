package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		String question = JOptionPane.showInputDialog ("What is 69x69");
				// 2.  Ask the user a question 
				
				// 3.  Use an if statement to check if their answer is correct
				if (question.equalsIgnoreCase("4761")) {
				score += 1;
				}
				// 4.  if the user's answer was correct, add one to their score 
				String questions  = JOptionPane.showInputDialog ("What is the name for the thing at the end of a shoelace?");
				if (questions.equalsIgnoreCase("aglet")) {
				score += 1;
					}
				String questionss = JOptionPane.showInputDialog ("Whats the capital of North Macedonia?");
				if (questionss.equalsIgnoreCase("Skopje")) {
				score += 1;
					}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
				JOptionPane.showMessageDialog(null, "Your score is " +score);
	}
}
