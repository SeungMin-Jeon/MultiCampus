package java_study.chapter19;

import java.net.InetAddress;

public class InetAddressExample {
	public static void main(String[] args) {

		try {

			InetAddress local = InetAddress.getLocalHost();
			// getHostAddress : String 반환
			System.out.println("내 컴퓨터 IP주소: " + local.getHostAddress());

			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for (InetAddress remote : iaArr) {
				System.out.println("www.naver.com IP주소: " + remote.getHostAddress());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
