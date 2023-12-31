package java_study.chapter09.sec01;

public interface RemoteControl {
	int MAX_VALUE = 10;
	int MIN_VALUE = 0;

	void tunrOn();

	void turnOff();

	void setVolume(int volume);

	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}

	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}

}
