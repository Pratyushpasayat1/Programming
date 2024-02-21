package firstpart;

import java.util.Scanner;

public class xylemno {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	int is=0;
	int l=n%10;
	int copy=n;
	n=n/10;
	while(n>=10) {
		int d=n%10;
		is=is+d;
		n=n/10;
	}
	int os=l+n;
	if (is==os) {
		System.out.println(copy+" is a xylemnumber.");
	}
	else {
		System.out.println(copy+" is a phloem number.");
	}
}
}
