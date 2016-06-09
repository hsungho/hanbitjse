/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 9.
 * @author : 황성호
 * @file   :MonthEnd.java
 * @story  :
 
 */
public class MonthEnd {
   /**
    * 월을 입력하면 말일이 몇일인지 알려주는
    * 프로그램.
    * 단, 2월은 29일로 한정함.
    * 1~12를 벗어난 숫자를 입력하면
    * 잘못된 입력값입니다 라고 뜬다.
    * */
	public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        int  end =0,day=0;
        String mon;
        System.out.println("월을 입력하세요"); 
        mon = scanner.next();
         
        
        switch (mon) {
		case "1":
			day =31;
			break;
		case "2":
			day =29;
			break;
		case "3":
			day =30;
			break;
		case "4":
			day =31;
			break;
		case "5":
			day =30;
			break;
		case "6":
			day =31;
			break;
		case "7":
			day =31;
			break;
		case "8":
			day =31;
			break;
		case "9":
			day =30;
			break;
		case "10":
			day =31;
			break;
		case "11":
			day =30;
			break;
		case "12":
			day =31;
			break;
			
			

		default:
			System.out.println("1~12월을 입력해주세요");
			return;
			
		
		}      
        System.out.println(+mon+"월의말일은"+day+"입니다");
        
        
}
}
