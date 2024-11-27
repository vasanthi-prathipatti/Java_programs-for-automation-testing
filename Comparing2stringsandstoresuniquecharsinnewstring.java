
public class Comparing2stringsandstoresuniquecharsinnewstring {

	public static void main(String[] args) {
		String s="Vasanthi";
		String s1="Suresh";
		String uniqueofs="";
		String uniqueofs1="";
		
		if(s.equalsIgnoreCase(s1)) {
			System.out.println("Equal");
		}
		else {
			for(int i=0;i<s.length();i++) {
				for(int j=0;j<s1.length();j++) {
					char ch=s.charAt(i);
					char ch1=s1.charAt(j);
					if(s.indexOf(ch)==s.lastIndexOf(ch)&&(s1.indexOf(ch1)==s1.lastIndexOf(ch1))){
						uniqueofs+=ch;
						uniqueofs1+=ch1;
						
					}
					
				
				}
				
			}
			String s2=uniqueofs.concat(uniqueofs1);//concat is method of String class used to add 2 strings in new object
			System.out.println(s2);
		}

	}

}
