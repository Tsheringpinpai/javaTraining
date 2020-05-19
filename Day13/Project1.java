import java.io.IOException;

public class Project1{
	public static void main(String args[]) throws Exception{
	
		String empNo[] = {"1001", "1002", "1003", "1004", "1005", "1006", "1007"};
		String empName[] = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
		String joinDate[] = {"01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2007", "1/1/2000", "12/06/2006"};
		char desCode[] = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};
		String dep[] ={"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
		int basic[] = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
		int hra[] = {8000, 12000, 8000, 6000, 20000, 9000, 12000};
		int it[] = {3000, 9000, 1000, 2000, 20000, 4400, 10000};
		
		String value = args[0];
		
		System.out.println("Emp     EmpName Department  Designation   Salary");
		
		char code = '\0';
		int sal = 0;
		
		if(value.equals(empNo[0])){
			System.out.print(empNo[0]+"\t"+empName[0]+"\t"+dep[0]+"\t");
			code = desCode[0];
			sal = basic[0]+hra[0]-it[0];
			
		}else if(value.equals(empNo[1])){
			System.out.print(empNo[1]+"\t"+empName[1]+"\t"+dep[1]+"\t");
			code = desCode[1];
			sal = basic[1]+hra[1]-it[1];
			
		}else if(value.equals(empNo[2])){
			System.out.print(empNo[2]+"\t"+empName[2]+"\t"+dep[2]+"\t");
			code = desCode[2];
			sal = basic[2]+hra[2]-it[2];
			
		}else if(value.equals(empNo[3])){
			System.out.print(empNo[3]+"\t"+empName[3]+"\t"+dep[3]+"\t");
			code = desCode[3];
			sal = basic[3]+hra[3]-it[3];
			
		}else if(value.equals(empNo[4])){
			System.out.print(empNo[4]+"\t"+empName[4]+"\t"+dep[4]+"\t");
			code = desCode[4];
			sal = basic[4]+hra[4]-it[4];
			
		}else if(value.equals(empNo[5])){
			System.out.print(empNo[5]+"\t"+empName[5]+"\t"+dep[5]+"\t");
			code = desCode[5];
			sal = basic[5]+hra[5]-it[5];
			
		}else if(value.equals(empNo[6])){
			System.out.print(empNo[6]+"\t"+empName[6]+"\t"+dep[6]+"\t");
			code = desCode[6];
			sal = basic[6]+hra[6]-it[6];
			
		}else{
			System.out.println("There is no employee with empid: "+value);
		}
		

		String Designation = "";
		int DA = 0;
		
		
		switch(code)
		{
		case 'e':
			Designation="Engineer";
			DA=20000;
			break;
		case 'c':
			Designation="Consultant";
			DA=32000;
			break;
		case 'k':
			Designation="Clerk";
			DA=12000;
			break;
		case 'r':
			Designation="Receptionist";
			DA=15000;
			break;
		case 'm':
			Designation="Manager";
			DA=40000;
			break;
		default:
			System.out.println("");
		}
		System.out.print("\t"+Designation+"\t");
		
		System.out.print(sal+DA);
		
	}
	
}