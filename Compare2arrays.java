
public class Compare2arrays {

	public static void main(String[] args) {
		int[] array1= {2,4,3,6,7};
		int[] array2= {3,4,3,9,8};
		int len1 =array1.length;
		int len2 =array2.length;
		if(len1==len2) {
			for(int i=0;i<=array1.length-1;i++) {
				for(int j=0;j<array2.length-1;j++) {
					if(array1[i]==array2[j]) {
						System.out.println("array1[i]");
					}
				}
				
			}
			
		}
	}

}
