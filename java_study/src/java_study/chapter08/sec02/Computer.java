package java_study.chapter08.sec02;

public class Computer extends Calculator {

	@Override
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle() ����");
		return Math.PI * r * r;
	}

	@Override
	public String toString() {
		return "Computer ...." + super.toString();
	}

}
