import java.util.*;


public class app {
   private static Scanner input = new Scanner(System.in);

public static void main(String[]args) throws Exception {

System.out.println("please enter  the legnth of a side of a Hexagon:");
//double user input = input.nextDouble

Hexagon userHexagon = new Hexagon(SideOfHexagon);
Hexagon userHexagonTwo = new Hexagon(-175.5547);

System.out.println(userHexagon.CalculateAreaOfHexagonWithOneSide());
System.out.println(userHexagonTwo.CalculateAreaOfHexagonWithOneSide());
 }

}
