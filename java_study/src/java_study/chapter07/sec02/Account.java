package java_study.chapter07.sec02;

public class Account {
	private String name;
	private String ssn;
	private int money;

//	public Account(String name, String ssn, int money) {
//		this.name = name;
//		this.ssn = ssn;
//		this.money = money;
//	}
	public Account(String name, String ssn, int money) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.money = money;
	}

	public Account(String name, String ssn) {
		super();
		this.name = name;
		this.ssn = ssn;
	}

	public int getMoney() { // getter
		return money;
	}

	public void setMoney(int money) { // setter
		this.money = money;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", ssn=" + ssn + ", money=" + money + "]";
	}

}
