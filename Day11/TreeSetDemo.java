import java.util.*;

class TreeSetDemo{
	public static void main(String args[]){
		TreeSet<String> hs = new TreeSet<String>();
		System.out.println(hs.isEmpty());
		hs.add("F");
		hs.add("T");
		hs.add("V");
		hs.add("M");
		hs.add("C");
		hs.add("");
		hs.add("F");
		hs.add("P");
		hs.add("W");
		hs.add("S");
		hs.add("H");
		hs.add("N");
		hs.add("R");
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		System.out.println(hs.contains("N"));
		System.out.println(hs.remove("N"));
		System.out.println(hs);
		Object o = hs.clone();
		System.out.println(o);
		System.out.println(hs.headSet("M", true));
		System.out.println(hs.tailSet("M", false));
		System.out.println(hs.subSet("M", false, "S", true));
		
	}
}