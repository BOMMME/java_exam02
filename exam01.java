package com.test;

//����1) cnvr() �޼ҵ�� �����ؼ� �빮���� ������ �ҹ����� ������ ����ϰ� isUpperCase, isLowerCase
//�빮�ڸ� �ҹ��ڷ�, �ҹ��ڸ� �빮�ڷ� ��ȯ �� ���ä��޴´�.  toLowerCase() toUpperCase()

//string -> char[] -> for (character class) cnt-> is�ø��� >> toUpper toLower. 
public class exam01 {
	public static String cnvr(String res) {
//		�빮�ڰ��� �迭, is�޼ҵ�. //for �ᵵ charat
//		�ҹ��ڰ���
//		�빮�� �ҹ��ڷ� �ҹ��� �빮�ڷ�

		// res�� str�� �����մϴ�.�޼ҵ� �ȿ��� str�� ���׿�.. 

//		String res=new String; �ʿ���׿�: �̹� ��ǲ�� String���� �����Ƿ�.

		char[] res1 = res.toCharArray();
		int cnt_up = 0;
		int cnt_lo = 0;

		for (int i = 0; i < res.length(); i++) {
//			System.out.println(res1[i]);
			if (Character.isUpperCase(res1[i])) {//char�� is~�Լ� ��밡��
				cnt_up++;
				res1[i] = Character.toLowerCase(res1[i]);//��ȯ�ؼ� �״�� �ֱ�
			} else if (Character.isLowerCase(res1[i])) {
				cnt_lo++;
				res1[i] = Character.toUpperCase(res1[i]);
			}
		}
		System.out.println("�빮��: " + cnt_up + "�ҹ���: " + cnt_lo);

		return new String(res1); // �� ��Ʈ������ ���� ==���Ⱑ ���ذ� �� �ȵ�
//		return res;//�̰Ŵ� �������� res�� ���� ��ȯ�Ȱ� �޾Ƶ鿩�� ����, �׷��� String���� ��ȯ�� res1�ʿ�. new�� �ʿ�. ���ݰ� res1�� charŸ���̾����Ƿ�  
	}

	// The String class represents character strings.
	public static void main(String[] args) {
		String str = "The String class represents character strings.";//res�� �ٷ� ���� ���ο� ��ü�� ���..
		String res = cnvr(str);
		System.out.println(res);
	}

} // �ڵ� �������ϱ� ȥ�ڼ� �غ�����~~~~
