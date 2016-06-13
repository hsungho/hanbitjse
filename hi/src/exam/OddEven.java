/**
 * 
 */
package exam;

import java.util.Random;
import java.util.Scanner;

/**
 * @date   : 2016. 6. 10.
 * @author : 황성호
 * @file   :OddEven.java
 * @story  :
 
 
public class OddEven {
	/**
	 * 개발자님,홀짝 게임하나 만들어 주세요.
	 * 사용자가 홀인지 짝인지 맞추면
	 * Win 틀리면 LOOSE 가 출력되면 됩니다.
	 * 
	 * */
public class OddEven {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int num=0 , num2=0 , num3=0,usernum=0;
		String result="";
				
		num= random.nextInt(10)+1;
		
		System.out.println("==개발자만보는화면==");
		System.out.println("랜덤수는"+num);
		System.out.println("돈을 거시는데 짝이라고 생각하면 0을"
				+"홀이라고 생각하면1을입력하시오");
		usernum = scanner.nextInt();
		
		num2 = num % 2;
		
		
		if (num2==usernum) {
			result = "win";
			
		} else {
             
             result ="Loose";
             
		}
		
		System.out.println(result);
	}
}
