
public class Fibonocciseries {

	public static void main(String[] args) {
		int x=1;int y=1;int z;int n=13;
		for(int i=0;i<n;i++) {
			z=x+y;
			x=y;
			y=z;
			System.out.println(z);
		}

	}

}
