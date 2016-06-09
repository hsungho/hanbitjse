
package branch;

import java.util.Scanner;

/**
 * @date : 2016. 6. 8.
 * @author : 황성호
 * @file :Avg.java
 * @story :
 * 
 */
public class Avg2 {
	/**
	 * 클라이언트에서 프로그램 개발 요청이왔습니다. 이름과 국,영,수 세과목점수를 입력받아서 
	 * [홍길동 : 총점 ***점,평균***점,학점 : f]
	 * 을 출력하는 프로그램을 만들어 주세요. 
	 * 단) 평균은 소수점이하는 절삭합니다 
	 * 평균점수가 90점 이상 a
	 * 80점 이상이면 b
	 * 70점 이상이면 c
	 * 60점 이상이면 d
	 * 50점 이상이면 e
	 * 50점 미만이면 f 학점입니다라고 출력되게 해주세요
	 * 미만이면 불합격, 이상이면 합격입니다
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name="", result = "";
		int kor = 0, eng = 0, math = 0, total = 0, avg = 0;
		System.out.println("이름을 입력하세요");
		name = scanner.next();
		System.out.println("국어 점수를 입력하세요");
        kor = scanner.nextInt();
        if(kor>=100|| kor<0){
        	System.out.println("100이하를 입력하세요");
        	return; }
        
        System.out.println("영어 점수를 입력하세요");
        eng = scanner.nextInt();
        if(eng>100||eng<0){
        	System.out.println("100이하를 입력하세요");
        	return; }
        
        System.out.println("수학 점수를 입력하세요");
        if(math>100||math<0){
        	System.out.println("100이하를 입력하세요");
        	return; }
        
        math = scanner.nextInt();
        total = kor+eng+math;
        avg = total / 3;
       
        
        if (avg>=90) {
			result = "A";
		} else if(avg>=80) {
           result = "B"; }
		else if(avg>=70) {
	           result = "C"; }
		else if(avg>=60) {
	           result = "D"; }
		else if(avg>=50) {
	           result = "E"; }
		else if(avg<50) {
	           result = "F"; }
        
        System.out.println("이름" +name+ "총점" +total+ "평균" +avg+"입니다" + result+"학점입니다" );
        

        
		

	
	}

}