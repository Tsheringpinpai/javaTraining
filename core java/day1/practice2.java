class Company{
	int id;
	String name;
	static int company_id;
}

class EmployeeList {
	public static void main(String args[]){
		Company apple = new Company();
		apple.id = 10;
		apple.name = "Tim cook";
		Company.company_id = 101;
		System.out.println(apple.id);
		System.out.println(apple.name);
		System.out.println(Company.company_id);
	}
}