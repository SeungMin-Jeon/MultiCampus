package practice.except;

public class ArrayException {

	public static void main(String[] args) {

		int[] arr = new int[2];

		try {
			arr[2] = 10;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위를 벗어났습니다.");
		} finally {
			System.out.println("배열 크기 확인 후 값을 대입해 주세요");
		}
	}

}
