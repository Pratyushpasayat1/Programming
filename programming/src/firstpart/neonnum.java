package firstpart;

import java.util.Scanner;

public class neonnum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int a=sc.nextInt();
	int sum=0;
	int sq=a*a;
	while(sq>0) {
		int d=sq%10;
		sum=sum+d;
		sq=sq/10;
		if(sum==a) {
			System.out.println("The number is neon number");
		}
		else {
			System.out.println("The number is not a neon number");
		}
	}
}
}
