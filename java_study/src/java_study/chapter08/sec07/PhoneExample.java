package java_study.chapter08.sec07;

public class PhoneExample {

	public static void main(String[] args) {
// 추상 클래스는 인스턴스 생성 불가능 Phone phone = new Phone(); 

		SmartPhone smartPhone = new SmartPhone("홍길동");

		smartPhone.turnOn(); // Phone의 메서드
		smartPhone.internetSearch();
		smartPhone.turnOff(); // Phone의 메서드

		Phone phone = new SmartPhone("홍길동");

		phone.turnOn();
		((SmartPhone) phone).internetSearch();
		phone.turnOff();
	}

}
