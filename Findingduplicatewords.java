
public class Findingduplicatewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java is a proggramming language java is";
		String words[]=s.split(" ");
		int count=0;
		for(int i=0;i<=words.length-1;i++) {
			for(int j=i+1;j<=words.length-1;j++) {
				count=1;
				if(words[i].equalsIgnoreCase(words[j])) {
					count++;
					words[j]="0";//to avoid printing the already visited word
				}
				if(count>1 && words[i]!="0") {
					System.out.println(words[i]);
				}
			}
		}
	}

}
