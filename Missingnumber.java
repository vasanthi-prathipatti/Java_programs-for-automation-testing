
public class Missingnumber {

	public static void main(String[] args) {
		int[] a= {1,2,3,5,6};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			
		}
		System.out.println("sum of number in array"+sum);
		int sum1=0;
		for(int i=1;i<=6;i++) {
			sum1=sum1+i;
		}
		System.out.println("Range of numbers in array"+sum1); 
		int missing=sum1-sum;
		System.out.println("Missing number"+missing);
	}

}
