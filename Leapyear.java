
public class Leapyear {
	static boolean isleapyear=false;
	public static void year(int year) {
		if(year%4==0) {          //a leaap year is divisible by 4
			isleapyear=true;
			System.out.println("it is a leap year");
		}else {
			isleapyear=false;
			System.out.println("it is not a leap year");
		}
//		System.out.println(isleapyear);
	}
	public static void main(String[] args) {
		year(2000);

	}

}
