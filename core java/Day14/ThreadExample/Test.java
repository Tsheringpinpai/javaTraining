class Test extends Thread{
	public void show(){
		for(int i=1;i<=20;i++){
			System.out.println("i = "+i);
		}
	}

	public static void main(String args[]){
		Test t = new Test();
		t.start();
		for(int x=1; x<=20; x++){
			System.out.println("x = "+x);
		}
	}

}