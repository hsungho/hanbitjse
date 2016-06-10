/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date : 2016. 6. 10.
 * @author : 황성호
 * @file :Kaup.java
 * @story :카우푸지수 구하는 프로그램
 * 
 */
public class Kaup {
	/**
	 * 개발자님 프로그램 제작의뢰입니다. 비만지수를 구하는 것인데요 키와 몸무게를 입력하면 당사자가 비만인지 저체중인지 알려주는 프로그램을
	 * 만들어 주세요, 돈은 입금했습니다. 잘은 모르는데 Kaup 공식을 쓰면 된다고 하네요. 공식은 나도 몰라요 알아서 하삼.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double bim = 0.0, cm = 0.0, kg = 0.0, kaup = 0.0;
		String name = "", result = "";

		System.out.println("이름을 입력하세요");
		name = scanner.next();
		System.out.println("키를 입력하세요");
		cm = scanner.nextInt();
		System.out.println("몸무게를 입력하세요");
		kg = scanner.nextInt();

		bim = kg / (cm / 100) / (cm / 100);

		if (kaup < 18.5) {
			result = "저체중";

		} else if (kaup >= 18.6 && kaup <= 22.9) {
			result = "정상체중";
		} else if (kaup >=23.0 && kaup <= 24.9) {
			result = "위험체중";
		} else if (kaup >= 25.0 && kaup <= 29.9) {
			result = "비만1단계";
		} else if (kaup >= 30 && kaup <= 39.9) {
			result = "비만2단계";
		} else if (kaup >= 40) {
			result = "비만 3단계";
		}

		System.out.println(name + "은 "+"bim수치는"+bim+"이고" +result + "입니다");

	}
}
