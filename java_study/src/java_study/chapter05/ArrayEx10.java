package java_study.chapter05;

public class ArrayEx10 {

	// �迭�� �Է��� �޾Ƽ� ����
	// �ּҰ��� ã�Ƽ�, �ε��� 0���� ���� ��ȯ

	public static void main(String[] args) {
//		int[] data = new int[5];
//
//	    ������ �Է�
//		ArrayUtil.getNumbers("���� �Է�>> ", data);

		// getRandomArray()�� �Ἥ ���� ���Թޱ�
		int[] data = ArrayUtil.getRandomArray(10, 100);

		for (int i = 0; i < data.length; i++) {
			int minIx = ArrayUtil.findMinValue(data, i, data.length);
			ArrayUtil.swap(data, i, minIx);
			ArrayUtil.showNumbers(data);
			System.out.println();
		}

		// �ε��� 0��ġ�� minIx�� ���� ��ȯ

	}

}