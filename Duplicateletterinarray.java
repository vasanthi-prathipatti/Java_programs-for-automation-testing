
public class Duplicateletterinarray {
public static void main(String args[]) {
	String s="Vasanthi";
	char ch[]=s.toCharArray();
	for(int i=0;i<ch.length;i++) {
		for(int j=i+2;j<ch.length;j++) {
			if(ch[i]==ch[j]) {
				System.out.println(ch[i]);
			}
		}
	}
}
}
