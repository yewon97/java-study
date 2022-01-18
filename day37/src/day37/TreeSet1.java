package day37;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("demon");
		hs.add("banana");
		hs.add("tomato");
		hs.add("apple");
		hs.add("cargo");
		
		TreeSet ts = new TreeSet();
		ts.add("demon");
		ts.add("banana");
		ts.add("tomato");
		ts.add("apple");
		ts.add("cargo");
		
		Iterator it = hs.iterator();
		System.out.println("<Hash Set 출력>");
		while(it.hasNext()) {
			System.out.print(" "+it.next());
		}
		System.out.println();
		Iterator it2 = ts.iterator();
		System.out.println("<Tree Set 출력>");
		while(it2.hasNext()) {
			System.out.print(" "+it2.next());
		}
		
		System.out.println();
		System.out.println("현재 TreeSet의 크기 : "+ts.size());
	}

}
