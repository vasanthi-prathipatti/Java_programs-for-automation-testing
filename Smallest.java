
public class Smallest {

	public static void main(String[] args) {
		int[] a= {2,1,4,3,8};
		int smallest=a.length;
		for(int i=0;i<a.length;i++) {
			if(a[i]<smallest) {
				smallest=a[i];
			}
		}
		System.out.println(smallest);

	}

}
