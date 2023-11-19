import java.util.Arrays;
import java.util.Scanner;


public class test{
public static void main(String[] args) throws Exception {
    int size =3;
    int userInput=0;
   Scanner scanner = new Scanner(System.in);


   int[] Array = new int [3];/*  arrays need to be intailzed with ints so

switch userInput into an int*/
int i=0;

System.out.println("enter three numbers");
for( i=0; i<3; i++){
    //userInput =scanner.nextInt();
    Array[i] = scanner.nextInt();

}
//Array[] =userInput
//Arrays.sort(Array, Collections.);
Arrays.sort(Array);
System.out.println(Arrays.toString(Array));





//System.out.print(Array[userInput]);
//System.out.print(Array[i]);
 }
}