package lang;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ContactApp4 {

	public static void main(String[] args) {
		Contact c1 = new Contact();
		
		/*
		 * Object 의 getClass() 메소드 
		 *  - 생성된 객체의 설계도 정보를 반환하는 메소드다.
		 *  - 반환타입은 Class 객체다.
		 *  - Class 객체는 객체의 설계도 정보를 표현하는 객체다.
		 */
		Class<? extends Contact> clazz = c1.getClass();
		
		// Class 의 getName()의 클래스의 이름을 반환한다.
		String value = clazz.getName();
		System.out.println(value);
		
		// Class 의 getDeclaredFields()는 객체의 필드정보들을 반환한다.
		// Field 클래스는 객체의 필드정보(접근제한자, 변수타입, 변수명)를 표현한다.
		Field[] fields = clazz.getDeclaredFields();
		for(Field f : fields) {
			System.out.println(f.getType().getName() + "\t" + f.getName());
		}
		
		// Class의 getDeclaredMethods()는 객체의 메소드들을 반환한다.
		// Method 클래스는 메소드정보 (반환타입, 메소드명, 매개변수)를 표현한다.
		Method[] methods = clazz.getDeclaredMethods();
		for (Method m : methods) {
			System.out.println(m.getReturnType().getName() + "\t"
							+ m.getName());
		}
		
	}

}
