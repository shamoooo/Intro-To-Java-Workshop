import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String CodeBackground = JOptionPane.showInputDialog("Do you know how to write code?");

		// 2. If they say "yes", tell them they will rule the world.
		if (CodeBackground.equals("yes")){
			JOptionPane.showMessageDialog(null, "Then, you will rule the world");
		}

		// 3. Otherwise, wish them good luck washing dishes.

	}else

	{
		JOptionPane.showMessageDialog(null, "Them, good luck washing filthy dishes");
	}
}}
