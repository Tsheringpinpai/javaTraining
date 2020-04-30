class Car{
	int carid;
	String model;
	static String dealer_address;
}

class VariableDemo{
	public static void main(String args[]){
		Car bmw = new Car();
		bmw.carid = 11;
		bmw.model = "a3series";
		Car.dealer_address = "Commerce";
		System.out.println(bmw.carid);
		System.out.println(bmw.model);
		System.out.println(Car.dealer_address);
	}
}