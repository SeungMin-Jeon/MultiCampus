package java_study.chapter08.sec07;

public class PhoneExample {

	public static void main(String[] args) {
// �߻� Ŭ������ �ν��Ͻ� ���� �Ұ��� Phone phone = new Phone(); 

		SmartPhone smartPhone = new SmartPhone("ȫ�浿");

		smartPhone.turnOn(); // Phone�� �޼���
		smartPhone.internetSearch();
		smartPhone.turnOff(); // Phone�� �޼���

		Phone phone = new SmartPhone("ȫ�浿");

		phone.turnOn();
		((SmartPhone) phone).internetSearch();
		phone.turnOff();
	}

}