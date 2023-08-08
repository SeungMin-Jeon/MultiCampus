package java_study.chapter06.sec5;

public class Account {

	String name;
	String accountName;
	private int balance;

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