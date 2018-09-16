package charAt_scanners_optionDialogs;

import java.nio.charset.MalformedInputException;

import javax.swing.JOptionPane;

public class riddlesforfun {
public static void main(String[] args) {


String hi  =JOptionPane.showInputDialog("what did you get on your last test?");
int numbers = Integer.parseInt(hi);
if (numbers>90) {
	JOptionPane.showMessageDialog(null, "nice job on your test");
	
	}
if (numbers>80) {
	JOptionPane.showMessageDialog(null, "pretty good");
}
if (numbers>70) {
	JOptionPane.showMessageDialog(null, "you can do better");

}
if (numbers>60) {
	JOptionPane.showMessageDialog(null, "lol you suck no retakes");	

}
}
}
