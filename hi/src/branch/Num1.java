/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 9.
 * @author : 황성호
 * @file   :Num1.java
 * @story  :
 
 */
public class Num1 {
  /**
   * 저희 반은 학생수가 3명입니다.
   * 학생의 평균점수는 0~100점 사이입니다.
   * 3명의 평균 점수를 입력하면
   * 1등 홍길동
   * 2등 김유신
   * 3등 김구
   * 이렇게 나오도록 해주세요.
   * 단, 학생이름은 스캐너로 입력받습니다.
   * 홍길동  
   * 94
   * 김유신
   * 50
   * 김구
   * 68
   * =================
   * 1등 김구 96점
   * 2등 김유신 78점
   * 3등 홍길동 49점
   * =================
   * */
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 String name1="",name2="",name3="";
	 int total=0,avg=0,hong=0,kim=0,kimk=0;
	 System.out.println("이름을 입력하세요");
		name1 = scanner.next();
	 System.out.println("평균점수를 입력");
        avg = scanner.nextInt();
        System.out.println("이름을 입력하세요");
        name2 = scanner.next();
        System.out.println("평균점수를 입력");
        avg = scanner.nextInt();
        System.out.println("이름을 입력하세요");
        name3 = scanner.next();
        System.out.println("평균점수를 입력");
        avg = scanner.nextInt();
		avg=total/3;
		
		if (hong>kim&&hong>kimk) {
			
		} else {

		}
        
	
	
	}
}
