import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) throws Exception {
    Scanner userInput = new Scanner(System.in);
    System.out.printf("enter the number you wish to evaluate: ");
    long num = userInput.nextInt();// stores userInput in num
      
    if (num<0){
    System.out.println("please enter a positive number");
    return;
}
    int results =sumDigits(num);
    System.out.println("the sum of numbers is " + results);

      
      
    }
    
      public static int sumDigits(long n){
   int sumDigits=0;
        while (n>0) {


 int moduleo = (int)(n%10);
sumDigits += moduleo;
n = n/10;
   }
return sumDigits;

}
    }

