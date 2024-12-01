//subset in the sense array1 should have the elements present in array2
import java.util.*;
public class Arrayissubsetofanotherarrayornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Array1= {12,3,67,7,10};
		int[] Array2= {67,10,3,7};
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<Array1.length;i++) {
		list.add(Array1[i]);
		}
		ArrayList<Integer> list2=new ArrayList<Integer>();
		for(int i=0;i<Array2.length;i++) {
			list2.add(Array2[i]);
		}
		if(list.containsAll(list2)) {
			System.out.println("subset");
	
		}else {
			System.out.println("not subset");
		}
	}

}
