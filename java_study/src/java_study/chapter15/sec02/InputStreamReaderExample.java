package java_study.chapter15.sec02;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {
	public static void main(String[] args) {
		InputStream is = System.in;

		try (Reader reader = new InputStreamReader(is)) {
			int readCharNo;
			char[] cbuf = new char[100];
			while ((readCharNo = reader.read(cbuf)) != -1) {
				String data = new String(cbuf, 0, readCharNo);
				System.out.println(data);
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
