package java_study.chapter05;

import java.util.Scanner;

public class ArrayEx7_2 {

	static void getNumbers(int[] data) {

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] jumsu = new int[5];

		System.out.println("����(�������� ���� ���� �� �������� ����) >> ");
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = sc.nextInt(); // ���۸� --> ���� �տ� �����͸� ������ �� �� ����.
		}

		for (int x : jumsu) {
			System.out.println(x + " ");
		}

		System.out.println();

		int sum = 0;
		for (int x : jumsu) {
			sum = sum + x;
		}

		System.out.println("��ü �հ� : " + sum);
		double avg = (double) sum / jumsu.length;
		System.out.println("��ü ���: " + avg);

		int sum2 = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				sum2 = sum2 + jumsu[i];
			}
		}
		System.out.println("300�̻� �Ǵ� �հ�: " + sum2);

		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				System.out.println("300�� ���� ����� �ε��� : " + i);
			}
		}
	}

}