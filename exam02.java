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
	// 6.���ڿ�string�� �ϳ��� ����Ʈ�� ��ȯ �� ���. getBytes �̿�
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

	public static void cnvr5(String res) { // ��ĳ�� �����
		Scanner scan = new Scanner(System.in); // Scanner ��ü ������
		String word = scan.nextLine(); // input�ϴ� �Լ�
		System.out.println(res.replace(word, " "));
		scan.close(); // ��ĳ�� �ݴ°� ����ȭȭ��
	}

	public static void cnvr6(String res) {
		byte[] b = res.getBytes(); // ����Ʈ ��� �ȹٲٰ� �ٷ� string getbyte���� 
//		for ( int i=0; i<b.length; i++) {
//		System.out.println(b[i]);
//	}
		System.out.println(Arrays.toString(b)); // ����Ʈ(��̿� ���)
	}

	public static void cnvr7(String res) { // split
		String[] s = res.split(" ");
//		for (int i = 0; i < s.length; i++) {
//			System.out.println(s[i]);
//		}
		System.out.println(Arrays.toString(s)); // ���⼭ System.out.println(s); �ϸ�? : [Ljava.lang.String;@1376c05c : �����ϴ� �ּ�
//												//System.out.println(s.toString()); //���� �����ϰ� �ּҰ� ����. 
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
				sum += Character.getNumericValue(num[i]);//���ڷ� �ٲ�µ� 10������ �ƴ϶� �־���. 
				// �� �𸣰ڳ�...
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		String str = "    The 36String 4class 6represents 5character 7strings.      "; // str�� �Է¹�����, �޼ҵ忡�� �Լ� �����Ҷ���
																						// �Է������� String���� �ۼ��� ��.
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
 * ���ش� �ڵ�
 * 
 * 
 * package com.exam0628; import java.util.Scanner; // ���� 2) str�� ���� cnvr�� �����غ���
 * // 1. ��ü�� �빮�ڷ� ��� // 2. ��ü�� �ҹ��ڷ� ��� // 3. ������ ���� �� ��� // 4. ������ ã�� ��Ʈ�� ��� //
 * 5. �Էµ� ���ڸ� ���� �� ��� = Scanner�� ����Ѵ�. // 6. ���ڿ��� �ϳ��� ����Ʈ�� ��� getBytes // 7.
 * ���ڿ��� �������� ��ö�ؼ� ��ö�� �����͸� ��� 
 * 
 * public class Exam02 { 
 * 
 * public static void cnvr(String str) { 
 * 
 * System.out.println("1. " + str.toUpperCase());
 * System.out.println("2. " + str.toLowerCase()); 
 * System.out.println("3. " + str.replace(" ", "")); 
 * System.out.println("4. " + str.replace(" ", "��"));
 * Scanner sc = new Scanner(System.in); String res = sc.next(); sc.close();
 * System.out.println("5. " + str.replace(res, " ")); 
 * 
 * 
 * for (byte i : str.getBytes()) { //array ���� �ʿ���� �ٷ� ����Ʈ�� ��ȯ�Ͽ� ��� 
 * System.out.println("6. " + i); } 
 * for (String i : str.split("\s")) { //\s�� �����̽� ��ĭ ����. \t�� �Ƕ��� 
 * System.out.println("7. " + i);
 * } 
 *} 
 *public static void main(String[] args) { 
 * String str = "The String class represents character string."; cnvr(str); } }
 * 
 */