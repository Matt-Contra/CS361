/**
 * 
 */
package employee;

/**
 * @author Matthew Contrabasso
 *
 */

// Resource: https://www.baeldung.com/java-type-casting

// Complete the provided code

public class DemoEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee emp1 = new Employee("John", "Smith", "123456790");

		PartTimeEmployee pEmp1 = new PartTimeEmployee("Jane", "Smith", "123456777", 17.5);

//		Employee emp2 = new Employee("Don", "Holmes", "123456799");

//		PartTimeEmployee pEmp2 = new PartTimeEmployee("Melissa", "Will", "123456666", 23.5);

		// Upcasting
		Employee emp3 = pEmp1;
		System.out.println("emp3");
		emp3.whoAmI();
		// TODO To complete
		// emp3.whoAmI() // prints ... because ...
		
		/*
		 * emp3.whoAmI prints a part time Employee because of shallow cloning occurring from pEmp1
		 * to emp3. 
		 */
		
		// emp3.getHourlyRate(); // returns syntax error because ...
		
		/*
		 * emp3.getHourlyRate() returns a syntax error because the  object that was declared
		 * was an Employee object, NOT a PartTimeEmployee object. 
		 */

		// TODO To complete
		// Add the condition that test that emp3 is an instance of part time employee at
		// this time
	
		if (emp3 instanceof PartTimeEmployee) {
		System.out.println("emp3 instance of part time employee"); // printed
		} else {
		System.out.println("emp3 not instance of part time employee");
		}

		// Downcasting 1
		// TODO Uncomment and run the code
		//PartTimeEmployee pEmp3 = (PartTimeEmployee) emp1;
		
		//I re-commented the above code so I could run downcasting2 segment
		
		// TODO To complete
		// This instruction compiles / does not compile
		/*
		 * This instruction does compile (but fails at execution)
		 */
		
		// This instruction returns a ClassCastException at run time
		// because ...
		
		/*
		 * This instruction returns a ClassCastException at run time because you cannot turn an 
		 * employee into a part time employee; a part time employee is an employee, but an employee
		 * is not a part time employee.  
		 */
		
		// Downcasting 2
		// Requires the use of intanceof to avoid a run time cast exception
		// TODO Look at the solution below
		if (emp3 instanceof PartTimeEmployee) {
			System.out.println("emp3 instance of part time employee"); // printed
			PartTimeEmployee pEmp4 = (PartTimeEmployee) emp3; // cast required
			System.out.println(pEmp4.getHourlyRate());
		} else {
			System.out.println("emp3 not instance of part time employee");
		}
	}
}
