class Demo{
	public static void main(String args[]){
		int a = 10;
		Integer i = new Integer(a);
		System.out.println(a);
		System.out.println(i);
		
		Integer x = 20;   //auto-boxing
		System.out.println(x);
		
		Integer k = new Integer(100);
		int b=k;         //auto-unboxing
		System.out.println(b);
		
		float l = 3.4f;
		Float e = new Float(l);
		System.out.println(e);
	}
}