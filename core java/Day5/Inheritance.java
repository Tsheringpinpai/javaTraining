class Vehicle{
	void start(){
		System.out.println("Start the car");
	}
	void stop(){
		System.out.println("Stop the car");
	}

}

class Car extends Vehicle{
	
	void tire(){
		System.out.println("Four tires and a spare tire");
	}

}

class Audi extends Car{
	
	void selfDriving(){
		System.out.println("Self driving feature");
	}


	public static void main(String args[]){
		Audi a1 = new Audi();
		a1.start();
		a1.stop();
		a1.tire();
		a1.selfDriving();
		}
}