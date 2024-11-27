
public class Largest {

	public static void main(String[] args) {
		int[] a= {2,1,4,8,10};
		int largest=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>largest) {
				largest=a[i];
			}
		}
		System.out.println(largest);
	}

}
