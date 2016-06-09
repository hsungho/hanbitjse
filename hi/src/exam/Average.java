/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 8.
 * @author : 황성호
 * @file   :Average.java
 * @story  :
 
 */
public class Average {
   /**
    * 클라이언트에서 프로그램 개발 요청이왔습니다.
    * 이름과 국,영,수 세과목점수를 입력받아서
    * [홍길동 : 총점 ***점, 평균***점]
    * 을 출력하는 프로그램을 만들어 주세요.
    * 단) 평균은 소수점이하는 절삭합니다
    */
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		int kor=0,eng=0,meth=0,avg=0,total=0;
		
		System.out.println("이름을 입력하세요");
		name = scanner.next();
		System.out.println("국어 점수를입력하세요");
		kor = scanner.nextInt();
		System.out.println("영어 점수를입력하세요");
		eng = scanner.nextInt();
		System.out.println("수학 점수를입력하세요");
		meth = scanner.nextInt();
		total = kor + eng + meth;
		avg = total / 3;
		System.out.println("["+name+" : 총점 "+total+"점, 평균"+avg+"점]");
		
	}
}
