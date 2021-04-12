import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String baseNumber = Integer.toBinaryString(n);
		int consecutiveOnes = 0;
		int maxConsecutive = 0;

		for (int i = 0; i < baseNumber.length(); i++) {

			if (baseNumber.charAt(i) == '1') {
				consecutiveOnes++;
			} else {

				if (consecutiveOnes > maxConsecutive) {
					maxConsecutive = consecutiveOnes;
				}
				consecutiveOnes = 0;
			}

			if (consecutiveOnes > maxConsecutive) {
				maxConsecutive = consecutiveOnes;
			}
		}

		System.out.println(maxConsecutive);

		scanner.close();
	}
}