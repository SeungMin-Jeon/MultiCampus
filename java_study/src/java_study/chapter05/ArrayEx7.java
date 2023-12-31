package java_study.chapter05;

public class ArrayEx7 {

	public static void main(String[] args) {
		int[] jumsu = new int[5];
		ArrayUtil.getNumbers("점수 >> ", jumsu); // call by reference
		ArrayUtil.showNumbers(jumsu);

		int sum = ArrayUtil.addAll(jumsu);

		System.out.println();

		System.out.println("전체 합계 : " + sum);
		double avg = (double) sum / jumsu.length;
		System.out.println("전체 평균: " + avg);

		int sum2 = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				sum2 = sum2 + jumsu[i];
			}
		}
		System.out.println("300이상 되는 합계: " + sum2);

		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				System.out.println("300인 값이 저장된 인덱스 : " + i);
			}
		}
	}

}
