package java_study.chapter06.sec02;

public class MyRoom {

	public static void main(String[] args) {
		TV myTv = new TV();
		myTv.brand = "LG";
		myTv.price = 1000000;
		myTv.size = 60;
		myTv.store = "�Ƹ���";

		System.out.printf("TV�� ���� : �귣��� %s ������ %d�� ũ��� %d��ġ ����ó�� %s�̴�.\n", myTv.brand, myTv.price, myTv.size,
				myTv.store);
		myTv.turnOn();
		myTv.changeChannel();
		myTv.turnOff();
	}

}