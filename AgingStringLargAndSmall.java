package auto;

public class AgingStringLargAndSmall {
	public static void main(String[] args) {
		String str = "Java programming is a good kt for each Jave Developer";
		String arr[] = str.split(" ");
		int len = arr.length;
		String large =arr[0],small=arr[0],temp="";
		for(int i=0;i<len;i++) {
			temp =arr[i];
			if(temp.length()>large.length()) {
				large = temp;
			}
			else if(temp.length()<small.length()) {
				small =temp;
			}
			temp="";
		}
		System.out.println("Large String is : "+large);
		System.out.println("Smallest String is : "+small);
	}
}
