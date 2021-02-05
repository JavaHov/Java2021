
package employeetypes;

import employeetypes.Employee;


public class Technician extends Employee {
    
    private final int tecnicianBonus = 500;

    public Technician(String name, String profession, int age, int salary, String gender) {
        super(name, profession, age, salary, gender);
    }
    
    
    
   @Override
   public int getBonus()
   {
       return super.getBonus() + tecnicianBonus;
   }
    
   @Override
   public String toString()
   {
       return super.toString() + ", Bonus: " + getBonus() + "}";
   }
   
    @Override
    public void getFloor()
    {
        System.out.println("Floor 3");
    }
    
}
