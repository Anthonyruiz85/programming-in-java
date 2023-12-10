import java.util.Arrays;
import java.util.Scanner;

public class App {
    //final int SIZE =3;
public static int average(int[]array){
  
    
  
int  avg=0; 

int sum=0;
    
//int[] array = new int [SIZE];
    System.out.println("enter 10 double values");
for(int value : array){
     sum+=value;
    
        
     
    }
    return avg/array.length;
}

public static double average(double[] array){
double sum=0;
    for(double value : array){/*array is from  the method signature (double[] array) 
        value is the userInputted elements in the array

        while the array holds numbers, the numbers will be added and the final product
         will be stored in  the variable sum*/
    sum += value;
}

return sum / array.length;


}


public static void main(String[] args) throws Exception {
final int SIZE =10;
double[] doubleArray = new double[SIZE];
Scanner scan = new Scanner(System.in);

System.out.println("enter 10 double values");
for(int i=0;i<SIZE; i++){
   doubleArray[i]=scan.nextDouble(); 
}
//loop gets and stores 10 values in a array named doubleArray
double averageSum = average(doubleArray);
/* 1. the word average calls the average method()
   2. the userInput stored in doubleArray is put through the average method 
and final results are stored in averageSum.

*/System.out.println("average of your double values is:"+ averageSum);

    }

}

