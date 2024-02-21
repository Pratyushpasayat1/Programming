package firstpart;

import java.util.Scanner;

public class sunnynjum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int a1=a+1;
		boolean b=false;
		for(int i=1;i<=a1;i++) {
			if (i*i==a1) {
			System.out.println(" it is a sunny number.");
			break;
			}
		}
		if (b==true) {
			System.out.println( " Not a a sunny number.");
		}
	}
}
