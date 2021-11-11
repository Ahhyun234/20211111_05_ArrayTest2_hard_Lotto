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
//		검사1. 1~45 범위 맞는가? 결과를 boolean으로 저장
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
	
//	6개의 숫가 입력 완료
//	2. 6개의 당첨 번호 (직접 타이핑) 임시:
	
	int[] winLottoNumbers = {2,13,20,30,31,41};
	
//	몇등인지 판단 = 몇개의 숫자가 같은지 
	
	int correctCount =0;
	
//	내 번호를 하나 들고, 당첨번호 6개를 비교 해 보자 (하나씩 비교를 6번 반복)
	
	for(int myNumber:myInputNumbers) {
//		당첨 번호 6개 꺼내기
		for(int winNum : winLottoNumbers) {
//			내 번호와 당첨 번호가 같은가?
			if(winNum==myNumber) {
//				akw춘 숫라를 하나더 발견
				correctCount++;
			}
		}
	}
	
//	맞춘 변수가 correctCount에 확보됨. 등수 판단
	
	if(correctCount==6) {
		System.out.println("1등");
		}
	else if(correctCount==5) {
		System.out.println("3등");
		}
	else if(correctCount==4) {
		System.out.println("4등");
		}
	else if(correctCount==3) {
		System.out.println("5등");
		}
	else {System.out.println("낙첨");}
	
}
}
