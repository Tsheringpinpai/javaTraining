abstract class Restaurant{
	abstract void takeOrder(String order1, String order2);
	abstract void takeOrder(String order1);
}

class Ohris extends Restaurant{
	void takeOrder(String order1, String order2){
		System.out.println("Order given in ohris is "+order1+order2);
	}
	
	void takeOrder(String order1){
		System.out.println("Order given in ohris is "+order1);
	}
}

class MethodOverriding2{
	public static void main(String args[]){
		Restaurant r = new Ohris();
		r.takeOrder("Starters");
	}
}