package auto;

import java.util.Arrays;

public class ArrayDuplicates {
	public static void main(String[] args) {
		int a[] = {1,1,9,8,6,5,6,4,5,3,5,3,1,2,5,6,4,5,3,4,5,10};
		Arrays.sort(a);
		System.out.println("Sorted Array..");
		System.out.print(Arrays.toString(a));
		int len =a.length;
		int b[] = new int[len];
		int j=0;
		
		for(int i=0;i<len-1;i++) {
			if(a[i]!=a[i+1]) {
				b[j]=a[i];
				j++;
			}
			b[j]=a[len-1];
		}
		System.out.println();
		System.out.println("-------------------------------------");
		for(int k=0;k<len;k++) {
			if(b[k]!=0) {
				System.out.print(b[k]+" ");
			}
		}
	}
}
