package practice._08_10_study;

public class StringEx {

	public static void main(String[] args) {
		String str = "�ȳ��ϼ��� ���õ� ���� �Ϸ� �Ǽ��� !!";

		System.out.println(str.charAt(0));

		System.out.println(str.indexOf("�Ϸ�"));

		System.out.println(str.replace('��', '��'));

		System.out.println(str.substring(10));

		System.out.println(str.startsWith("�ȳ��ϼ���"));

		System.out.println(str.endsWith("�Ǽ���"));

	}

}