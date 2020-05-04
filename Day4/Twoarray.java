public class Twoarray{
	public static void main(String args[]){
		int firstArray[][] = {{0, 1, 2, 5},{8, 90, 11, 12}};
		Display(firstArray);
		}
	public static void Display(int x[][]){
		for(int row=0;row<x.length;row++){
			for(int column=0; column<x[row].length;column++){
				System.out.print(x[row][column]+"\t");
			}
			System.out.println();
		}
	}
	}
