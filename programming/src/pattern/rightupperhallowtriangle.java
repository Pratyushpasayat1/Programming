package pattern;

public class rightupperhallowtriangle {
public static void main(String[] args) {
	int n=5;

	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if (i==5||j==5||i+j==n+1) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
}
		System.out.println();
}
}
}