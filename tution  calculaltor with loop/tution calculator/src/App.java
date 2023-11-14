import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
   
   int i, year;
  double tution;   
        
        
        System.out.println("enter years you wish to calculate");// no userinput
        //(tution cost in 10 years will be)(tution cost 4 years later will be)
        
   System.out.println("enter ");
    for(year =0; year<=10; year++){
      //i have to multiply tution by 10000 for every year
      // i have to muliply tution by intrest      
      tution= year *10000+(year*10000 *0.05);
      /*if (year ==1 ){}
       tution =10000;
         make it so that the first year is 10k*/
    }
      
      // have to display tutionCost for how many years user inputs
      
      System.out.println(tution);      
    }
    
     
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    }

