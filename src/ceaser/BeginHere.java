package ceaser;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class BeginHere {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
				
		CeaserCipher myCipher = new CeaserCipher();
		
		System.out.println("please enter the plain text to encode.");
		String plainText = kbd.nextLine();
		
		System.out.println("Please enter a key:");
		 int key = kbd.nextInt();
		 System.out.println("Your key is: " + key);
		 
	String codedText =	myCipher.encode(plainText, key);
	System.out.println("Your Secret message is: " + codedText);

}
}