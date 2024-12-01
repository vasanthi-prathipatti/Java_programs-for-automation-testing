
import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Heart";
		String s1="Earth";
		String s2=s.toLowerCase();
		String s3=s.toLowerCase();
		char ch[]=s2.toCharArray();
		char ch2[]=s3.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch2);
				if(Arrays.equals(ch,ch2)) {
					System.out.println("Anagram");
				}else {
					System.out.println("not an anagram");
				}
			
		
	}

}
