package com.test;

import java.util.Arrays;
import java.util.Scanner;

public class exam02 {
//str�� ���� cnvr�� �����غ���.
	// 1.��ü�� �������ڷ� ��� toUpperCase()
	// 2.��ü�� �ҹ��ڷ� ���
	// 3.������ ���� �� ���
	// 4.������ ã�� ��Ʈ�� ���
	// 5.�Էµ� ���ڸ� ���� �� ���=Scanner�� ����Ѵ�.
	// 6.���ڿ��� �ϳ��� ����Ʈ�� ��ȯ �� ���. getBytes �̿�
	// 7.���ڿ��� �������� ��ö �ؼ� ��ö�� �����͸� ǥ���ϱ� cnvr01 cnvr02 cnvr03 //split tochararray trim
	// +8. ����ȿ� ���ڸ� �ְ�, ���ڸ� ������ ���� ���ϱ�.

	public static void cnvr1(String res) {
		System.out.println(res.toUpperCase());

	}

	public static void cnvr2(String res) {
		System.out.println(res.toLowerCase());
	}

	public static void cnvr3(String res) {
		res = res.replace(" ", ""); // old char, to new char " " to ""
		System.out.println(res.trim()); // trim ���ʿ�
	}

	public static void cnvr4(String res) {
		res = res.replace(" ", "��");
		System.out.println(res);

	}

	public static void cnvr5(String res) {
		Scanner scan = new Scanner(System.in); // Scanner ��ü
		String word;
		word = scan.nextLine();
		System.out.println(res.replace(word, " "));
	}

	public static void cnvr6(String res) {
		byte[] b = res.getBytes();
//		for ( int i=0; i<b.length; i++) {
//		System.out.println(b[i]);
//	}
		System.out.println(Arrays.toString(b)); // ����Ʈ(��̿� ���)
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
				// �� �𸣰ڳ�...

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
