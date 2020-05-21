class ThreadNamming extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String args[]){
		System.out.println(Thread.currentThread().getName());
		ThreadNamming tn = new ThreadNamming();
		ThreadNamming tm = new ThreadNamming();
		
		tn.setName("First-Thread");
		tm.setName("Second-Thread");
		
		tn.setPriority(Thread.MIN_PRIORITY);
		tm.setPriority(Thread.MAX_PRIORITY);
		
		tm.start();
		tn.start();
		
	}
}