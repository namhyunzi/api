package time;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class App3 {

	public static void main(String[] args) {
		
		// 두 날짜 사이의 기간을 조회하기
		LocalDate today = LocalDate.now();
		LocalDate birthDay = LocalDate.of(1998, 3, 20);
		
		Period period = Period.between(birthDay, today);
		
		long years = ChronoUnit.YEARS.between(birthDay, today);
		long months = ChronoUnit.MONTHS.between(birthDay, today);
		long days = ChronoUnit.DAYS.between(birthDay, today);
		
		System.out.println("년수: " + years);
		System.out.println("년수: " + months);
		System.out.println("년수: " + days);
		
		

	}

}
