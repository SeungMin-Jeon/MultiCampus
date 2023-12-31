package java_study.chapter11.sec01;

// VO (Value Object) 정보 오브젝트

public class Member {
	public String id;
	public int age;

	public Member(String id, int age) {
		super();
		this.id = id;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;

			if (id.equals(member.id) && age == member.age) {
				return true;
			}
		}
		return false;
	}

}
