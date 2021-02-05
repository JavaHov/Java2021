
package employee.project;

import employeetypes.Technician;
import employeetypes.Secretary;
import employeetypes.Programmer;
import employeetypes.Employee;
import static employee.project.MenuClass.validateIntInput;


public class AddMethods {

    public static void addSecretary() {
        System.out.println("Name of the employee: ");
        String empName = EmployeeProject.sc.nextLine();
        
        System.out.println("Age of the employee: ");
        int empAge = validateIntInput();
        
        System.out.println("Salary of the employee: ");
        int empSalary = validateIntInput();
        
        System.out.println("Gender of employee male/female: ");
        String gender = EmployeeProject.sc.nextLine();
        
        Employee t3 = new Secretary(empName, "Secretary", empAge, empSalary, gender);
        EmployeeProject.list.add(t3);
    }

    public static void addProgrammer() {
        System.out.println("Name of the employee: ");
        String empName = EmployeeProject.sc.nextLine();
        
        System.out.println("Age of the employee: ");
        int empAge = validateIntInput();
        
        System.out.println("Salary of the employee: ");
        int empSalary = validateIntInput();
        
        System.out.println("Gender of employee male/female: ");
        String gender = EmployeeProject.sc.nextLine();
        
        Employee t2 = new Programmer(empName, "Programmer", empAge, empSalary, gender);
        EmployeeProject.list.add(t2);
    }

    public static void addEmployee() {
        boolean loop = true;
        while (loop) {
            System.out.println("Which type of employee would you like to add?");
            System.out.println("1. Technician");
            System.out.println("2. Programmer");
            System.out.println("3. Secretary");
            System.out.println("0. Back to main menu...");
            int empChoice = validateIntInput();
            
            if (empChoice == 1) {
                addTechnician();
            }
            if (empChoice == 2) {
                addProgrammer();
            }
            if (empChoice == 3) {
                addSecretary();
            }
            if (empChoice == 0) {
                loop = false;
            }
        }
    }

    public static void addTechnician() {
        System.out.println("Name of the employee: ");
        String empName = EmployeeProject.sc.nextLine();
        
        System.out.println("Age of the employee: ");
        int empAge = validateIntInput();
        
        System.out.println("Salary of the employee: ");
        int empSalary = validateIntInput();
        
        System.out.println("Gender of employee male/female: ");
        String gender = EmployeeProject.sc.nextLine();
        
        Employee t1 = new Technician(empName, "Technician", empAge, empSalary, gender);
        EmployeeProject.list.add(t1);
    }
    
    
    
    
}
