package auto;

public class NumberLargeAndSmall {

	public static void main(String[] args) {
		int a[] = {10,20,30,50,60,70};
		int max =a[0],min=a[0],temp;
		for(int i=0;i<a.length;i++) {
			temp = a[i];
			if(temp>max) {
				max =temp;
			}
			else if(temp<min) {
				min =temp;
			}
		}
		System.out.println("Maximum Number Is : "+max);
		System.out.println("Minimum Number Is : "+min);
	}
}
