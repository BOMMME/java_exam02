package com.test;

//문제1) cnvr() 메소드로 대입해서 대문자의 개수와 소문자의 개수를 출력하고 isUpperCase, isLowerCase
//대문자를 소문자로, 소문자를 대문자로 변환 후 리ㅓㄴ받는다.  toLowerCase() toUpperCase()

//string -> char[] -> for (character class) cnt-> is시리즈 >> toUpper toLower. 
public class exam01 {
	public static String cnvr(String res) {
//		대문자개수 배열, is메소드. //for 써도 charat
//		소문자개수
//		대문자 소문자로 소문자 대문자로

		// res는 str을 참조합니다.메소드 안에는 str이 없네영.. 

//		String res=new String; 필요없네영: 이미 인풋을 String으로 받으므로.

		char[] res1 = res.toCharArray();
		int cnt_up = 0;
		int cnt_lo = 0;

		for (int i = 0; i < res.length(); i++) {
//			System.out.println(res1[i]);
			if (Character.isUpperCase(res1[i])) {//char만 is~함수 사용가능
				cnt_up++;
				res1[i] = Character.toLowerCase(res1[i]);//변환해서 그대로 넣기
			} else if (Character.isLowerCase(res1[i])) {
				cnt_lo++;
				res1[i] = Character.toUpperCase(res1[i]);
			}
		}
		System.out.println("대문자: " + cnt_up + "소문자: " + cnt_lo);

		return new String(res1); // 뉴 스트링으로 생성 ==여기가 이해가 잘 안됨
//		return res;//이거는 오리지날 res로 리턴 변환된게 받아들여지 않음, 그래서 String으로 변환된 res1필요. new도 필요. 지금것 res1은 char타입이었으므로  
	}

	// The String class represents character strings.
	public static void main(String[] args) {
		String str = "The String class represents character strings.";//res에 바로 말고 새로운 객체에 담기..
		String res = cnvr(str);
		System.out.println(res);
	}

} // 코딩 못했으니까 혼자서 해보세영~~~~
