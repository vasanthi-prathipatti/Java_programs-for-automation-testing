
public class Vowels {

	public static void main(String[] args) {
		String s="VasanthiSuresh";
		int vcount=0; int ccount=0;
		String str=s.toLowerCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				vcount++;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				ccount++;
			}
		}
	System.out.println("vowels"+vcount);
	System.out.println("consonants"+ccount);
		

	}

}
