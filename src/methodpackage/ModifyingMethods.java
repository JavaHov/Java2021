
package methodpackage;

import employee.project.EmployeeProject;
import static employee.project.MenuClass.validateIntInput;
import employee.project.MenuClass;


public class ModifyingMethods {

    public static void updateEmployeeByIndex() {
        boolean loop = true;
        while (loop) {
            PrintMethods.printEmployees();
            System.out.println("What do you want to update?");
            System.out.println("1 Name");
            System.out.println("2 Age");
            System.out.println("3 Gender");
            System.out.println("4 Salary");
            System.out.println("0 Back to main menu...");
            int choice = validateIntInput();
            switch (choice) {
                case 0:
                    loop = false;
                    break;
                case 1:
                    {
                        System.out.println("Enter employee index:");
                        int index = validateIntInput();
                        System.out.println("Enter new employee name:");
                        String newName = MenuClass.scanner.nextLine();
                        for (int i = 0; i < EmployeeProject.list.size(); i++) {
                            if (i == index) {
                                EmployeeProject.list.get(i).setName(newName);
                                break; // --------------------------- för att spara processing...
                            }
                        }
                        break;
                    }
                case 2:
                    {
                        System.out.println("Enter employee index:");
                        int index = validateIntInput();
                        System.out.println("Enter new employee age:");
                        int newAge = validateIntInput();
                        for (int i = 0; i < EmployeeProject.list.size(); i++) {
                            if (i == index) {
                                EmployeeProject.list.get(i).setAge(newAge);
                                break;
                            }
                        }
                    }
                case 3:
                    {
                        System.out.println("Enter employee index: ");
                        int index = validateIntInput() - 1;
                        System.out.println("Enter new gender male/female:");
                        String newGender = MenuClass.scanner.nextLine();
                        for (int i = 0; i < EmployeeProject.list.size(); i++) {
                            if (i == index) {
                                EmployeeProject.list.get(i).setGender(newGender);
                                break;
                            }
                        }
                    }
                case 4:
                    {
                        System.out.println("Enter employee index:");
                        int index = validateIntInput() - 1;
                        System.out.println("Enter new salary");
                        int newSalary = validateIntInput();
                        for (int i = 0; i < EmployeeProject.list.size(); i++) {
                            if (i == index) {
                                EmployeeProject.list.get(i).setSalary(newSalary);
                                break;
                            }
                        }
                    }
                default:
                    System.out.println("Wrong input, try again.");
            }
        }
    }

    public static void removeEmpByIndex() {
        boolean found = false;
        System.out.println("Input employee-index:");
        int index = validateIntInput() - 1;
        for (int i = EmployeeProject.list.size() - 1; i >= 0; i--) {
            if (i == index) {
                EmployeeProject.list.remove(i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Could not find employee with list-index " + index);
        }
    }

    public static void updateEmployee() {
        boolean loop = true;
        while (loop) {
            System.out.println("1 Update employee by index");
            System.out.println("0 Back to previous menu");
            int choice = validateIntInput();
            switch (choice) {
                case 0:
                    loop = false;
                    break;
                case 1:
                    updateEmployeeByIndex();
                    break;
                default:
                    System.out.println("Wrong input, try again");
                    break;
            }
        }
    }

    public static void removeEmployee() {
        boolean loop = true;
        while (loop) {
            System.out.println("1 Remove employee by index");
            System.out.println("0 Back to main menu");
            int choice = validateIntInput();
            switch (choice) {
                case 0:
                    loop = false;
                    break;
                case 1:
                    removeEmpByIndex();
                    break;

                default:
                    System.out.println("Wrong input, try again");
                    break;
            }
        }
    }   
}
