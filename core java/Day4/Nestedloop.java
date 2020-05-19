public class Nestedloop{
	
	public static void main(String args[]){
		int k =1;
		for(int i=1; i<=5; i++){
			for(int j=i; j<=5; j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}