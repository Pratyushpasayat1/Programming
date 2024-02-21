package firstpart;

import java.util.Scanner;

public class prime {
public static void main(String[] args) {
	/*Scanner sc=new Scanner(System.in);
	System.out.println("enter the num");
	int num=sc.nextInt();                     //
	int count=0;
	for(int i=1;i<=num;i++) {
		if(num%i==0) {
			count++;
		} 
	}
	if(count==2) {
		System.out.println("the number is prime.");
	}*/
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first num");
	int a=sc.nextInt();
	System.out.println("Enter the secound num");
	int b=sc.nextInt();
	System.out.println("The prime numbers in bettwen "+a+" and " + b + " are" );
	for(int i=a;i<=b;i++) {
		int n=i;
		int count=0;
		
		for(int j=1;j<=n;j++) {
			if(n%j==0) {
				count++;
				
			}
		}
			if(count==2) {
				
				System.out.println(n);
			}
		}
	}
}

