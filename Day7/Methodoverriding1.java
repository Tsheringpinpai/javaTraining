abstract class Animal{
	abstract void lifespan();
	abstract void skills();
	void breath(){
		System.out.println("All animals has to breath");
	}

}

class Dog extends Animal{
	void lifespan(){
		System.out.println("Lifespan: 10-16 years");
	}
	
	void skills(){
		System.out.println("Skills: Dog brains react to human voices");
	}

}

class Cat extends Animal{
	void lifespan(){
		System.out.println("Lifespan: 2-16 years");
	}
	
	void skills(){
		System.out.println("Skills: Cat have extra ordinary hearings");
	}

}

public class Methodoverriding1{
	public static void main(String args[]){
		
		Animal m;
		
		m = new Dog();
		m.breath();
		m.lifespan();
		m.skills();
		
		m = new Cat();
		m.breath();
		m.lifespan();
		m.skills();
	}
}