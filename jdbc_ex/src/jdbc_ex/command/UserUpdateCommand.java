package jdbc_ex.command;

import org.galapagos.common.cli.Input;
import org.galapagos.common.command.Command;

import jdbc_ex.dao.UserDAO;
import jdbc_ex.dao.UserDAOImp1;
import jdbc_ex.domain.UserVO;

public class UserUpdateCommand implements Command {
	UserDAO dao = UserDAOImp1.getInstance();

	@Override
	public void execute() {
		System.out.println("[사용자 정보 수정]");

		// 1. 수정할 userid 입력
		// 2. 기존 데이터 얻기
		// 3. 기존 데이터 보여주고 업데이트 진행
		// 4. 업데이트

		String userid = Input.read("사용자 ID: ");
		UserVO user = dao.getUser(userid);
		if (user == null) {
			System.out.println("존재하지 않는 ID입니다.");
			return;
		}

		// 이름 파트
		// 이름 (김길동):
		String name = Input.read("이름", user.getName());
		String role = Input.read("역할", user.getRole());

		user.setName(name);
		user.setRole(role);

		dao.updateUser(user);

	}

}
