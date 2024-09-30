package day03;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int money = 0;
		System.out.println("커피의 개수를 입력세요");
		int coffee = input.nextInt();
		
		if (coffee >10) {
			money = 20000 + (coffee-10)*1500;
		}else 
			money = coffee*2000;
	
		System.out.println(coffee +" : "+ money);
		
	}

}
