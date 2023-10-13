import java.util.Scanner;

public class celsiusCalculator {
    public static void main (String[] args) {
        try(Scanner myObj = new Scanner(System.in)){//creates a scanner named myobj
        System.out.println("Enter celsius");
        int celsius = myObj.nextInt();//nextInt() reads the user response as an intger NOTE i also initalized celsius
        
        double faren =celsius + 9.0/5 * celsius + 32;//faren equals farenheit
        System.out.println(celsius + " degrees celisus " +"is equal to " + faren +" fareheit");

     }
  }

}

