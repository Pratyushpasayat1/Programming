package pattern;

import java.util.Scanner;

public class leftdowntriangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i+j<=n+1) {
					System.out.print("* ");
					
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e)
						{
							e.printStackTrace();
						}
						
				
				}
				else {
				System.out.print("  ");
				
				}
			}

		System.out.println();
	}
}
}
