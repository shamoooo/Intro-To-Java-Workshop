import javax.swing.JOptionPane;

public class MadLibs {
	public static void main(String[] org) {
		System.out.print("Alien Abduction");
		System.out.println("");
		String AdjectiveForAlien = JOptionPane.showInputDialog(" Adjective");
		System.out.print("I was casually walking through the streets when a " + AdjectiveForAlien);
		String NounForAlien = JOptionPane.showInputDialog(" Noun");
		System.out.println(" capsule popped out of the " + NounForAlien);
		String NounForFelt = JOptionPane.showInputDialog(" Noun");
		System.out.print("I then felt a " + NounForFelt);
		String BodyPart = JOptionPane.showInputDialog(" Body Part");
		System.out.print(" drop on my " + BodyPart);
		String NounForPull = JOptionPane.showInputDialog("Noun ");
		System.out.print(" I was then pulled up into a " + NounForPull);

	}

}
