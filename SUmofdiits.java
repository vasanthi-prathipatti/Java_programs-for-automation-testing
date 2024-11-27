
public class SUmofdiits {
//rdtechnicallearning
	public static void main(String[] args) {
		int num=125;
		int sum=0;
		int remainder;
		while(num>0) {
			 remainder=num%10;
			 sum=sum+remainder;
			 num=num/10;
		}
		System.out.println(sum);
	}

}
