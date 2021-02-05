package employee.project;

import methodpackage.PrintMethods;
import methodpackage.GenderDistributionMethods;
import methodpackage.ModifyingMethods;
import methodpackage.SalaryMethods;
import java.util.Scanner;
import java.util.InputMismatchException;

public class MenuClass {

    public static Scanner scanner = new Scanner(System.in);

    public static int menu() {

        System.out.println("Make a choice:");
        System.out.println("------------------------");

        System.out.println("1 Add employee");
        System.out.println("2 Remove employee");
        System.out.println("3 Update employee information");
        System.out.println("4 Print employees");
        System.out.println("5 Statistics");
        System.out.println("0 Exit");
        System.out.println("--------------------------");

        int choice = validateIntInput();
        return choice;

    }

    public static void switchChoice(int choice) {
        switch (choice) {
            case 0:
                System.exit(0);
                break;
            case 1:
                AddMethods.addEmployee();
                break;
            case 2:
                ModifyingMethods.removeEmployee();
                break;
            case 3:
                ModifyingMethods.updateEmployee();
                break;
            case 4:
                PrintMethods.printEmployees();
                break;
            case 5:
                statEmployees();
                break;
            default:
                System.out.println("Wrong input, try again");
        }

    }

    public static void statEmployees() {
        boolean loop = true;
        while (loop) {

            System.out.println("1. Average salary");
            System.out.println("2. Gender distribution");
            System.out.println("3. Bonus payment menu");
            System.out.println("4. Highest salary");
            System.out.println("5. Lowest salary");
            System.out.println("0. Main menu");

            int choice = validateIntInput();

            switch (choice) {
                case 0:
                    loop = false;
                    break;
                case 1:
                    averageSalaryMenu();
                    break;
                case 2:
                    genderDistributionMenu();
                    break;
                case 3:
                    bonusPaymentMenu();
                    break;
                case 4:
                    SalaryMethods.highestSalary();
                    break;
                case 5:
                    SalaryMethods.lowestSalary();
                    break;
                default:
                    System.out.println("Wrong input, try again...");
                    break;
            }

        }
    }

    public static void bonusPaymentMenu() {
        boolean loop = true;

        while (loop) {
            PrintMethods.printEmployees();
            System.out.println("1 Bonus for technician");
            System.out.println("2 Bonus for programmers");
            System.out.println("3 Bonus for secretarys");
            System.out.println("0 Back to statistics...");

            int choice = validateIntInput();

            switch (choice) {
                case 0:
                    loop = false;
                    break;
                case 1:
                    PrintMethods.printTechBonus();
                    break;
                case 2:
                    PrintMethods.printProgrammerBonus();
                    break;
                case 3:
                    PrintMethods.printSecretaryBonus();
                    break;
                default:
                    System.out.println("Wrong input, try again");
                    break;
            }
        }
    }

    public static void genderDistributionMenu() {
        boolean loop = true;

        while (loop) {
            System.out.println("1 Gender distribution for all employees");
            System.out.println("2 Gender distribution for technicians");
            System.out.println("3 Gender distribution for programmers");
            System.out.println("4 Gender distribution for secretarys");
            System.out.println("0 Back to statistics...");

            int choice = validateIntInput();

            switch (choice) {
                case 0:
                    loop = false;
                    break;
                case 1:
                    GenderDistributionMethods.totalGenderDistribution();
                    break;
                case 2:
                    GenderDistributionMethods.technicianGenderDistribution();
                    break;
                case 3:
                    GenderDistributionMethods.programmerGenderDistribution();
                    break;
                case 4:
                    GenderDistributionMethods.secretaryGenderDistribution();
                    break;
                default:
                    System.out.println("Wrong input, try again");
            }
        }
    }

    public static void averageSalaryMenu() {
        boolean loop = true;
        while (loop) {
            System.out.println("1. Average salary all employees");
            System.out.println("2. Average salary technicians");
            System.out.println("3. Average salary programmers");
            System.out.println("4. Average salary secretarys");
            System.out.println("0. Back to statistics...");
            int choice = validateIntInput();
            switch (choice) {
                case 0:
                    loop = false;
                    break;
                case 1:
                    SalaryMethods.averageSalaryAll();
                    break;
                case 2:
                    SalaryMethods.averageSalaryTechnicians();
                    break;
                case 3:
                    SalaryMethods.averageSalaryProgrammers();
                    break;
                case 4:
                    SalaryMethods.averageSalarySecretarys();
                    break;
                default:
                    System.out.println("Wrong input, try again.");
                    break;
            }
        }
    }
    
    public static int validateIntInput() {
        boolean loop = true;
        int choice = -1;

        while (loop) {
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
                loop = false;
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Only use integers for input!");
            }
        }
        return choice;
    }

}
