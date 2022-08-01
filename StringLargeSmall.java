package auto;

import java.util.Arrays;

public class StringLargeSmall {
	public static void main(String[] args) {
		String a = "Java Program to find the largest and smallest word in string";
		String arr[] = a.split(" ");
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		String lg = arr[0], sm = arr[0], temp = "";
		
		for (int i = 0; i < arr.length; i++) {
			temp = arr[i];
			if (temp.length() < sm.length()) {
				sm = temp;
			} else 
				if (temp.length() > lg.length()) {
					lg = temp;
				}
			temp = "";
		}
		System.out.println("Largerst " + lg);
		System.out.println("Smallest " + sm);
	}
}
