package assignment2;

public class EmployeeDetails {
	public void EmployeeName(String empName, int empId) 
	{
		System.out.println(empName);
		System.out.println(empId);
		}
		public void getEmployeeAddress(String empAddress)
		{
		
			System.out.println(empAddress);
		}
		public void EmployeeSalary(double empSalary)
		{
			
			System.out.println(empSalary);
		}
		public void EmployeeMobileNumber(long mobileNum)
		{
			System.out.println(mobileNum);
		}
		
public static void main(String[] args) 
		{
			EmployeeDetails emp=new EmployeeDetails();
			emp.EmployeeName("Ashok", 577);
		    emp.getEmployeeAddress("Tirupattur");
			emp.EmployeeSalary(10.00);
			emp.EmployeeMobileNumber(7806946483L);

		}
        }
         

