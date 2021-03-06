package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nickles = JOptionPane.showInputDialog("How many nickles do you have?");
		// Convert their answer to an int using Integer.parseInt(
		int numbers = Integer.parseInt(nickles);

		// Ask the user how many dimes they have, and convert their answer
		String dimes = JOptionPane.showInputDialog("How many dimes do you have?");

		int number = Integer.parseInt(nickles);

		// Ask the user how many quarters they have, and convert their answer
		String quarters = JOptionPane.showInputDialog("How many quarters do you have?");

		int money = Integer.parseInt(nickles);

		// Calculate how much money the user has and save it in a double variable
		double totalMoney = money * 0.25 + number * 0.10 + numbers * 0.05;
		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, "You have $" + totalMoney);
	}
}
