package java_study.chapter11.sec06;

import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		int[] scores = { 99, 97, 98, 37, 88 };

		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("ã�� �ε���: " + index);
		System.out.println(Arrays.toString(scores));

		String[] names = { "ȫ�浿", "�ڵ���", "��μ�" };

		Arrays.sort(names);
		index = Arrays.binarySearch(names, "��μ�");
		System.out.println("ã�� �ε���: " + index);
		System.out.println(Arrays.toString(names));

		Member[] members = { new Member("ȫ�浿", 10), new Member("�ڵ���", 5), new Member("��μ�", 3) };

		Arrays.sort(members);
		index = Arrays.binarySearch(members, new Member("ȫ�浿2", 10));
		System.out.println("ã�� �ε���: " + index);
		System.out.println(Arrays.toString(members));
	}

}
