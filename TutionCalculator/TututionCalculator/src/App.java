import java.util.Scanner;
public class App {
    public static void main(String[] args){
      try (Scanner userInput = new Scanner(System.in)) {
        
        double YEARLYINCREASE = 0.05;//constant 
        double firstYear =10000;//cost for one year tutuion
        double yearsAfter;//
       
       
        System.out.println("enter how many year you want to know the tution cost for");
          int year = userInput.nextInt();
          double yearlyTution =10000*year*YEARLYINCREASE+(10000*year);
       
        System.out.println("input how many more  years do you want after the previous answer");
       yearsAfter = userInput.nextDouble();
      double tututionAfterYears = 10000*yearsAfter*YEARLYINCREASE+(10000*yearsAfter); 
      double sum = tututionAfterYears + yearlyTution;
  if (year==1 ){
    System.out.println(firstYear);
  /* }if (year ==0){
   System.out.println("please enter a number that is not zero");
   }
  */}else{
 System.out.printf( year + " years of tution costs:"+ yearlyTution);
  }
   
  System.out.println(" if you add "+ yearsAfter + " more the tution cost is is "+sum);
      }
     
    }
}



       