package firstpart;

import java.util.Scanner;

public class sqareroot {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	boolean a=false;
	for(int i=1;i<=n;i++) {
		if(i*i==n) {
			a=true;
			System.out.println(i+"  is a perfect sqare root of "+n);
			break;
		}
		}
		if (a==false) {
			System.out.println(n+" is not a perfect sqareroot.");
		}
		sc.close();
	}
	}

	



