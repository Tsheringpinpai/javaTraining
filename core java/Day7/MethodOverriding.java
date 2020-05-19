abstract class Car{
	abstract void cost();
	abstract void milage();
	void start(){
		System.out.println("Starts with a key");
	}
}

class Audi extends Car{
	void cost(){
		System.out.println("Audi cost is 80lakhs");
	}
	void milage(){
		System.out.println("Audi milage is 15km");
	}
}	

class Bmw extends Car{
	void cost(){
		System.out.println("Bmw cost is 2cr");
	}
	void milage(){
		System.out.println("Bmw milage is 10km");
	}
}

class MethodOverriding{
	public static void main(String args[]){
		Car x;
		
		x = new Audi();
		x.start();
		x.cost();
		x.milage();
		
		x = new Bmw();
		x.start();
		x.cost();
		x.milage();
	}
}