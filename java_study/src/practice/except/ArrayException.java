package practice.except;

public class ArrayException {

	public static void main(String[] args) {

		int[] arr = new int[2];

		try {
			arr[2] = 10;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ������ ������ϴ�.");
		} finally {
			System.out.println("�迭 ũ�� Ȯ�� �� ���� ������ �ּ���");
		}
	}

}