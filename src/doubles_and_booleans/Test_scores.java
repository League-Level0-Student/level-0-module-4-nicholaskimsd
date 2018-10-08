
package doubles_and_booleans;

import javax.swing.JOptionPane;

public class Test_scores {


	public static void main(String[] args) {
	String joe = JOptionPane.showInputDialog("How did you do on your last test?");
	
	int cool = (Integer.parseInt(joe));
	if(cool>95) {
		
		JOptionPane.showMessageDialog(null, "WOW you must have studied hard!");
	}
	else {
		
	}
	 if(cool<90) {
		JOptionPane.showMessageDialog(null, "meh pretty good nice job");
	}
	 else {
		 
	 }
if(cool<75) {
	JOptionPane.showMessageDialog(null, "Cmon man you got to study!!!");
}
	}

}
