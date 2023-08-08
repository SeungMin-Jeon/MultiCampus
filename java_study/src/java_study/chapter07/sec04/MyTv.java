package java_study.chapter07.sec04;

public class MyTv {

	public static void main(String[] args) {
		System.out.println(Tv.count);

		Tv tv1 = new Tv(7, 9, true);
		Tv tv2 = new Tv(9, 12, true);
		System.out.println(tv1);
		System.out.println(tv2);

		Tv[] tvArr = new Tv[100];
		for (int i = 0; i < 100; i++) {
			Tv tv = new Tv(1, 1, true);
			tvArr[i] = tv;
		}

		System.out.println(Tv.count);
		System.out.println(tv1.getChanner());
		System.out.println(tv2.getChanner());
		System.out.println("tv1�� serial number : " + tv1.getSerial());
	}

}
