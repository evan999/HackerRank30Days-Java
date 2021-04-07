public class Solution {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		scanner.close();

		for (int multiple = 1; multiple <= 10; multiple++) {
			System.out.println(n + " x " + multiple + " = " + (n * multiple));
		}
	}
}