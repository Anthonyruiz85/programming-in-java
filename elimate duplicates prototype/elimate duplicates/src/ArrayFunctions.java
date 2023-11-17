//import java.util.Scanner;
import java.util.Arrays;

public class ArrayFunctions {
    
    

protected  int[] elimnateDuplicates(int[] list){
int[] distinct = new int[list.length];
for(int i =0; i< list.length; i++){
    boolean dupe =false;

    for(int j =0; j<list.length;j++){
    if (list[i] ==distinct[j]){
        dupe =true;
        break;


    }
    }
if(dupe){
    continue;
}

distinct[i] = list[i];

}
return Arrays.stream(distinct).filter(num-> num != 0).toArray();

  }
}




