package java_study.chapter06.sec4;

public class Block {
	int x = 0;
	int y = 0;
	String color = null;

	public void stack() {
		int move = 50;
		System.out.println(move + "만큼 벽돌을 쌓다.");
	}

	@Override
	public String toString() {
		return "Block [x=" + x + ", y=" + y + ", color=" + color + "]";
	}

//	public String toString() {
//		return "Block [x = " + x + ", y = " + y + ", color = " + color + "]";
//	}
}
