import java.util.HashMap;

public class Declaringandassigningvaluesinhashmap {

	public static void main(String[] args) {
		HashMap<String,Integer>map=new HashMap<String,Integer>();
		map.put("Vasanthi", 1);
		map.put("Suresh", 2);
		map.put("Arjun", 3);
		System.out.println(map);
		System.out.println(map.containsKey("Vasanthi")); //containsKey()checks whether the key is present in hashmap or not and returns boolean value
		System.out.println(map.get("Suresh"));//get() is used t get value of requested key
	}
	

}
