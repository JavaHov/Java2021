
package methodpackage;

import employeetypes.Employee;
import employee.project.EmployeeProject;
import employeetypes.Programmer;
import employeetypes.Secretary;
import employeetypes.Technician;


public class PrintMethods {

    public static void printProgrammerBonus() {
        int programBonus = 0;
        for (Employee e : EmployeeProject.list) {
            if (e instanceof Programmer) {
                programBonus = e.getBonus();
                break;
            }
        }
        System.out.println("Programmer bonus: " + programBonus);
    }

    public static void printTechBonus() {
        int techBonus = 0;
        for (Employee e : EmployeeProject.list) {
            if (e instanceof Technician) {
                techBonus = e.getBonus();
                break;
            }
        }
        System.out.println("Technician bonus: " + techBonus);
    }

    public static void printEmployees() {
        int counter = 1;
        for (Employee e : EmployeeProject.list) {
            System.out.println("[" + counter + "] " + e);
            counter++;
        }
    }

    public static void printSecretaryBonus() {
        int secretBonus = 0;
        for (Employee e : EmployeeProject.list) {
            if (e instanceof Secretary) {
                secretBonus = e.getBonus();
                break;
            }
        }
        System.out.println("Secretary bonus: " + secretBonus);
    }
    
    
    
}
