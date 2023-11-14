// the purpose of the program is to display the cost of tutuion in 10 years and in 14 years

public class tuitionMethod {
    public static void tuitionCalculator() {//start of method
    int year;
  double tuition;   

  System.out.println("in 10 years the tution cost will be");
        
for(year =0; year<=14; year++){
  tuition = year*10000+(year *10000*0.05);
      
if(year== 10)//gives me the value of the tenth year
  System.out.println(tuition );// prints the value of tenth year NOTE very inefficent 
if(year ==14)
  System.out.println("the tution cost in 14 years wil be " +tuition);//print value of fourteenth year NOTE very inefficant
 }
}
public static void main(String[] args) {
   tuitionCalculator(); // method tutuionCalulator will not work if method isent called into main
    }
}
