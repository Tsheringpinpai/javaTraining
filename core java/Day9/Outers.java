public class Outers{

	void f1(){
		System.out.println("inside Outer f1()");
	
		class Inner{
			void f2(){
				System.out.println("inside f1() and inside Inner class");
			}
			}
		Inner inner = new Inner();
		inner.f2();
		}

	public static void main(String args[]){
	
		Outers outers = new Outers();
		outers.f1();
	
	}
}