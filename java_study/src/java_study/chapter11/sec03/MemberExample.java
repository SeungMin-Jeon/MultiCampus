package java_study.chapter11.sec03;

public class MemberExample {

	public static void main(String[] args) {
		// ���� ��ü ����
		Member original = new Member("blue", "ȫ�浿", "12345", 25, true);

		// ���� ��ü�� ���� �Ŀ� �н����� ����
		Member cloned = original.getMember();
		cloned.password = "67890";

		System.out.println(original);
		System.out.println(cloned);

	}

}