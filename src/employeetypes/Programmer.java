
package employeetypes;

import employeetypes.Employee;


public class Programmer extends Employee {
    
    private int programmerBonus = 1000;

    public Programmer(String name, String profession, int age, int salary, String gender) {
        super(name, profession, age, salary, gender);
    }
    
    @Override
    public int getBonus()
    {
        return super.getBonus() + programmerBonus;
    }
    
       @Override
   public String toString()
   {
       return super.toString() + ", Bonus: " + getBonus() + "}";
   }
   
    @Override
    public void getFloor()
    {
        System.out.println("Floor 2");
    }
    
}
