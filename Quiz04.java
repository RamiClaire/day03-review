package day03;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String home = null, office = null;
		int num;
		while (true) {
		System.out.println("1. 우리집 등록 \n2. 회사 등록\n3. 등록보기");
		
		num = input.nextInt();
		switch (num) {
		case 1 : System.out.println("우리집 목적지 입력: ");
		home = input.next();	
		System.out.println("등록 성공");
		break;
		
		case 2 : System.out.println("회사 목적지 입력: ");
		office = input.next();
		System.out.println("등록 성");
		break;
		
		case 3 : System.out.println("우리집 : "+home+"회사 : "+office);
			if(home == null) {
				System.out.println("집주소가 입력되지 않았습니다!!!");
			}else {
				System.out.println("집주소 : "+home);
			}if(office == null) {
				System.out.println("회사주소가 입력되지 않았습니다!!!");
			}else
				System.out.println("회사주소 : "+office);
			}
			break;
		}
		
	}

}
