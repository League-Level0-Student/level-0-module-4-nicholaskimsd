package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	static int happinessLevel = 0;
	// this will be used to store the happiness of your pet

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		String lol = JOptionPane.showInputDialog("what type of pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 3; i++) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their
			// pet happy

			// (eg: cuddle, food, water, take a walk, groom, clean up poop).
			// Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "what do you want to do to keep your peet happy", "HAPPY PET",
					0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "walk it", "buy the most expensive things you can buy for your pet",
							"drive your pet in a bugatti chiron" },
					null);

			// 5. Use user input to call the appropriate method created in step 4.
			System.out.println(task);
			if (task == 0) {
				walkpet();
			}
			if (task == 2) {
				drivepetinbugattichiron();
			}
			if (task == 1) {
				buythemostexpensivethingsforpet();
			}
			// JOptionPane.showMessageDialog(null, "your pet is longer your friend");
			// }
			// 6. If you determine the happiness level is large enough, tell the
			// user that he loves his pet and use break; to exit for loop.
		}
	}

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
	static void walkpet() {
		JOptionPane.showMessageDialog(null, "thats cheap bro get more mulah to spend on me");
		happinessLevel = -9;
		System.out.println(happinessLevel - 9);
	}

	static void drivepetinbugattichiron() {
		JOptionPane.showMessageDialog(null, "WOOOOHHHHOOOO.  Now were talking");
		happinessLevel = happinessLevel + 9;
		System.out.println(happinessLevel + 9);
	}
	static void buythemostexpensivethingsforpet() {
		JOptionPane.showMessageDialog(null, "Some kids are starving in Japan");
		happinessLevel = -10;
		System.out.println(happinessLevel -10);
	}
}