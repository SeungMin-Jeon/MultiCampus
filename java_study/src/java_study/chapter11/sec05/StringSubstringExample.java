package java_study.chapter11.sec05;

public class StringSubstringExample {

	public static void main(String[] args) {
		String ssn = "880815-1234567";

		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);

		String secondNum = ssn.substring(7);
		System.out.println(secondNum);

		String fileName = "Hello.World.mp3";
		int last = fileName.lastIndexOf(".");
		if (last != -1) {
			String ext = fileName.substring(last + 1);
			System.out.println(ext);

			String basename = fileName.substring(0, last);
			System.out.println(basename);
		}

		// 확장명을 제외한 파일명 baseName만 추출하세요

	}

}
