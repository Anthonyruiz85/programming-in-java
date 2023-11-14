public class tututionTest {
    public static void tutionCalculator2() {//start of method
    int  year, size =14;
  double tution, temp=0, intrest;   
  double [] years = new double[size];
  int []   testYears = new int[size];     
        
  System.out.println("in 10 years the tution cost will be");
   
    for( int i =0; i<=years[size]; i++){
      //i have to multiply tution by 10000 for every year
      // i have to muliply tution by intrest      
     intrest =years[i]*10000*0.05;
      tution= years[i] *10000+ intrest;
      
      //temp =tution+temp;

    
System.out.println(years[i]);
   }
  }

public static void main(String args[]) {
tutionCalculator2();
}
}