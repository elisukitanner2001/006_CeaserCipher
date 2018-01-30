package ceaser;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class BeginHere {

	public static void main(String[] args) {
		/* Doug's example of drop-down JOP, with adds by Mr. M */
		//Object is top class in Java, used when you are not sure what type might be used --
		//using a String, int, class object, or what? -- so use Object [] array to cover anything
		Boolean running = true;
		
		while (running =true) {
		Object[] selectionsArray = { "Encoder", "Decoder", "Cracker", "Exit"};
		
		String showFirst = "Encoder";
		String msg = "";
		String selection = (String) JOptionPane.showInputDialog(
				null, 
				"Message: Select a Utility: ",
				"Title: Julius Ceasar Paranoia", 
				JOptionPane.PLAIN_MESSAGE, 
				null, 
				selectionsArray, 
				showFirst);
		if (selection == null) selection = "Cancelled";// .equals doesn't work, null is not a String; also no curlies because one line only if statement
		JOptionPane.showMessageDialog(null, "You have selected: " + selection);

		switch (selection) { // switch on String allowed in Java 7 and higher
		case "Encoder":
			JOptionPane.showMessageDialog(null, 
					"We are now in the Encoder switch block");
			break;
			//break means all done, leave the switch block - almost always use break
			//if no break, execution continues for all remaining cases
		case "Decoder":
			JOptionPane.showMessageDialog(null, 
				"We are now in the Decoder switch block - add some code!");
			break;
		case "Cracker":
			JOptionPane.showMessageDialog(null, 
				"We are now in the Cracker switch block - add some code!");
			break;
		case "Exit":
			JOptionPane.showMessageDialog(null, 
				"We are now in the Exit switch block");
			running = false;
			System.exit(0);
			break;
		default:
			JOptionPane.showMessageDialog(null, 
				"We are now in the Unknown Case or Cancelled switch block");
			running = false;
			System.exit(0);
		}

		//after the break continue with the following code		
		//OK, back to our earlier code ...
		//Scanner kbd = new Scanner(System.in);
		CeaserCipher myCipher = new CeaserCipher();

		//System.out.println("Please enter the plain text to encode:");
		//String plainText = kbd.nextLine().toLowerCase();
		
		//JOptionPane.showMessageDialog(null, "Please enter the plain text to encode:");
		
		String plainText = JOptionPane.showInputDialog("Please enter plain text").toLowerCase();
		JOptionPane.showMessageDialog(null, "You have entered: " + plainText);

		//System.out.println("Please enter the key:");
		//int key = kbd.nextInt();
		msg = "Please enter the key: ";
		int key = Integer.parseInt(JOptionPane.showInputDialog(msg));
		//System.out.println("Your key is: " + key);

		String codedText = myCipher.encode(plainText, key);
		
		//System.out.println("Your secret message is: " + codedText);
		JOptionPane.showMessageDialog(null, codedText);
		

	}
	}

}
