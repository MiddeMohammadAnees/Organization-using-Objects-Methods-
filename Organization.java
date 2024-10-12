/*40.Create a java application where we have a class named "Organization" with Employee details like employee id, name, employee salary, employee designation, employee
   experience and organization name. we also have a static method name employee details() with class variable as parameter and returns Nothing.
   Create instances for 5 employees under main and invoke this method under main method and while invoking according to user choice(i.e switch) the respective employee details should 
   be displayed provide Dynamic inputs and don't use Import Statement.*/

class Organization{
	static java.util.Scanner sc =new java.util.Scanner(System.in);

	int EmpId= sc.nextInt();

	String EmpName=sc.next();
	float EmpSal=sc.nextFloat();
	String EmpDesi=sc.next();
	int EmpExp=sc.nextInt();
	static String EmpOrg= sc.next();

	static void EmpDetails(Organization o){
		System.out.println("The EmpId is:"+o.EmpId);
		System.out.println("The EmpName is:"+o.EmpName);
		System.out.println("The EmpSal is:"+o.EmpSal);
		System.out.println("The EmpDesi is:"+o.EmpDesi);
		System.out.println("The EmpExp is:"+o.EmpExp);
		System.out.println("The EmpOrg is:"+EmpOrg);
	}

	public static void main(String[] args){
		
		Organization o1=new Organization();
		Organization o2=new Organization();
		Organization o3=new Organization();
		Organization o4=new Organization();
		Organization o5=new Organization();
		
		System.out.print("Enter employee number (1-5) to view details: ");
       
		int a=sc.nextInt();
	
		switch(a){

			case 1:
			      EmpDetails(o1);
			break;

			case 2:
			      EmpDetails(o2);
			break;

			case 3:
			      EmpDetails(o3);
			break;

			case 4:
			      EmpDetails(o4);
			break;

			case 5:
			      EmpDetails(o5);
			break;	
			
			default:
				System.out.println("Invalid");
		}
	}
}
		