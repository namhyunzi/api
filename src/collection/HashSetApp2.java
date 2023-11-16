package collection;

import java.util.HashSet;
import java.util.Objects;

public class HashSetApp2 {

	public static void main(String[] args) {

		HashSet<User> set = new HashSet<>();
		
		set.add(new User("Kim", "김유신"));
		set.add(new User("Kang", "강감찬"));
		set.add(new User("lee", "이순신"));
		set.add(new User("ryu", "류관순"));
		set.add(new User("ahn", "안중근"));
		set.add(new User("hong", "홍길동"));
		set.add(new User("hong", "홍길동"));
		set.add(new User("hong", "홍길동"));
		
		for(User user : set) {
			System.out.println(user.id + ", " + user.name);
		}
	}
	
	static class User {
		String id;
		String name;
		
		public User(String id, String name) {
			this.id = id;
			this.name = name;
		}
		/*
		 * hashCode()의 equals 메소드를 재정의해서
		 * id 값이 같은 User 객체는 같은 객체로 판단하도록 하였음
		 */
		@Override
		public int hashCode() {
			return Objects.hash(id);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			User other = (User) obj;
			return Objects.equals(id, other.id);
		}
		
		
	}

}
