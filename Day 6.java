import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */

		Scanner scanner = new Scanner(System.in);
		Integer testCases = Integer.parseInt(scanner.next());

		for (int test = 0; test < testCases; test++) {
			String input = scanner.next();
			for (int index = 0; index < input.length(); index += 2) {
				System.out.print(input.charAt(index));
			}

			System.out.print(" ");

			for (int index = 1; index < input.length(); index += 2) {
				System.out.print(input.charAt(index));
			}

			System.out.println();
		}
	}
}