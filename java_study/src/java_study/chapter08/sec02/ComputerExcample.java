package java_study.chapter08.sec02;

public class ComputerExcample {

	public static void main(String[] args) {
		int r = 10;

		Calculator calculator = new Calculator();

		System.out.println("원면적 : " + calculator.areaCircle(r));
		System.out.println();

		Computer computer = new Computer();

		System.out.println("원면적 : " + computer.areaCircle(r));

		System.out.println(calculator);
		System.out.println(computer);
	}

}
