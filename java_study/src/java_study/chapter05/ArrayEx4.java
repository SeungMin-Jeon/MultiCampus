package java_study.chapter05;

public class ArrayEx4 {

	public static void main(String[] args) {
		String[] names = { "ȫ�浿", "��浿", "�ڱ浿", "�۱浿", "���浿" };
		int[] ages = { 50, 40, 30, 20, 10 };
		int[] shoes = { 134, 235, 245, 255, 300 };
		char[] gender = { '��', '��', '��', '��', '��' };

		System.out.println(" �̸� ���� ��ũ�� ���� ");
		System.out.println("----------------------------");

		for (int i = 0; i < gender.length; i++) {
			System.out.printf("%d %s %d %d %c\n", i + 1, names[i], ages[i], shoes[i], gender[i]);
		}

	}
}