import javax.swing.JOptionPane;

public class NameChecker {
	public static void main(String[] org) {
		JOptionPane.showMessageDialog(null, "Salutations, my name is Kaley");
		System.out.print("Salutations, my name is Kaley");
		System.out.println("");
		String NewName = JOptionPane.showInputDialog("What is your name?");
		System.out.print("My name is  " + NewName);
		if (NewName.equals("Kaley")) {
			JOptionPane.showMessageDialog(null, "Then, you have a great name");
			System.out.println("");
			System.out.print("Then, you should go find a better name");
		} else {
			JOptionPane.showMessageDialog(null, "Then, you should go find a better name");
		}

	}
}
