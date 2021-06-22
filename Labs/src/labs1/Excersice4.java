package labs1;

import java.util.Scanner;

public class Excersice4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Integer");
		int num = sc.nextInt();

		for (int i = 2; i < num; i++) {
			int flag = 1;

			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					flag = 0;
			}
			if (flag == 1)
				System.out.println(i);
		}

	}
}
