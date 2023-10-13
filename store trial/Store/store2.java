public class store2 {  //fix the code with notepad called store code fix
    String game;
    int copies;
    double price; //price will be equal to 19.99
 
    
    public Store2(String store2Game, int store2Copies, double store2Price){
     game = store2Game;
     copies =store2Copies;
     price = store2Price;
  }
      public static void main (String[]args) {
        Store2 gamestop = new Store2("minecraft", 100, 19.99);
        System.out.println("hello welcome in we have the new game " + gamestop.game  + " avilable " + " oh your instrested well " +
       "the game costs " + gamestop.price +" we have " + gamestop.copies + " copies available");
    
        
          
 }
}