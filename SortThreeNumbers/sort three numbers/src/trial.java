import java.util.Arrays;
import java.util.Scanner;


public class trial{

public static void displaySortedNumbers(double num1, double num2, double num3){
    Scanner scanner = new Scanner(System.in);

int[] Array = new int [3];  
int i=0;

System.out.println("enter three numbers");
for( i=0; i<3; i++){
    Array[i] = scanner.nextInt();
}

Arrays.sort(Array);
    System.out.println(Arrays.toString(Array));
}
public static void main(String[] args) throws Exception {
    displaySortedNumbers(1, 2, 3);
} 
 }