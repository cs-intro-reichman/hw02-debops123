/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int number = Integer.parseInt(args[0]);
        int sumOfDivisors = 1;
		String resultString = number + " is a perfect number since "+number+" = 1";
		
		
		for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
                resultString= resultString+" + "+i;
            }
        }
        if (sumOfDivisors != number) {
			resultString=number + " is not a perfect number";
        }
		
		System.out.println(resultString);


	}
}
