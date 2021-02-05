
package methodpackage;

import employeetypes.Employee;
import employee.project.EmployeeProject;
import employeetypes.Programmer;
import employeetypes.Secretary;
import employeetypes.Technician;


public class SalaryMethods {

    public static void averageSalarySecretarys() {
        double sum = 0;
        int numSecretarys = 0;
        for (Employee e : EmployeeProject.list) {
            if (e instanceof Secretary) {
                sum += e.getSalary();
                numSecretarys++;
            }
        }
        System.out.println("Av. salary programmers: " + (sum / numSecretarys));
    }

    public static void averageSalaryProgrammers() {
        double sum = 0;
        int numProgrammers = 0;
        for (Employee e : EmployeeProject.list) {
            if (e instanceof Programmer) {
                sum += e.getSalary();
                numProgrammers++;
            }
        }
        System.out.println("Av. salary programmers: " + (sum / numProgrammers));
    }

    public static void averageSalaryTechnicians() {
        double sum = 0;
        int numTechnicians = 0;
        for (Employee e : EmployeeProject.list) {
            if (e instanceof Technician) {
                sum += e.getSalary();
                numTechnicians++;
            }
        }
        System.out.println("Av. salary technicians: " + (sum / numTechnicians));
    }

    public static void averageSalaryAll() {
        double sum = 0;
        for (int i = 0; i < EmployeeProject.list.size(); i++) {
            sum += EmployeeProject.list.get(i).getSalary();
        }
        System.out.println("Average salary all: " + (sum / EmployeeProject.list.size()));
    }


    public static void highestSalary() {
        int highestIndex = 0;
        for (int i = 0; i < EmployeeProject.list.size(); i++) {
            if (EmployeeProject.list.get(i).getSalary() > EmployeeProject.list.get(highestIndex).getSalary()) {
                highestIndex = i;
            }
        }
        System.out.println("Highest salary: " + EmployeeProject.list.get(highestIndex));
    }

    public static void lowestSalary() {
        int lowestIndex = 0;
        for (int i = 0; i < EmployeeProject.list.size(); i++) {
            if (EmployeeProject.list.get(i).getSalary() < EmployeeProject.list.get(lowestIndex).getSalary()) {
                lowestIndex = i;
            }
        }
        System.out.println("Lowest salary: " + EmployeeProject.list.get(lowestIndex));
    }
    
    
    
}
