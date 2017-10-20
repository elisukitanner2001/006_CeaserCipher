package ceaser;

public class  CeaserCipher {
	
	private String alpha = "abcdefghijklmnopqrstuvwxyz";

	public String encode(String plainText, int key) {
		String secretText ="";
		int index, keyAdded;
		System.out.println("test, alpha length = " + alpha.length());
		System.out.println("test, first char is: " + alpha.charAt(0));
		System.out.println("test, alpha length = " + alpha.charAt(alpha.length()-1));
		
		for (int i = 0; i <alpha.length()-1; i++) {
			System.out.println(alpha.charAt(i));
		}
		
		System.out.println("\n\n");
		
		for (int i=0; i< plainText.length(); i++) {
			System.out.println(plainText.charAt(i));
			
		}
		for(int i=0; i<plainText.length();i++) {
			
			index = alpha.indexOf(plainText.charAt(i));
			//System.out.println("index = " + index);
			keyAdded = index + key;
			
			System.out.println("encoded is " + alpha.charAt(keyAdded));
		}
		
		return secretText;
	}
}
