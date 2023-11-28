import java.util.Scanner;
import java.util.Arrays;

public class test {
public static void main(String[] args) {
final int SIZE =3; 
    Scanner scan = new Scanner(System.in);

double[] arrays = new double[SIZE];
double[] avg = new double[1];
int i,j=0;
double sum;
System.out.println("enter 3 numbers");

for(i=0; i<SIZE; i++){
arrays[i] =scan.nextDouble();
j=0;
avg[j] =avg[j] + arrays[i];
/**avg[j] =avg[j]/2; fixed it problem was i was dividing avg in 
 * loop  and not outside of it REFER to line 22 to see change
**/}
avg[j] =avg[j]/SIZE;
System.out.println(Arrays.toString(arrays));
System.out.println(Arrays.toString(avg));
System.out.println(avg[j]);
//System.out.println(arrays[i]);

}
}
