//program is a BMI calcualator
import java.util.Scanner;

public class bmi {
  public static void main(String[]args) {
 try  (Scanner input = new Scanner(System.in)){

System.out.println("enter weight");
    double weight = input.nextDouble();  

System.out.println("enter height in feet");
    double feet = input.nextDouble();

System.out.println("enter height in inches");
    double inches = input.nextDouble();     
    double height = feet*12 + inches;//double height = feet + inches  maybe i will use this
    double results = (weight)/Math.pow(height, 2)*703;
System.out.println(results);


   if (results <=18.5)// there has to be a way i can shorten this loop from ten lines
System.out.println("underweight");
  else
if(results <=24.9 &&  results>=18.5)
  System.out.println("healthy weight");//&& means and 
  else
if(results >=25.0  && results <=29.0)
System.out.println("overweight");
   else
if(results >=30);
  else
System.out.println("obesity");  


               
          }
       }

    }
 



  
