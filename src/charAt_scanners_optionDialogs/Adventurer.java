
 

package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class Adventurer {

		public static void main(String[] args) {
			JOptionPane.showMessageDialog(null, "please answer no caps");
String lol = JOptionPane.showInputDialog("You are alone in the forest.  You need to get back home but you dont, know the exact way to get their.  The path forks two ways.  WHAT WILL YOU CHOOSE.  PATH 1 OR PATH2");

if(lol.equals("path 1")) {
JOptionPane.showMessageDialog(null, "YAY you made it only to find yourself with more challenges.");
	String po = JOptionPane.showInputDialog("next their are 3 paths.  Night is falling so you must hurry.  Do you take the shortcut or do you take the long way?");
	if(po.equals("shortcut")) {
		JOptionPane.showMessageDialog(null, "Nice job you are almost at your house");

	}
	String hi = JOptionPane.showInputDialog("You are finally  at the last path.  Do you swim through the lake, do you go around it, or do you wait for day to fall.");
	if( hi.equals("go around it")) {
		JOptionPane.showMessageDialog(null, "YAY now you have one more task to complete.");
		String jello = JOptionPane.showInputDialog("The final one do you go straight through the front door, or through the back door");
		if(jello.equals("back door")) {
			JOptionPane.showMessageDialog(null, "YES you got to your house.  Your mom didnt even notice, and your back in time fo dinner.");
		}
	}
}
else {
	JOptionPane.showMessageDialog(null, "yikes you go down that path only to find yourself lost even more.  YOU LOOSE");
}

	}

}
