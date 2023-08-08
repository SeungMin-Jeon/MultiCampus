package java_study.chapter07.sec01;

public class Account {

	private String name;
	private String accountName;
	private int balance;

	public Account() {

	}

	public Account(String n, String an, int b) {
		this.name = n;
		this.accountName = an;
		this.balance = b;
	}

	public void deposit(int amount) { // amount : �Աݾ�
		balance += amount;
		System.out.printf("%s �� %d���� �Ա��ϴ�. \n", name, amount);
	}

	public void withdraw(int amount) {
		if (balance < amount) {
			System.out.println("�ܾ��� �����մϴ�");
		} else {
			balance -= amount;
			System.out.printf("%s�� ������ݿ��� %d���� ����ϴ�. \n", name, amount);
		}
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", accountName=" + accountName + ", balance=" + balance + "]";
	}

}