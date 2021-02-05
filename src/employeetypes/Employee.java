
package employeetypes;


public class Employee {
    
    private String gender;
    private String name;
    private int age;
    private int salary;
    private int bonus;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    private String profession;

    public Employee(String name, String profession, int age, int salary, String gender) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.profession = profession;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void getFloor()
    {
        System.out.println("...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", age=" + age + ", salary=" + salary + ", profession=" + profession + ", gender=" + gender;
    }
    
    
    
    
    
    
}
