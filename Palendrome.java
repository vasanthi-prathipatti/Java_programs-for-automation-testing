
public class Palendrome {

	public static void main(String[] args) {
		String a="abcdcba";
		int i=0;int j=a.length()-1;
		while(i<j) {
			if(a.charAt(i)!=a.charAt(j)) {
				System.out.println("not palendrome");
			}
			i++;
			j--;
		
		}
		System.out.println("palendrome");
	}

}
