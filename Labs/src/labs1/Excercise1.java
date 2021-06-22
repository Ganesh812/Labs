package labs1;

import java.util.Scanner;

import java.util.Scanner;

public class Excercise1 {
	static int SumCubes(int num) {
		int sum = 0 ;
		int rem;
		while (num>0) {
		rem = num % 10;
		sum = sum+(rem*rem*rem);
		num = num/10;
		}
		return sum;
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter an interger - ");
		int n1 = sc.nextInt();
		System.out.println(SumCubes(n1));
		
	}
}
