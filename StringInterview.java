package auto;

import java.util.Arrays;

public class StringInterview {
	public static void main(String[] args) {
		String a ="Java Program to find the largest and smallest word in string";
//		String arr[] = a.split(" ");
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
		
		String large ="",small="",word="";
		
		a=a+" ";
		for(int i=0;i<a.length();i++) {
			char ch =a.charAt(i);
			if(ch!=' ') {
				word=word+ch;
//				System.out.println(word);
			}
			else {
				if(word.length()>large.length()) {
				large =word;
//				System.out.println("Large : ---- "+large);
				word="";
				}
			}
		}
		System.out.println("Largest String : "+large);
	}
}
