package pattern;

public class leftpyramid {
public static void main(String[] args) throws InterruptedException {
	int n=5;
	for(int i=1;i<=n*2-1;i++) {
		for(int j=1;j<=n;j++) {
		if(i+j>=n+1&&i-j<=n-1) {
			System.out.print("* ");
			Thread.sleep(300);
		} 
		else {
		System.out.print("  ");
		}
		}
	System.out.println();
}

}
}

