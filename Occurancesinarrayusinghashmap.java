import java.util.HashMap;

public class Occurancesinarrayusinghashmap {

	public static void main(String[] args) {
		String s="vasanthisuresh are";
		String str[]=s.split("" );
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		for(int i=0;i<str.length;i++) {
			if(map.containsKey(str[i])) {
				int count=map.get(str[i]);
				map.put(str[i], count+1);
			}
			else {
				map.put(str[i], 1);
			}
		}
		System.out.println(map);
		 }
	

	

}
