
package methodpackage;

import employeetypes.Employee;
import employee.project.EmployeeProject;
import employeetypes.Programmer;
import employeetypes.Secretary;
import employeetypes.Technician;


public class GenderDistributionMethods {

    public static void totalGenderDistribution() {
        double numWomen = 0;
        int totalPersons = EmployeeProject.list.size();
        for (Employee e : EmployeeProject.list) {
            if (e.getGender().equalsIgnoreCase("female")) {
                numWomen++;
            }
        }
        double sumMen = EmployeeProject.list.size() - numWomen;
        System.out.println("Percentage of women: " + (numWomen / totalPersons) * 100 + "%.");
        System.out.println("Percentage of Men: " + ((sumMen / totalPersons) * 100) + "%.");
    }

    public static void secretaryGenderDistribution() {
        double numSecretWomen = 0;
        double numSecretMen = 0;
        double sumSecretarys = 0;
        for (Employee e : EmployeeProject.list) {
            if (e instanceof Secretary) {
                sumSecretarys++;
                if (e.getGender().equalsIgnoreCase("female")) {
                    numSecretWomen++;
                }
            }
        }
        numSecretMen = sumSecretarys - numSecretWomen;
        System.out.println("Percentage secretary Women: " + ((numSecretWomen / sumSecretarys) * 100) + "%.");
        System.out.println("Percentage secretary Men: " + ((numSecretMen / sumSecretarys) * 100) + "%.");
    }

    public static void programmerGenderDistribution() {
        double numProgramWomen = 0;
        double numProgramMen = 0;
        double sumProgrammers = 0;
        for (Employee e : EmployeeProject.list) {
            if (e instanceof Programmer) {
                sumProgrammers++;
                if (e.getGender().equalsIgnoreCase("female")) {
                    numProgramWomen++;
                }
            }
        }
        numProgramMen = sumProgrammers - numProgramWomen;
        System.out.println("Percentage programmer Women: " + ((numProgramWomen / sumProgrammers) * 100) + "%.");
        System.out.println("Percentage programmer Men: " + ((numProgramMen / sumProgrammers) * 100) + "%.");
    }

    public static void technicianGenderDistribution() {
        double numTechWomen = 0;
        double numTechMen = 0;
        double sumTechnicians = 0;
        for (Employee e : EmployeeProject.list) {
            if (e instanceof Technician) {
                sumTechnicians++;
                if (e.getGender().equalsIgnoreCase("female")) {
                    numTechWomen++;
                }
            }
        }
        numTechMen = sumTechnicians - numTechWomen;
        System.out.println("Percentage Tech Women: " + ((numTechWomen / sumTechnicians) * 100) + "%.");
        System.out.println("Percentage Tech Men: " + ((numTechMen / sumTechnicians) * 100) + "%.");
    }
    
    
    
}
