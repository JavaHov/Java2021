package employee.project;
import employeetypes.Technician;
import employeetypes.Secretary;
import employeetypes.Programmer;
import employeetypes.Employee;
import static employee.project.MenuClass.menu;
import static employee.project.MenuClass.switchChoice;
import java.util.ArrayList;
import java.util.Scanner;

 

public class EmployeeProject {

 

    public static ArrayList<Employee> list = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static boolean loop = true;

 

    public static void main(String[] args) {

        fillList();
        boolean loop = true;
        while(loop)
        {
            switchChoice(menu());
        }

 

    }
    
    public static void fillList()
    {
        //(String name, String profession, int age, int salary, String gender
        Technician t1 = new Technician("Anders", "Technician", 43, 35000, "Male");
        Technician t2 = new Technician("Anna", "Technician", 26, 34000, "Female");
        Technician t3 = new Technician("Stig", "Technician", 32, 35000, "Male");
        Technician t4 = new Technician("Sonja", "Technician", 62, 33000, "Female");
        Technician t5 = new Technician("Peter", "Technician", 45, 33500, "Male");
        Programmer p1 = new Programmer("James", "Programmer", 24, 45000, "Male");
        Programmer p2 = new Programmer("Karin", "Programmer", 31, 44000, "Female");
        Programmer p3 = new Programmer("Josef", "Programmer", 29, 46300, "Male");
        Programmer p4 = new Programmer("Bita", "Programmer", 40, 42900, "Female");
        Programmer p5 = new Programmer("Titti", "Programmer", 28, 44700, "Female");
        Secretary s1 = new Secretary("Sonja", "Secretary", 34, 34000, "Female");
        Secretary s2 = new Secretary("Ola", "Secretary", 52, 34500, "Male");
        Secretary s3 = new Secretary("Marit", "Secretary", 64, 36000, "Female");
        Secretary s4 = new Secretary("Kalle", "Secretary", 26, 33000, "Male");
        Secretary s5 = new Secretary("Alex", "Secretary", 23, 32900, "Female");
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        list.add(t5);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
    }
}
