package java_study.chapter04;

public class SwitchEx {

	public static void main(String[] args) {
		String name = "�ڹ�";

		// ctrl + shift + f : �鿩���� ����
		switch (name) {
		case "�ڹ�":
			System.out.println("1103ȣ�� ������.");
			break;
		case "���̽�":
			System.out.println("1104ȣ�� ������.");
			break;
		case "������":
			System.out.println("1102ȣ�� ������.");
			break;
		default:
			System.out.println("ī���Ϳ� ���� �����ϼ���.");
			break;

		}
	}

}