import java.util.Arrays;
import java.util.HashMap;

public class UniqueElementsinastring {

	public static void main(String[] args) {
		String s="vasanthi";
		String unique="";
			for(int i=0;i<s.length();i++) {
				char ch=s.charAt(i);
				if(s.indexOf(ch)==s.lastIndexOf(ch)) {//the first apperance of char will be same asthe last apperance of the char,indexOf()-->returns index number of char from left to right,lastindexOf()-->returns index num of char from right to left  
					unique +=ch;
				}
			}
			System.out.println(unique);
				
		}
}
