package java_study.chapter05;

public class LuxuryHelloJava {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			printCharacter('*', i);
		}

		for (int i = 5; i > 0; i--) {
			printCharacter('*', i);
		}
	}

	// 메서드를 이용하는 이유 : 코드 재사용 --> 코드 중복을 해결
	// 매개변수에 따라 결과에 변화를 줄 수 있음.
	static void printCharacter(char ch, int num) {
		for (int cnt = 0; cnt < num; cnt++) {
			System.out.print(ch);
		}
		System.out.println();
	}

}
