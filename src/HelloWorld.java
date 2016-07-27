import javax.swing.JOptionPane;

public class HelloWorld {
	public static void main(String[] org) {
		System.out.print("Hi Zaccone");
		System.out.println(" Another Message");
		System.out.print("Pokemon");
		System.out.println(" Another Message");
		JOptionPane.showMessageDialog(null, "This is a Pop-Up");
		int x = 7;
		double y = 3.14;
		char z = 'f';
		String name = " Kaley";

		System.out.println("Hello" + name);
		JOptionPane.showInputDialog("Enter Your SSN");
		String usersName = JOptionPane.showInputDialog("Enter Name");
		System.out.println("Hi " + usersName);

	}

}
