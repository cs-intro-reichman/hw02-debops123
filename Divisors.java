/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int n = Integer.parseInt(args[0]);
		int i = 1; // TODO: name it divisor or d, not i
		while ( i <= n ) { 
			if ( n % i == 0)
			{
				System.out.println(i);
			}
			i++;
		}	
	}
}
