package programspractice;

import java.util.HashSet;

public class MissingNumbers {

	public static void main(String[] args) {
		int[] a= {2,4,5,7,8,0};
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		for(int i=0;i<a.length+1;i++) {
			if(!set.contains(i)) {
				System.out.println(i);
			}
		}
	}
	
}
