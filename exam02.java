package com.test;

import java.util.Arrays;
import java.util.Scanner;

public class exam02 {
//str을 받은 cnvr을 조작해보자.
	// 1.전체를 ㄷㅐ문자로 출력 toUpperCase()
	// 2.전체를 소문자로 출력
	// 3.공백을 제거 후 출력
	// 4.공백을 찾아 하트로 출력
	// 5.입력된 글자를 삭제 후 출력=Scanner를 사용한다.
	// 6.문자열string을 하나씩 바이트로 변환 후 출력. getBytes 이용
	// 7.문자열을 공백으로 분철 해서 분철된 데이터를 표현하기 cnvr01 cnvr02 cnvr03 //split tochararray trim
	// +8. 문장안에 숫자를 넣고, 숫자만 꺼내서 합을 구하기.

	public static void cnvr1(String res) {
		System.out.println(res.toUpperCase());

	}

	public static void cnvr2(String res) {
		System.out.println(res.toLowerCase());
	}

	public static void cnvr3(String res) {
		res = res.replace(" ", ""); // old char, to new char " " to ""
		System.out.println(res.trim()); // trim 노필요
	}

	public static void cnvr4(String res) {
		res = res.replace(" ", "★");
		System.out.println(res);

	}

	public static void cnvr5(String res) { // 스캐너 어려웡
		Scanner scan = new Scanner(System.in); // Scanner 객체 생성자
		String word = scan.nextLine(); // input하는 함수
		System.out.println(res.replace(word, " "));
		scan.close(); // 스캐너 닫는거 습관화화기
	}

	public static void cnvr6(String res) {
		byte[] b = res.getBytes(); // 바이트 어레이 안바꾸고 바로 string getbyte가능 
//		for ( int i=0; i<b.length; i++) {
//		System.out.println(b[i]);
//	}
		System.out.println(Arrays.toString(b)); // 리스트(어레이에 담기)
	}

	public static void cnvr7(String res) { // split
		String[] s = res.split(" ");
//		for (int i = 0; i < s.length; i++) {
//			System.out.println(s[i]);
//		}
		System.out.println(Arrays.toString(s)); // 여기서 System.out.println(s); 하면? : [Ljava.lang.String;@1376c05c : 참조하는 주소
//												//System.out.println(s.toString()); //역시 동일하게 주소가 나옴. 
		// System.out.println(s.toString(s)); :Exception in thread "main"
		// java.lang.Error: Unresolved compilation problem:
		// The method toString() in the type Object is not applicable for the arguments
		// (String[])

	}

	public static void cnvr8(String res) {
		char[] num = res.toCharArray();
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
//			System.out.println(res1[i]);
			if (Character.isDigit(num[i])) {
//				System.out.println(num[i]);
				sum += Character.getNumericValue(num[i]);//숫자로 바꿨는데 10진수가 아니라서 넣어줌. 
				// 아 모르겠네...
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		String str = "    The 36String 4class 6represents 5character 7strings.      "; // str을 입력받지만, 메소드에서 함수 구현할때는
																						// 입력인자인 String으로 작성할 것.
//		cnvr1(str);
//		cnvr2(str);
//		cnvr3(str);
//		cnvr5(str);
//		cnvr6(str);
//		cnvr7(str);
		cnvr7(str);
	}

}

/*
 * 학준님 코드
 * 
 * 
 * package com.exam0628; import java.util.Scanner; // 문제 2) str을 받은 cnvr을 조작해보자
 * // 1. 전체를 대문자로 출력 // 2. 전체를 소문자로 출력 // 3. 공백을 제거 후 출력 // 4. 공백을 찾아 하트로 출력 //
 * 5. 입력된 글자를 삭제 후 출력 = Scanner를 사용한다. // 6. 문자열을 하나씩 바이트로 출력 getBytes // 7.
 * 문자열을 공백으로 분철해서 분철된 데이터를 출력 
 * 
 * public class Exam02 { 
 * 
 * public static void cnvr(String str) { 
 * 
 * System.out.println("1. " + str.toUpperCase());
 * System.out.println("2. " + str.toLowerCase()); 
 * System.out.println("3. " + str.replace(" ", "")); 
 * System.out.println("4. " + str.replace(" ", "♥"));
 * Scanner sc = new Scanner(System.in); String res = sc.next(); sc.close();
 * System.out.println("5. " + str.replace(res, " ")); 
 * 
 * 
 * for (byte i : str.getBytes()) { //array 담을 필요없이 바로 바이트로 변환하여 출력 
 * System.out.println("6. " + i); } 
 * for (String i : str.split("\s")) { //\s는 스페이스 한칸 띄우기. \t는 탭띄우기 
 * System.out.println("7. " + i);
 * } 
 *} 
 *public static void main(String[] args) { 
 * String str = "The String class represents character string."; cnvr(str); } }
 * 
 */