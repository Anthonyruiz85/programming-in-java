import java.util.*;


public class App {
   private static Scanner input = new Scanner(System.in);
public static void main(String[]args) throws Exception {

//System.out.println("please enter  the legnth of a side of a Hexagon:");
//double user input = input.nextDouble
double[] sides = new double[] {175.5447, 7.0, 14.0, 27.0, 12.55478};
Hexagon userHexagon = new Hexagon();

     for(double side : sides) {
        if(side>100) {
            continue;
        }

         userHexagon.setSideOfHexagon(side);
         System.out.println(userHexagon.CalculateAreaOfHexagonWithOneSide());
     }

    System.out.println("Thanks for using my shitty ass code");
  }
}
    // Hexagon userHexagon = new Hexagon(7);
//Hexagon userHexagonTwo = new Hexagon(-175.5547);

//System.out.println(userHexagon.CalculateAreaOfHexagonWithOneSide());
//System.out.println(userHexagonTwo.CalculateAreaOfHexagonWithOneSide());