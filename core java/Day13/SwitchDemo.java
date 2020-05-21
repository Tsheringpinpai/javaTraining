import java.util.Scanner;

class SwitchDemo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter choice (1/2/3)");
		int choice = sc.nextInt();
		switch(choice){
			case 1:
				System.out.println("1. C language");
				break;
			case 2:
				System.out.println("2. Java language");
				break;
			case 3:
				System.out.println("3. Oracle langauge");
				break;
			default:
				System.out.println("wrong choice");
			
		
		}
	}

}