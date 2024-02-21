package firstpart;

import java.util.Scanner;

public class mtablerange {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the stsrting number=");
	int a=sc.nextInt();
	System.out.println("Enter the ending number= ");
	int b=sc.nextInt();
	int mal=1;
	for(int i=a;i<=b;i++) {
		for(int j=1;j<=10;j++) {
			mal=i*j;
		
		System.out.println(i+"*"+j+"="+mal);
	}
}
}
}