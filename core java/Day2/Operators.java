class Operators{
	public static void main(String args[]){
		int a = 10;
		int b = 11;
		
		if(a >= b){
			System.out.println("a is greater than b");
		}else{
			System.out.println("b is greater than a | A: "+a +"| B: "+b);
			a = b++;
			System.out.println("Value of a after post-increment:"+a);
			System.out.println("Value of b after post-increment:"+b);
		}
	}
}