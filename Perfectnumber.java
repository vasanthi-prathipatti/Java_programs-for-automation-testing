
public class Perfectnumber {

	public static void main(String[] args) {
		// Perfect number is a number all positive divisors excluding the number itself )is equal to that number itself
		int number=6;
		int sum=0;
		for(int i=1;i<number;i++) {
			if(number%i==0) {
				sum=sum+i;
			}
		}
		if(sum==number) {
			System.out.println(number+"is perfectnumber");
		}else {
			System.out.println(number+"is not perfectnumber");
		}

	}

}
