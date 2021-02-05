
package employeetypes;

import employeetypes.Employee;


public class Secretary extends Employee {

    private int secretaryBonus = 250;
    
    public Secretary(String name, String profession, int age, int salary, String gender) {
        super(name, profession, age, salary, gender);
    }
    
    
    @Override
    public int getBonus()
    {
        return super.getBonus() + secretaryBonus;
    }
    
       @Override
   public String toString()
   {
       return super.toString() + ", Bonus: " + getBonus() + "}";
   }
   
   
    @Override
    public void getFloor()
    {
        System.out.println("Floor 1");
    }
    
}
