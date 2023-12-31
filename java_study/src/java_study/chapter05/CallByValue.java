package java_study.chapter05;

public class CallByValue {

	public static void main(String[] args) {
		int x = 100;
		int y = 200;

		System.out.printf("스왑 전 x: %d, y: %d\n", x, y);
		swap(x, y);
		System.out.printf("스왑 후 x: %d, y: %d\n", x, y);
	}

	static void swap(int x, int y) {
		int tmp = x;
		x = y;
		y = tmp;
		System.out.printf("스왑 중 x: %d, y: %d\n", x, y);
	}

}
