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
		boolean isRangeOk = (1 <= inputNum) &&(inputNum<=45);
//		검사2. 이미 입력한 숫자인가? 중복검사 결과를 boolean으로 저장
//		일단 써도 괜찮다 해뒀다가 -> 내 입력 목록에 지금 입력한 숫자가 들어있나? 찾아보자
//		같은 숫자를 발견했다면 쓰면 안된다고 말 변경
		
//		입력 숫자 목록 조회 -> for each문 활용
		boolean isDupeOk =true;
		for(int num: myInputNumbers) {
//			꺼내온 숫자가 입력한 숫자랑 같은가? 같다면 중복을 발견함
			
			if(num ==inputNum) {
				isDupeOk = false;
				
			}
		}
		
		
//	 	범위 검사 중복검사도 통과하면 숫자 대입
		if(isRangeOk && isDupeOk) {
			//써도 되는 숫자를 입력했다
			myInputNumbers[i]=inputNum;
//			다음 숫자를 받으러 while종료하고 나감
			break;
			
		}
		else {
//			왜 쓰면 안되는지?
			if(!isRangeOk) {
				System.out.println("1~45 숫자만 입력 가능합니다.");
			}
			else {System.out.println("이미 입력한 숫자 입니다.");
				
			}System.out.println("잘못된 숫자를 입력했습니다. 다시 입력해 주세요");
			
		}
	}	
		
	}
	
}
}
