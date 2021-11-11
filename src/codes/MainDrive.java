package codes;

import java.util.Scanner;

public class MainDrive {
public static void main(String[] args) {
	
//	1. 정수 6개 입력받기
	
	Scanner myScanner = new Scanner(System.in);
	int[] myInputNumbers = new int[6]; //입력한 숫자 6개 저장할 배열
	
	for(int i=0; i<myInputNumbers.length;i++) {
		
//		각 자리에 맞는 숫자를 입력할 때 올바를 숫자를 넣을 때 까지 입력하게 시킴
		while(true) {
			

	
		
		System.out.println(i+1+"번째 숫자를 입력하세요");
		int inputNum = myScanner.nextInt(); // 입력한 숫자를 scanner에 담음
		
//		제약조건을 통과했는지 검사
//		검사 1. 1~45 범위 맞는가? 결과를 boolean으로 저장
		boolean isRangeOk = (1 <= inputNum) &&(InputNum<=45>);
		
		
		
		//무조건 조건 통과
		if(isRangeOK) {
			//써도 되는 숫자를 입력했다
			myInputNumbers[i]=inputNum;
			break;
			
		}
		else {System.out.println("잘못된 숫자를 입력했습니다. 다시 입력해 주세요");
	}	
		
	}
	
}
}
