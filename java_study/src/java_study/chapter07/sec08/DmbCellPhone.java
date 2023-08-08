package java_study.chapter07.sec08;

public class DmbCellPhone extends CellPhone {

	int channel;

//	public DmbCellPhone(String model, String color, int channel) {
//		super(model, color);
//		this.channel = channel;
//	}
	public DmbCellPhone(String model, String color, int channel) {
		super(model, color);
		this.channel = channel;
	}

	void turnOnDmb() {
		System.out.println("ä�� " + channel + "�� DMB ��� ������ �����մϴ�.");
	}

	void changeChannelDmb(int channel) {
		System.out.println("ä�� " + channel + "������ �ٲߴϴ�.");
	}

	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}

}