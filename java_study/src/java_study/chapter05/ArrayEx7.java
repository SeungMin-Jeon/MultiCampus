package java_study.chapter05;

public class ArrayEx7 {

	public static void main(String[] args) {
		int[] jumsu = new int[5];
		ArrayUtil.getNumbers("���� >> ", jumsu); // call by reference
		ArrayUtil.showNumbers(jumsu);

		int sum = ArrayUtil.addAll(jumsu);

		System.out.println();

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