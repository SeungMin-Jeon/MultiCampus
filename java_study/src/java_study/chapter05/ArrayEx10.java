package java_study.chapter05;

public class ArrayEx10 {

	// 배열의 입력을 받아서 구성
	// 최소값을 찾아서, 인덱스 0번과 값을 교환

	public static void main(String[] args) {
//		int[] data = new int[5];
//
//	    데이터 입력
//		ArrayUtil.getNumbers("숫자 입력>> ", data);

		// getRandomArray()를 써서 값을 대입받기
		int[] data = ArrayUtil.getRandomArray(10, 100);

		for (int i = 0; i < data.length; i++) {
			int minIx = ArrayUtil.findMinValue(data, i, data.length);
			ArrayUtil.swap(data, i, minIx);
			ArrayUtil.showNumbers(data);
			System.out.println();
		}

		// 인덱스 0위치와 minIx의 값을 교환

	}

}
