import java.util.Stack;

class ListDemo1{
	public static void main(String args[]){
		
		Stack<String> s = new Stack<String>();
		s.push("F");
		s.push("X");
		s.push("E");
		s.push("C");
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
	
	}
	
}