import java.util.*;
class Employee2{
static int count=0;
	
	public static void main(String[] args){
	int i;
	int j;

        Scanner sc=new Scanner(System.in);
	
	
	      for (i=1;i<5;i++)
                {
		 
	count++;
	System.out.println("-------------------------------------");	

	System.out.println("Enter your firstname  :");
        String firstName=sc.next();
	
	System.out.println("Enter your lastname   :");
        String lastName=sc.next();

        System.out.println("Enter your salary     :");
        int salary=sc.nextInt();

	System.out.println("Enter your grade      :");
        char grade=sc.next().charAt(0);

	Scanner sc=new Scanner(System.in);
      System.out.println("enter date");
      int dd = sc.nextInt();
      System.out.println("enter month");
      int mm = sc.nextInt();
      System.out.println("enter year");
      int yyyy = sc.nextInt();
	 Emp e = null; 
         e = new Emp(firstName, lastName, salary, grade, doj);
      
       e.displayDetails();
       e.getInvoices();
       
	