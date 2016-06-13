/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date : 2016. 6. 10.
 * @author : 황성호
 * @file :Kaup2.java
 * @story :카우푸 지수 구하는 프로그램
 * 
 */
public class Kaup2 {
	/**
	 * 개발자님 bmi지수가 너무 길어요.
	 * 소수점 이하 2자리에서 끊어주세요.
	 * */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = "", result = "";
		double bmi = 0.0, kg = 0.0, cm = 0.0, kaup = 0.0;
		// ---op-----
		System.out.println("이름?");
		name = scanner.next();
		System.out.println("키");
		cm = scanner.nextDouble();
		System.out.println("몸무게");
		kg = scanner.nextDouble();
		kaup = kg / (cm / 100) / (cm / 100);

		if (kaup < 18.5) {
			result = "저체중";
		} else if (kaup >= 18.6 && kaup <= 22.9) {
			result = "정상체중";
		} else if (kaup >= 23.0 && kaup <= 24.9) {
			result = "위험체중";
		} else if (kaup >= 25.0 && kaup <= 29.9) {
			result = "비만1단계";
		} else if (kaup >= 30 && kaup <= 39.9) {
			result = "비만2단계";
		} else if (kaup >= 40) {
			result = "비만 3단계";
		}
		
		//double d =Double.parseDouble(String.format("%.2f",kaup));
		//System.out.println(name + "은 BMI지수는 " +d + "이고, " + result + "이다");

		// 위 문장을 printf로 변경하시오
		
		//System.out.printf("%s은 bmi지수는 %.2f이고 %s이다"name,kaup,result);
	}

}
