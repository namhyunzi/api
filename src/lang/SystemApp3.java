package lang;

import java.io.IOException;

public class SystemApp3 {

	public static void main(String[] args) throws IOException {
		
		/*
		 *  System 클래스의 static 변수
		 *	static final InputStream in;
		 *		 시스템의 표준 입력 스트림 객체를 참조한다.
		 *	static final PrintStream err;
		 *		시스템의 표준 에러 출력 스트릠 객체를 참조한다.
		 *	static final Print Stream out;
		 *		시스템의 표준 출력 스트림 객체를 참조한다.
		 */
		
/*		System.out.println("표준 출력");
		System.out.println("표준 출력");
		System.out.println("표준 출력");
		System.out.println("표준 출력");
		System.err.println("표준 에러 출력");
		System.err.println("표준 에러 출력");
		System.err.println("표준 에러 출력");
		System.err.println("표준 에러 출력");
*/		
		System.out.print("입력하세요:");
		int value = System.in.read();
		System.out.println("읽어온 값: " + value);
		System.out.println("읽어온 값: " + (char)value);
	}
}
