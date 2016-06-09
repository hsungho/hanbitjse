package hi;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 8.
 * @author : 황성호
 * @file   :VarEx10.java
 * @story  :실수 double 나머지 예제
 
 */
public class VarEx10 {
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("실수 x입력");
    double x = scanner.nextDouble();
    		System.out.println("실수 y입력");
    double y = scanner.nextDouble();
    		double z = x % y;
    		System.out.println("x % y = " + z);
    		
}
	}

