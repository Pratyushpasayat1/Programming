package firstpart;

import java.util.Scanner;

public class happyno {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number.");
	int num=sc.nextInt();
	int copy=num;
	while(true) {
		int sum=0;
		while(num>0) {
		  int d=num%10;
		  sum=sum+(d*d);
		  num=num/10;
		}
		if( sum==1) {
			System.out.println(copy+" Is a happy number.");
			break;
		}
			else if(sum==4) {
				System.out.println("Unhappy number");
				break;
		}
		num=sum;
	}
}
}
