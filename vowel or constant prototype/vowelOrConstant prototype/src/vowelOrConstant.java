import java.util.Scanner;

public class vowelOrConstant {
    public static void main(String [] args){
   try (Scanner userInput = new Scanner(System.in)) {//Scanner named userInput
System.out.println("input a letter to see if its a vowel or constant:");


char input = userInput.findInLine(".").charAt(0);/*  this line allows user char input  

to be stored in the input variable   */
 if (input == 'a' ||  input =='A'||input == 'e' ||input == 'E'  || input == 'i' ||input =='I'|| input == 'o' ||input == 'O'|/* if statements check if user inputs 
 vowel  */
 input == 'u'||input == 'U'||  input == 'y' |input =='Y'){
        System.out.println("you inputted a vowel");
 }else // else statement prints statement below if you dont input a vowel
    
    if (input == 'b' ||input =='B'|| input == 'c' ||input =='C'|| input =='d' ||input =='D'||input =='f' ||input =='F'|input =='g' ||input =='G'||input =='j' ||input =='J'||input =='k'||input =='K'|
      input== 'l' ||input == 'L'||input == 'm' ||input =='M'||input == 'n'  |input == 'N'|input == 'p' ||input == 'P'|input =='q' ||input =='Q'|input =='s' ||input =='S'||input == 't' |input =='T'|
      input == 'v' ||input == 'V'||input == 'x' ||input =='X'||input == 'z' ||input =='Z'|| input =='h'||input == 'H'||input == 'r'||input == 'R'||input == 'w'||input =='W'||input == 'y'|input =='Y')
    System.out.println("you just inputted a constant");
   
     else
     System.out.println("INVALID answer please type a character");
   }
 }
}
