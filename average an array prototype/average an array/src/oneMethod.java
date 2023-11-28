import java.util.Arrays;
import java.util.Scanner;
public class oneMethod {
    final int SIZE =3;

public static int(int[]array){
int  avg=0; 
int[] array = new int [SIZE];
    for(int i :SIZE){
        avg +=array[i];
        if(i>3)
        avg=avg/SIZE;
        System.out.println(avg);
       
    }
return avg;
}

public static void main(String[] args) throws Exception {
double numbers;
    Scanner scan = new Scanner(System.in);
    System.out.println("enter 10 doubles");
   numbers=scan.nextDouble;


}
}
