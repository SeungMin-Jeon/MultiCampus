package java_study.chapter04;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString;

		do {
			System.out.print(">");
			inputString = sc.nextLine();
			System.out.println(inputString);
		} while (!inputString.equalsIgnoreCase("q"));

		System.out.println();
		System.out.println("프로그램 종료");
	}

}
