package java_study.chapter09.sec01;

public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;

	@Override
	public void tunrOn() {
		System.out.println("TV를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VALUE) {
			this.volume = RemoteControl.MAX_VALUE;
		} else if (volume < RemoteControl.MIN_VALUE) {
			this.volume = RemoteControl.MIN_VALUE;
		} else {
			this.volume = volume;
		}

	}

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

}
