
public class Mergingof2arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1= {1,2,3,4,5};
		int[] array2= {7,6,9,8,10};
		int lenofarray1=array1.length;
		int lenofarray2=array2.length;
		int lenofarrays=lenofarray1+lenofarray2;
		int[] mergedarray=new int[lenofarrays];
		for(int i=0;i<lenofarray1;i++) {
			mergedarray[i]=array1[i];
			
		}
		for(int i=0;i<lenofarray2;i++) {
			mergedarray[lenofarray1+i]=array2[i];
	}
		for(int i=0;i<lenofarrays;i++) {
			System.out.println(mergedarray[i]);
		}

}
}