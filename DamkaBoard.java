/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		
		for (int i = 1; i <= n; i++) { // TODO: rename it to row, i is to generic
			if (i % 2 == 0) {
				System.out.println(" *".repeat(n)); 
			}
			else {
				System.out.println("* ".repeat(n)); 
			}
		}
	}
}
