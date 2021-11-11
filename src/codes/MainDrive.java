package codes;

import java.util.Scanner;

public class MainDrive {
public static void main(String[] args) {
	
//	1. 정수 6개 입력받기
	
	Scanner myScanner = new Scanner(System.in);
	int[] myInputNumbers = new int[6]; //입력한 숫자 6개 저장할 배열
	
	for(int i=0; i<myInputNumbers.length;i++) {
		System.out.println(i+1+"번째 숫자를 입력하세요");
		int inputNum = myScanner.nextInt(); // 입력한 숫자를 scanner에 담음
		
	}
	
}
}
