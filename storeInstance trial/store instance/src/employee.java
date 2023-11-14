//import javax.accessibility.AccessibleRole;

public class employee {
    // private Variables
    public String name, uniformColor, workingHours; 
    public double hourlyPay; 
    
    
    public employee(String employeeName ,String employeeUniformColor, int employeeHourlyPay, String employeeWorkingHours){
     name = employeeName;
    uniformColor =employeeUniformColor;
     hourlyPay = employeeHourlyPay;
    workingHours =employeeWorkingHours;
  }
      public static void main (String[]args) {
        employee margret = new employee("Margret Jessica","red and white",10, "nine to five");
System.out.printf(margret.name + " is working " + margret.workingHours );
      employee justin = new employee("Justin Chang", "red and white", 10, "five to nine");
       // Accessor
       
    }
      public class String {
      }
    }