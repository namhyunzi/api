package lang;

public class Student implements Comparable<Student>{
	
	int no;
	String name;
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	public String toString() {
		return "{no:"+no+", name:"+name+"}";
	}
	
	@Override
	public int compareTo(Student other) {
		
		return this.name.compareTo(other.name);
	}

}

/*
 * this ==>  no = 10, name = "홍길동"
 * other ==> no = 3, name = "강감찬"
 * 
 * 양의정수 - this 의 순위가 뒤다.
 * 음의정수 - this 의 순위가 앞이다.
 * 0      - this 와 other 의 순위가 같다.
 */
