package labs1;

import java.util.Scanner;

public class Excersice5 {
	
	static int CalculateSum(int n) {
		int i,sum=0;
		for(i=1; i<=n; i++) {
			if(i%3==0 || i%5==0)
				sum=sum+i;
		}
		return sum;
	}
	
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter nth number");
	int num = sc.nextInt();
	
	System.out.println(CalculateSum(num));
	
}
}
