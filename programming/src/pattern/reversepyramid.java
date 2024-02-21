package pattern;

public class reversepyramid {
public static void main(String[] args) throws InterruptedException {
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n*2-1;j++) {
		if(i<=j&&i+j<=n*2) {
			System.out.print("* ");
			Thread.sleep(1000);
		} 
		else {
		System.out.print("  ");
		}
		}
	System.out.println();
}
}
}

