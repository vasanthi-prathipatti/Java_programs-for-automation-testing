
public class Givennumberisprimeornot {

	public static void main(String[] args) {
		int n=13; boolean isprime=true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				isprime=false;
				
			}
			
			
		}
		System.out.println(isprime);

	}

}
