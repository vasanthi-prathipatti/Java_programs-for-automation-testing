import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Occurancesinlistusinghashmap {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		lst.add("cat");
		lst.add("dog");
		lst.add("cat");
		lst.add("mad");
		HashMap<String,Integer>map=new HashMap<String,Integer>();
		for(String occ:lst) {
			if(map.containsKey(occ)) {
				int count=map.get(occ);
				map.put(occ, count+1);
			}
			else {
				map.put(occ, 1);
			}
		}
		System.out.println(map);

	}

}
