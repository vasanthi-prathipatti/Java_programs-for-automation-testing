import java.util.Arrays;

public class Evenlengthwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="my name is Automations";
		String[] s1=s.split(" ");
		for(String s2:s1) {
		if(s2.length()%2==0) {
			System.out.println(s2);
				
			}
		}
	}

}
