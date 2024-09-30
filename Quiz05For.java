package day03;

import java.util.Scanner;

public class Quiz05For {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("수 입력 : ");
		int num = input.nextInt();
		
		for(int i=1; i<=num; i++)
		System.out.println(i+". hello");
	}

}
