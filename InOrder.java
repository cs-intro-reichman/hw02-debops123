/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int firstNum = (int) (Math.random() * 10);
        System.out.print(firstNum);
		// TODO insert empty line for space
		while (true) {
			int randomNum = (int) (Math.random() * 10);

			// TODO: I would write it this way:
			//      more readable in my opinion

			// if (randomNum < firstNum)
			// 	return;

			// System.out.print(" " + randomNum);
			// firstNum = randomNum;

			if (randomNum >= firstNum) {
				System.out.print(" " + randomNum);
				firstNum = randomNum;
			}
			else {
				break;
			}
        }
	}
}
