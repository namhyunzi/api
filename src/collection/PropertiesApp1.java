package collection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp1 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		/*
		 * Properties
		 *  - Map 인터페이스의 구현 클래스다.
		 *  - key 와 value 의 타입이 String 이다.
		 *  - Properties 파일을 읽어서 설정정보를 key, value 의 형태로 저장한다.
		 *  
		 *  - 주요 메소드
		 *      void load(InputStream in), void load(Reader, reader)
		 *  		 + 지정된 스트림으로 .properties 파일을 읽어서 key, value 쌍으로 분석한다.
		 *  	String getProperty(String key)
		 *  		 + 지정된 key 에 해당하는 value 를 반환한다.
		 *  	String getPropety(String key, String defaultValue)
		 *  		 + 지정된 key 에 해당하는 value 를 반환한다.
		 *  		 + 지정된 key 에 해당하는 value 가 존재하지 않으면 지정된 defaultValue를 반환한다.
		 *  	void setProperty(String key, String value)
		 *  		 + 지정된 key, value 쌍의 값을 저장한다.
		 *  	void store(OutputStream out, String comment)
		 *  	void store(Writer writer, String comment)
		 *  		 + 지정된 stream 을 이용해서 Properties 객체의 key, value 쌍의 값을 저장한다.
		 *  
		 */
		Properties prop = new Properties();
		prop.load(new FileReader("src/collection/config.properties"));
		
		// 설정정보 조회하기
		String ip = prop.getProperty("email.server.ip");
		String port = prop.getProperty("email.server.port");
		String user = prop.getProperty("email.server.user");
		String password = prop.getProperty("email.server.password");
		
		System.out.println("ip주소: " + ip);
		System.out.println("포트번호: " + port); 
		System.out.println("접속아이디: " + user);
		System.out.println("접속비밀번호: " + password);
	}

}
