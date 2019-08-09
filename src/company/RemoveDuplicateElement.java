package company;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		String s = "mamta";
		System.out.println(romeduplicate(s));

	}

	public static String romeduplicate(String s) {
		Set<Character> set = new HashSet<>();
		StringBuffer ss = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			Character c1 = s.charAt(i);
			if (!set.contains(c1)) {
				set.add(c1);
				ss.append(c1);
			}
		}
		return ss.toString();

	}
}
