package auto;

public class StringDemoPra {

	public static void main(String[] args) {
		String str = "Java Program to find the largest and smallest word in string";
		String arr[] = str.split(" ");
		String laWord = arr[0], smWord = arr[0], temp = "";//laWord=Apple and smWord=Apple
		for (int i = 0; i < arr.length; i++) {
			temp = arr[i];//0, temp =Apple //1-temp=is//2 - temp=good//3-temp =Fruit
			
			if (temp.length() > laWord.length()) {// 5>5-f//2>5-f//4>5-f//5>5-f
				laWord = temp;
			} else if(temp.length()<smWord.length()){//2<5-t//4<2-f//5<2-f
				smWord=temp;//smWord =is
			}
		}
		System.out.println("Largest Word is : "+laWord+"\n---------------------------------------------------------\nSmallest Word is : "+smWord);
	}
}