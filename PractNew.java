package auto;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class PractNew {

	public static void main(String[] args) {
		String a = "java,java,ruby,java,ruby,python,DotNet,python";
		String arr[] =a.split(",");
		System.out.println(Arrays.toString(arr));
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for(int i =0;i<arr.length;i++) {
			String name = arr[i];
			if(map.containsKey(name)) {
				map.put(name,map.get(name)+1);
			}
			else {
				map.put(name,1);
			}
		}
		Set<String> keys = map.keySet();
		for(String k: keys) {
			System.out.println(k+" is at "+map.get(k)+" times.");
		}
	}
}
