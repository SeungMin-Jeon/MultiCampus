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

	// �޼��带 �̿��ϴ� ���� : �ڵ� ���� --> �ڵ� �ߺ��� �ذ�
	// �Ű������� ���� ����� ��ȭ�� �� �� ����.
	static void printCharacter(char ch, int num) {
		for (int cnt = 0; cnt < num; cnt++) {
			System.out.print(ch);
		}
		System.out.println();
	}

}