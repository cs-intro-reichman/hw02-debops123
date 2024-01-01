/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String str = args[0];
        int length = str.length();
		//String reversedStr = " ";
		StringBuilder reversedStr = new StringBuilder();
        for (int i = length - 1; i >= 0; i--) {
            reversedStr.append(str.charAt(i));
        }
		System.out.println(reversedStr);
		
		int middleIndex = length / 2;
		char middleChar;
		if (length % 2 != 0) {
            middleChar = str.charAt(middleIndex);
        } 
		else {
            middleChar = str.charAt(middleIndex - 1);
        }

        // Print the middle character(s)
        System.out.println("The middle character is " + middleChar);
	}
}
