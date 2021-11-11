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
	
//	int[] winLottoNumbers = {2,13,20,30,31,41};///////////////////
	///////////3. 로또 번호를 랜덤으로 추출
	
	int[] winLottoNumbers = new int[6];
	
//	6개를 넣기 위한 for 문
	
	for(int i=0; 1< winLottoNumbers.length;i++) {
		
//		써도 되는 숫자를 뽑을 떄 까지 무한 반복
		while(true) {
//			랜덤 숫자 추출 -> 1~45 추출하면 범위 검사는 필요 없음
//			랜덤 추출: Math.random() => 0.0~1.0 사이의 값이 랜덤으로 추출 됨 따라서 Math.random *45 는 0~45랜덤 따라서 +1
			
			int randomNum = (int)(Math.random()*45+1);
			
			System.out.println(randomNum);
			
//			중복검사 진행
//			당첨 번호 배열에 랜덤 숫자가 있다면 검사 탈락
			
			boolean isDupOk = true;
			
//			당첨번호 목록 조회
			for (int winNum : winLottoNumbers) {
				if (winNum==randomNum) {
					
					isDupOk=false;
				}
			}
//			isDupOk 가 true일때? 중복 없음
						
			
//			임시 - 사용
			if(isDupOk) {
				System.out.println("당첨 숫자"+randomNum);
			winLottoNumbers[i]=randomNum;
			break;
			}
			
		}
	}
	
/////////보너스 번호 추첨 추가
//	1~45랜덤 + 당첨번호와 중복X
	int bonusNum =0;
	//하나의 보너스 번호를 제대로 뽑을 때 까지 반복
	
	while(true) {
//		1~46 숫자 랜덤
		int randomNum = (int)(Math.random()*45+1);
//		당첨번호 안에 이미 있는지?
		boolean isDupeOk = true;
		for (int winNum : winLottoNumbers) {
			if(randomNum==winNum) {
//				중복 발견
				isDupeOk = false;
				
				
			}
		}
		
//		true면 사용해도 됨
		if(isDupeOk) {
			
			bonusNum = randomNum;
			break;
		}
		
		
		
	}
//	///////////////////////////////////////////////////// 오름차순 정렬을 할 것임 bubble Soㄱt
	for(int i =0 ; i<winLottoNumbers.length;i++) {
		
		
		
//		///j+1번 칸으로 가면 배열 범위를 벗어날 위험이 있다 따라서 길이 -1까지만 가도록 함
		for(int j=0; j<winLottoNumbers.length-1;j++) {
//			j:0 -> 당첨번호 비교해서 순서가 잘못되었다면 자리 바꾸기
			
			if(winLottoNumbers[j]>winLottoNumbers[j+1]) {
				int backUp = winLottoNumbers[j];
				winLottoNumbers[j]= winLottoNumbers[j+1];
				winLottoNumbers[j+1]=backUp;
			}
			
			
		}
	}
	
	
	
//	////////////////////////////////당첨 번호도 출력
	for (int winNum : winLottoNumbers) {
		System.out.println("당첨 번호");
	}
	
	System.out.println("보너스 번호"+bonusNum);
	
	
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
		
//		System.out.println("3등");

//		//보너스 번호가 들어있다면 2등인것을 다시 검사
//		1)일단 못맞춘것이 디폴트 맞추면 true
		boolean isBonusCorrect = false;
		
		for(int myNum : myInputNumbers) {
			if(bonusNum==myNum) {
				isBonusCorrect=true;
			}
		}
//		당첨 맞으면 2등 아니면 3등
		if(isBonusCorrect) {
		System.out.println("2등");	
		}
		else {
			System.out.println("3등");
		}
		
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
