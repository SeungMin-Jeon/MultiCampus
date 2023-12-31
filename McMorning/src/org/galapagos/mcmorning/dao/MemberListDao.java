package org.galapagos.mcmorning.dao;

import java.util.ArrayList;
import java.util.List;

import org.galapagos.mcmorning.util.Serializer;
import org.galapagos.mcmorning.vo.Member;

import lombok.Getter;

//Member에 대한 CRUD
public class MemberListDao implements MemberDao {
	static final String FILE_PATH = "c:/temp/member_list.dat";

	@Getter
	private List<Member> memberList;

	public MemberListDao() {
		memberList = new ArrayList<Member>();
//		memberList.add(new Member("id1", "7345", "김개똥", "구글"));
//		memberList.add(new Member("id2", "8345", "나개똥", "네이버"));
//		memberList.add(new Member("id3", "9345", "박개똥", "다음"));
//		memberList.add(new Member("id4", "2345", "이개똥", "파란"));
	}

	@Override
	public void add(Member m) {
		memberList.add(m);
	}

	// userid로 찾기
	@Override
	public Member findByUserid(String userid) {
//		for (Member m : memberList) {
//			if (userid.equals(m.getUserid())) {
//				return m;
//			}
//		}

		int idx = indexOf(userid);

		return idx != -1 ? memberList.get(idx) : null;

	}

	@Override
	public Member update(Member m) {

//		for (int i = 0; i < memberList.size(); i++) {
//			if (m.getUserid().equals(memberList.get(i).getUserid())) {
//				memberList.set(i, m);
//				return m;
//			}
//		}
		int idx = indexOf(m.getUserid());

		if (idx != -1) {
			memberList.set(idx, m);
			return m;
		}

		return null;

	}

	private int indexOf(String userId) {
		for (int i = 0; i < memberList.size(); i++) {
			if (userId.equals(memberList.get(i).getUserid())) {
				return i;
			}
		}
		return -1;
	}

	// 삭제
	@Override
	public Member delete(String userid) {
		int idx = indexOf(userid);

//		if (idx != -1) {
//			return memberList.remove(idx);
//		}
//		return null;
//	

		return idx != -1 ? memberList.remove(idx) : null;
	}

	@Override
	public List<Member> searchByName(String name) {
		List<Member> list = new ArrayList<>();

		for (Member m : memberList) {
			if (m.getName().contains(name)) { // contains 또는 substring으로 검사를 한다.
				list.add(m);
			}
		}

		return list;

	}

	@Override
	public void save() throws Exception {
		// memberList 직렬화 하면되고,
		Serializer.save(FILE_PATH, memberList);

	}

	@Override
	public void load() throws Exception {
		// memberList 역직렬화 한다.
		memberList = (List<Member>) Serializer.load(FILE_PATH);
		System.out.println(memberList);
	}
}