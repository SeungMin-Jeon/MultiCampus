package java_study.chapter06.sec01;

public class MyRoom {

	public static void main(String[] args) {

		Phone p1 = new Phone();
		p1.internet();
		p1.color = "����";
		p1.shape = "����";

		Phone p2 = new Phone();
		p2.talkBykakao();
		p2.color = "����";
		p2.shape = "�׸�";

		System.out.println(p2.color);
		System.out.println(p2.shape);

	}

}