package day03;

import java.util.Scanner;

public class My_Quiz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num ;
		int burg = 0, fry = 0;
		while(true) {
		System.out.println("1. 햄버거 수량 입력\n2. 감자튀김 수량 입력\n3. 주문 확인");
		
		num = input.nextInt();
		switch(num) {
		case 1 : System.out.println("1. 햄버거 수량 입력");
		burg = input.nextInt();
		System.out.println(burg+"개 주문완료");
		break;
		
		case 2 : System.out.println("2. 감자튀김 수량 입력");
		fry = input.nextInt();
		System.out.println(fry+"개 주문완료");
		if (fry>=20) {
			System.out.println("감자 수급이 원활하지 않아 10개 이 주문이 불가능합니다.");
		}
		break;
		
		case 3 : System.out.println("3. 주문 확인");
			if (burg == 0) {
				System.out.println("햄버거 수량이 입력되지 않았습니다.");
			}else
				System.out.println("햄버거 "+burg+"개 주문 완료!!!");
			
			if (fry == 0) {
				System.out.println("감자튀김 수량이 입력되지 않았습니다.");
			}else
				System.out.println("감자튀김 "+fry+"개 주문 완료!!!");;
			break;
		
			}

		}
		
		}
	}

