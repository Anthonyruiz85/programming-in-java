public class Store {
    String game;
    int copies;
    double price; //price will be equal to 19.99
    
    
    public Store(String storeGame, int storeCopies, double storePrice){
     game = storeGame;
     copies =storeCopies;
     price = storePrice;
  }
      public static void main (String[]args) {
        Store gamestop = new Store("minecraft", 100, 19.99);
        System.out.println("hello welcome in we have the new game " + gamestop.game  + " avilable/n" + "oh your instrested well" +
       "the game costs" + gamestop.price +"we have a " + gamestop.copies + "available");
    
        
          
 }
}