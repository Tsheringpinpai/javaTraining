class Toyota{
	public Toyota(){
		System.out.println("Toyota: Realiable brand");
	}
	public Toyota(int year){
		System.out.println("Toyota Year: " + year);
	}
}

class Corolla extends Toyota{
	public Corolla(){
		super();
		System.out.println("Corolla: Economy and Realiable car");
	}
	public Corolla(int year){
		super(year);
		System.out.println("Corolla year: "+year);
	}
}

public class SuperDemo{
	public static void main(String args[]){
	
		Corolla corolla = new Corolla(2020);
	
	}
}