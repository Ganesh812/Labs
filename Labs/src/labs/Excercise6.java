package labs;

import java.util.Scanner;

public class Excercise6 {
	
	static int CalculateDiff(int n) {
		int sum1 = 0, sum2 = 0,c;
		for(int i = 1; i<=n; i++) {
			sum1 = sum1 +(i*i);
		}
		for(int j=1; j<=n; j++) {
			sum2 = sum2 + j;
	}
	
	c =sum1- sum2;
	return c;
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter n");
	int n = sc.nextInt();
	
	System.out.println(CalculateDiff(n));
	
	sc.close();
}
}