package pattern;

import java.util.Scanner;

public class hollowbutterfly {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter The Number");
			int n=sc.nextInt();
			
			for(int i=1;i<=(n*2)-1;i++) {
				for(int j=1;j<=(n*2)-1;j++) {
					if(j==1||i==j||j==n*2-1||i+j==n*2) {
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
			sc.close();
		}
	}


