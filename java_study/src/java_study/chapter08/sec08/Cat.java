package java_study.chapter08.sec08;

public class Cat extends Animal {

	public Cat() {
		this.kind = "������";
	}

	@Override
	public void sound() {
		System.out.println("������");
	}

}
