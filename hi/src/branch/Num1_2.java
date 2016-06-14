
package branch;
  
import java.util.Scanner;
  /**
   * @date   :2016. 6. 9. 
   * @author 황성호
 @@ -32,7 +34,72 @@
  	 * ==============
  	 * */
public class Num1_2 {
public static void main(String[] args) {
 		Scanner scanner = new Scanner(System.in);
 		int avg1=0 , avg2=0 , avg3 =0, gradeA1=0,gradeA2=0,gradeA3=0;
 		String name1="",name2="",name3="",grade1="",grade3="",grade2="";
 		
 		System.out.println("이름,점수 입력");
 		name1=scanner.next();
 		avg1 =scanner.nextInt();
 		System.out.println("이름,점수 입력");
 		name2=scanner.next();
 		avg2 = scanner.nextInt();
 		System.out.println("이름,점수 입력");
 		name3=scanner.next();
 		avg3 = scanner.nextInt();
 		
 		
 		if (avg1>avg2&&avg2>avg3) {
 			grade1=name1;
 			grade2=name2;
 			grade3=name3;
 			gradeA1=avg1;
 			gradeA2=avg2;
 			gradeA3=avg3;
 		} else if(avg1>avg2&&avg3>avg2){
 			grade1=name1;
 			grade2=name3;
 			grade3=name2;
 			gradeA1=avg1;
 			gradeA2=avg3;
 			gradeA3=avg2;
 		}else if(avg2>avg1&&avg1>avg3)
 			{
 		grade1=name2;
 
        grade2=name1;
        grade3=name3;
 		gradeA1=avg2;
 		gradeA2=avg1;
 		gradeA3=avg3;}
 		else if(avg2>avg1&&avg3>avg1){
 			
  		
 		grade1=name2;
 		grade2=name3;
 		grade3=name1;
 		gradeA1=avg2;
 		gradeA2=avg3;
 		gradeA3=avg1;
 		}else if(avg3>avg1&&avg1>avg2){
 			grade1=name3;
 			grade2=name1;
 			grade3=name2;
 			gradeA1=avg3;
 			gradeA2=avg1;
 			gradeA3=avg2;
 		}else if(avg3>avg1&&avg1>avg2){
 			grade1=name3;
 			grade2=name1;
 			grade3=name2;
 			gradeA1=avg3;
 			gradeA2=avg1;
 			gradeA3=avg2;}
 		
 			{
 		
 				System.out.println("1등+"+grade1+"점수는"+gradeA1 );
 				System.out.println("2등+"+grade2+"점수는"+gradeA2 );
 				System.out.println("3등+"+grade3+"점수는"+gradeA3 );
 			}
  	}
 
  }