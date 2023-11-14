import java.util.Scanner;

public class vowelOrConstant {
    public static void main(String [] args){
   try (Scanner userInput = new Scanner(System.in)) {//Scanner named userInput
System.out.println("input a letter to see if its a vowel or constant:");


char input = userInput.findInLine(".").charAt(0);/*  this line allows user char input  
 to be stored in the input variable   */
 if (input == 'a' || input == 'e' || input == 'i' || input == 'o' ||/* if statements check if user inputs 
 vowel  */
 input == 'u'||  input == 'y')
        System.out.println("you inputted a vowel");
 else // else statement prints statement below if you dont input a vowel
    
    if (input == 'B' || input == 'C' || input =='D' ||input =='F' ||input =='G' ||input =='J' ||input =='K'||
      input== 'L' ||input == 'M' ||input == 'N'  ||input == 'P' ||input =='Q' ||input =='S' ||input == 'T' ||
      input == 'V' ||input == 'X' ||input == 'Z' || input =='H'||input == 'R'||input == 'W'|| input == 'Y')
    System.out.println("you just inputted a constant");
   
     else
     System.out.println("INVALID answer please type a character");
   }
 }
}
