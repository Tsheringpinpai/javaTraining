class Customer{
	int amount=1000;
	synchronized void withdraw(int amount){
	System.out.println("Going to withdraw");
		if(this.amount<amount){
		System.out.println("Less balance, waiting for deposit");
			try{
				wait();
			}catch(Exception e){
				e.printStackTrace();
			}
			this.amount=this.amount-amount;
			System.out.println("Withdraw Completed");
		}
	}
	
	synchronized void deposit(int amount){
		System.out.println("Going to deposit");
		this.amount = this.amount + amount;
		System.out.println("Going back to wait");
		notify();
	}
}

class OneThread extends Thread{
	Customer c;
	OneThread(Customer c){
		this.c = c;
	}
	public void run(){
		c.withdraw(12000);
	}
}

class SecondThread extends Thread{
	Customer c;
	SecondThread(Customer c){
		this.c=c;
	}
	public void run(){
		c.deposit(5000);
	}
}

class InterThread{
	public static void main(String args[]){
		Customer c = new Customer();
		OneThread ot = new OneThread(c);
		SecondThread st = new SecondThread(c);
		ot.start();
		st.start();
	}
}