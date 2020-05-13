import java.util.*;

class SetDemo{
	public static void main(String args[]){
		HashSet<String> hs = new HashSet<String>();
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