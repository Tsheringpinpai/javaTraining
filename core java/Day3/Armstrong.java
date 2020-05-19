public class Armstrong{
public static void main(String[] args){
	int n = 370;
	int temp = n;
	int rem, sum=0;
	
	while(n>0){
		rem=n%10;
		n=n/10;
		sum = sum + (rem*rem*rem);
	}
	
	if(temp == sum)
	{
		System.out.println("Number is an armstrong " + sum);
	}
	else
	{
		System.out.println("Number is not an armstrong " + sum);
	}
}
} 
