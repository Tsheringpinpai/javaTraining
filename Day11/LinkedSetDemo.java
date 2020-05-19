import java.util.*;

class LinkedSetDemo{
	public static void main(String args[]){
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
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
		
	}
}