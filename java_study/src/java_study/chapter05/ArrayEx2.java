package java_study.chapter05;

public class ArrayEx2 {

	public static void main(String[] args) {
		int[] jumsu = new int[1000];
		System.out.println(jumsu);

		jumsu[0] = 100;
		jumsu[10] = 200;
		jumsu[999] = 1000;
		jumsu[1000] = 2;

		System.out.println("ù��° ��: " + jumsu[0]);
		System.out.println("���ѹ�° ��: " + jumsu[10]);
		System.out.println("������ ��: " + jumsu[999]);
		System.out.println("500��° ��: " + jumsu[499]);

		for (int i = 0; i < jumsu.length; i++) { // �ε��� ���
			System.out.println(i + " : " + jumsu[i]);
		}

		int sum = 0;
		for (int value : jumsu) { // ���� ���
			System.out.println(value);
			sum += value;
		}
		System.out.println(sum);
	}

}