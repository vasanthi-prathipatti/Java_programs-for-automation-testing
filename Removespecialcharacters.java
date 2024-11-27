
public class Removespecialcharacters {

	public static void main(String[] args) {
		String s="%123ghdreAK&@#$%&^&";
		String s2=s.replaceAll("[^a-zA_Z0-9]", "");
		System.out.println(s2);
	}

}
