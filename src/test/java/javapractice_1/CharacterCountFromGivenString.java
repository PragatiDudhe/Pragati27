package javapractice_1;

	 import java.util.LinkedHashMap;
	 import java.util.Map.Entry;
	 import java.util.Set;
	 
public class CharacterCountFromGivenString {
	public static void main(String[] args) {
		
		String S = "Welcome to Mahabaleshwar";
		
		LinkedHashMap<Character, Integer> H = new LinkedHashMap <Character, Integer>();
		for (int i = 0; i<S.length(); i++) {
			if (!(H.containsKey(S.charAt(i)))) {
				H.put(S.charAt(i), 1);
		}else {
			H.put(S.charAt(i), H.get(S.charAt(i))+1);
		}
	}
	Set<Entry<Character, Integer>> ent = H.entrySet();

	for (Entry<Character, Integer> e : ent) {
		System.out.println(e.getKey() + " : " + e.getValue());
		}
	}
}


	


