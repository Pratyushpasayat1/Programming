package numberpattern;

public class hallopyramid {
	public static void main(String[] args) throws InterruptedException {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			int sum = n + 1;
			for (int j = 1; j <= n * 2 - 1; j++) {
				if (i + j >= n + 1 && j - i <= n - 1 && i + j == sum) {
					System.out.print("* ");
					sum = sum + 2;
					Thread.sleep(1000);
				} else {
					System.out.print("  ");

				}
			}
			System.out.println();

		}
	}
}
