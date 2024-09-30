package day03;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		
		int num = input.nextInt();
		
		if (num % 3 ==0 && num% 4 == 0) {
			System.out.println("3의배수이면서, 4의배수에도 해당합니");
		}else if (num % 3 == 0) {
			System.out.println("3의배수에만 해당합니다");
		}else if (num % 4 == 0) {
			System.out.println("4의 배수에만 해당합니다");
		}else if (num %3 != 0 && num %4 !=0) {
			System.out.println("3의 배수도, 4의 배수도 해당안됩니다");
		}else
			System.out.println("0은 잘못 입력했습니");
			
		}
	}

