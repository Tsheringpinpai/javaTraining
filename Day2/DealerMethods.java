class Dealer{
	void list(){
		System.out.println("1.Honda 2.Audi 3.Toyota");
	}
	void order(String brand){
		System.out.println("Order confirmation "+brand);
	}
	String giveKey(){
		return "Wireless Key";
	}
	String payAmount(int cash){
		System.out.println("Cash receieved "+cash);
		return "Bill cleared";
	}
}
class Buyuer{
	public static void main(String args[]){
		Dealer Commerce = new Dealer();
		Commerce.list();
		Commerce.order("Toyota");
		String myKey = Commerce.giveKey();
		System.out.println(myKey);
		System.out.println("Bill paid: "+Commerce.payAmount(35000));
		
	}
}