import java.util.Scanner;

public class Store {
    String game;
    int copies;
    double price; //price will be equal to 19.99
    
      (Scanner scanner =new Scanner (System.in)){}

     String userInput;
    public Store(String storeGame, int storeCopies, double storePrice){
     game = storeGame;
     copies =storeCopies;
     price = storePrice;
    
  }
      public static void main (String[]args) {
        Store gamestop = new Store("minecraft", 100, 19.99);
       
      System.out.println("hello welcome in would you like to purchase minecraft type y for yes n for no");
    userInput = scanner.nextString();
      if(userInput="y") 
    System.out.println("minecraft costs: " + gamestop.price);

        //System.out.println("Hello Welcome in we have the new game " + gamestop.game  + " avaliable" + " oh your intrested well" +
      // " the game costs:" + gamestop.price +" we have a: " + gamestop.copies + " copies available ");
    
       
/* "hello welcome in would you like to purchase minecraft" have user type y or n if yes display game price
if no display another game and ask user if they want to purchase it with y or n  if they type yes display price if they say n
display sorry those are only two games have a good day */
        
          
 }
}
 