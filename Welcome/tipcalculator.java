 import java.util.Scanner;
   
 public class tipcalculator {
     public static void main(String [] args) {
    try (Scanner myObj = new Scanner(System.in)) {
        System.out.println("enter amount paid");
         double amountPaid =myObj.nextDouble();
   System.out.println("enter the percentage you would like to tip example 10");

       
        double tipRate = myObj.nextDouble();
        double tipAmount = tipRate *amountPaid/100;
        double totalAmount = tipAmount + amountPaid;
       
        System.out.println("you paid: " + amountPaid + " and wish to  tip:"+ tipRate +" percent");
        System.out.println("which equals: "+tipAmount + " so your total will come out to:"+ totalAmount );
        
   
    }  
    
  }
}











