/**
 * 
 */
package arr;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 14.
 * @author : 황성호
 * @file   :ArrBase.java
 * @story  :배열(array)의 기초
 
 */
public class ArrBase {
	public static void main(String[] args) {
 		Scanner scanner = new Scanner(System.in);
 		int i=0;
 		int[]avg = new int[3];
 		int[]score = new int[3];
 	    String[]name = new String[3];
 	    String[]grade = new String[3];
 		
 		
 		
 		
 		
 		for (; i <avg.length; i++) {
 			System.out.println("이름,점수 입력");
 			name[i]=scanner.next();
 			avg[i] =scanner.nextInt();
		}
 		
 		
 		if (avg[0]>avg[1]&&avg[1]>avg[2]) {
 			grade[0]=name[0];
 			grade[1]=name[1];
 			grade[2]=name[2];
 			score[0]=avg[0];
 			score[1]=avg[1];
 			score[2]=avg[2];
 		} else if(avg[0]>avg[1]&&avg[2]>avg[1]){
 			grade[0]=name[0];
 			grade[1]=name[2];
 			grade[2]=name[1];
 			score[0]=avg[0];
 			score[1]=avg[2];
 			score[2]=avg[1];
 		}else if(avg[1]>avg[0]&&avg[0]>avg[2])
 			{
 		grade[0]=name[1];
 
        grade[1]=name[0];
        grade[2]=name[2];
 		score[0]=avg[1];
 		score[1]=avg[0];
 		score[2]=avg[2];}
 		else if(avg[1]>avg[0]&&avg[2]>avg[0]){
 			
  		
 		grade[0]=name[1];
 		grade[1]=name[2];
 		grade[2]=name[0];
 		score[0]=avg[1];
 		score[1]=avg[2];
 		score[2]=avg[0];
 		}else if(avg[2]>avg[0]&&avg[0]>avg[1]){
 			grade[0]=name[2];
 			grade[1]=name[0];
 			grade[2]=name[1];
 			score[0]=avg[2];
 			score[1]=avg[0];
 			score[2]=avg[1];
 		}else if(avg[2]>avg[0]&&avg[0]>avg[1]){
 			grade[0]=name[2];
 			grade[1]=name[0];
 			grade[2]=name[1];
 			score[0]=avg[2];
 			score[1]=avg[0];
 			score[2]=avg[1];}
 		
 			{
 		
 				System.out.println("1등+"+grade[0]+"점수는"+score[0] );
 				System.out.println("2등+"+grade[1]+"점수는"+score[1] );
 				System.out.println("3등+"+grade[2]+"점수는"+score[2] );
 			}
  	}
 
  }


