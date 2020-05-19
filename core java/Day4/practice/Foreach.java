public class Foreach{
	public static void main(String args[]){
		int arr[] = new int[3];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		for(int element:arr){
			System.out.println(element);
		}
	}
}