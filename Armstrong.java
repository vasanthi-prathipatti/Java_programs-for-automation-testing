 
public class Armstrong {

	public static void main(String[] args) {
		int n=153,temp,Armstrong=0, originalnum=n;
		while(n>0) {
		temp=n%10;
		temp=(int) Math.pow(temp, 3);
		Armstrong=Armstrong+temp;
		n=n/10;
		
		}
		if(Armstrong==originalnum) {
			System.out.println("Armstrong number:"+Armstrong);
		}else {
			System.out.println("not Armstrong");
		}

	}

}
