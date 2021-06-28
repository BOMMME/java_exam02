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
	// 6.문자열을 하나씩 바이트로 변환 후 출력. getBytes 이용
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

	public static void cnvr5(String res) {
		Scanner scan = new Scanner(System.in); // Scanner 객체
		String word;
		word = scan.nextLine();
		System.out.println(res.replace(word, " "));
	}

	public static void cnvr6(String res) {
		byte[] b = res.getBytes();
//		for ( int i=0; i<b.length; i++) {
//		System.out.println(b[i]);
//	}
		System.out.println(Arrays.toString(b)); // 리스트(어레이에 담기)
	}

	public static void cnvr7(String res) { // split
		String[] s = res.split(" ");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
//	System.out.println(Arrays.toString(s));

	}

	public static void cnvr8(String res) {
		char[] num = res.toCharArray();
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
//			System.out.println(res1[i]);
			if (Character.isDigit(num[i])) {
//				System.out.println(num[i]);
				sum += Character.getNumericValue(num[i]);
				// 아 모르겠네...

			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		String str = "    The 36String 4class 6represents 5character 7strings.      ";
//		cnvr1(str);
//		cnvr2(str);
//		cnvr3(str);
//		cnvr5(str);
//		cnvr6(str);
//		cnvr7(str);
		cnvr8(str);
	}

}
