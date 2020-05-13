class Example<T>{
void show(T x){
	System.out.println(x);
}
}

class GenericDemo{
	public static void main(String args[]){
		Example<Integer> i = new Example<Integer>();
		i.show(new Integer(100)); // auto-boxing
		Example<Double> b = new Example<Double>();
		b.show(4.5);
		Example<String> s = new Example<String>();
		s.show("hello");
		Example x = new Example();
		x.show(30);
		x.show(4.3);
		x.show("bye");
	}
}