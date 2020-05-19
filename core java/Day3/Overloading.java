class Cashier{

	void items(){

		System.out.println("1.Cigrattee 2.Beer 3. lottery");

	}

	void order(int number1, int number2){

		System.out.println("Item needed: "+ number1 +" "+ number2);

	}
	
	void order(int number1){
		System.out.println("Item needed: "+number1);
	}
	
	void order(int number1, int number2, int number3){
		System.out.println("Item needed: "+number1 +" "+number2+" "+number3);
	}

	String itemsGiven(){

		return "Item ordered and free cup of ice";

	}

	String payment(float cashCard){

		System.out.println("Amount given: "+cashCard);

		return "Amount received";

	}

}



class Shopper{

public static void main(String args[]){

	Cashier jd = new Cashier();

	jd.items();

	jd.order(1, 2, 3);

	System.out.println(jd.itemsGiven());

	System.out.println("Payment: "+jd.payment(26.99f));

	

 }

}