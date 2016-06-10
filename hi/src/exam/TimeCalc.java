/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 10.
 * @author : 황성호
 * @file   :TimeCalc.java
 * @story  :초를 가지고 시간 분 초로 환산하기
 
 */
public class TimeCalc {
	/**
	 * 개발자님...
	 * 타이머로 작업시간을 기록하고 있는데요
	 * 결과가 50000초로 나오네요.
	 * 그런데 이게 감이 잘안와서요..
	 * 시간,분,초로 나누어서 보게 해주세요.
	 * 예를들면 50000초가 입력되면
	 * 25시간 32분 15초 이렇게 보이게 해주세요
	 * */
	 public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int hou=0,min=0,sec=0;
		
		System.out.println("초를입력하세요");
		sec = scanner.nextInt();
		hou = sec / 3600;
        min = sec % 3600 / 60;
        sec = sec % 3600 % 60;
		
		
		
		
		System.out.println(hou+"시간" +min+"분" +sec+"초");
	}
}
