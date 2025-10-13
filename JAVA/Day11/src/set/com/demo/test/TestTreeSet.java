package set.com.demo.test;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {

		Set<Integer> tset = new TreeSet<>();
		tset.add(63);
		tset.add(5);
		tset.add(56);
		tset.add(13);
		
		System.out.println(tset);
	}

}
