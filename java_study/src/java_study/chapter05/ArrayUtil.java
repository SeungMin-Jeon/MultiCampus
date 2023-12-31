package java_study.chapter05;

import java.util.Random;
import java.util.Scanner;

public class ArrayUtil {

	static void getNumbers(String inputTitle, int[] data) {
		Scanner sc = new Scanner(System.in);

		System.out.print(inputTitle);
		for (int i = 0; i < data.length; i++) {
			data[i] = sc.nextInt();
		}
	}

	static void showNumbers(int[] data) {
		for (int x : data) {
			System.out.print(x + " ");
		}
	}

	static int addAll(int[] data) {
		int sum = 0;
		for (int x : data) {
			sum = sum + x;
		}
		return sum;
	}

	static int findMaxValue(int[] data, int start, int end) {
		int max = data[start];
		int maxIx = start;
		for (int i = start; i < data.length; i++) {
			if (max < data[i]) {
				max = data[i];
				maxIx = i;
			}
		}
		return maxIx;
	}

	static int findMinValue(int[] data, int start, int end) {
		int min = data[start];
		int minIx = start;
		for (int i = start; i < end; i++) {
			if (min > data[i]) {
				min = data[i];
				minIx = i;
			}
		}
		return minIx;
	}

	static void swap(int[] data, int ix1, int ix2) {
		int temp;
		temp = data[ix1];
		data[ix1] = data[ix2];
		data[ix2] = temp;
	}

	// length 길이의 배열을 생성해서,
	// until 까지의 랜덤한 값을 채움
	// 배열을 리턴
	static int[] getRandomArray(int length, int until) {
		int[] data = new int[length];
		Random r = new Random();
		for (int i = 0; i < data.length; i++) {
			data[i] = r.nextInt(until);
		}
		return data;
//		return null;
	}
}
