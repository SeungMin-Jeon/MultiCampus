package java_study.chapter05;

public class CallByReference {

	public static void main(String[] args) {
		int[] data = { 100, 200 };

		System.out.printf("���� �� : %d %d\n", data[0], data[1]);
		swap(data);
		System.out.printf("���� �� : %d %d\n", data[0], data[1]);

	}

	static void swap(int[] data) {
		int tmp = data[0];
		data[0] = data[1];
		data[1] = tmp;
		System.out.printf("���� �� : %d %d\n", data[0], data[1]);
	}
}