package day03;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
	
	int i = 0;
	while(true) {
		System.out.println("날짜 입력");
		i++;
		
	
	int date = input.nextInt();
	
	switch (date % 7) {
	case 1 : System.out.println("월요일"); break;
	case 2 : System.out.println("화요일"); break;
	case 3 : System.out.println("수요일"); break;
	case 4 : System.out.println("목요"); break;
	case 5 : System.out.println("금요"); break;
	case 6 : System.out.println("토요"); break;
	case 7 : System.out.println("일요");
	
	
	}
	}

}
}
