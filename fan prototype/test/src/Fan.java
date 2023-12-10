
import java.io.PrintStream;
import java.util.*;
public class Fan {
    private int fanSpeed;
    private boolean isFanOn;
    private double fanRadius;
    private String fanColor;

    // instantiate the print class
    //private static final Scanner input = new Scanner(System.in);
    private static final PrintStream prt = new PrintStream(System.out);

    //default contstructor
    Fan(){
        fanSpeed = FanSpeed.SLOW.getFanCode();
        isFanOn = false;
        fanRadius = 5;
        fanColor = "Blue";
       
    }


 //getters   accessors
 public int getFanSpeed(){
    return this.fanSpeed;
  }
 public boolean getIsFanOn(){ 
    return this.isFanOn;
 }
 public double getFanRadius(){ 
    return this.fanRadius;
 }
 public String getFanColor() { 
    return this.fanColor;
 }
 
 //setters  mutators
public void setFanSpeed(int _fanSpeed) { 
    this.fanSpeed = _fanSpeed;
}
public void setIsFanOn(boolean _isFanOn) {
    this.isFanOn = _isFanOn;
 }
public void setFanRadius(double _fanRadius) {
    this.fanRadius = _fanRadius;
 }
public  void setFanColor(String _fanColor) {
    this.fanColor = _fanColor;
 }


    // return a string description for the fan
    public String toString(){
        String output = null;
        if (this.isFanOn){
           output =String.format("Fan Speed: %s\nFan Color: %s\nFan Radius: %s\n", this.fanSpeed, this.fanColor, this.fanRadius);
    
        }
        else{
            output =String.format("Fan Color: %s\nFan Radius: %s\nfan is off\n",  this.fanColor, this.fanRadius);
     

        }
        return output;
    }
        // test
        public static void main(String[]args){
            Fan maxSpeedFan = new Fan();//first object
            maxSpeedFan.setFanSpeed(FanSpeed.FAST.getFanCode());
            maxSpeedFan.setFanRadius(10);
            maxSpeedFan.setFanColor("Yellow");
            maxSpeedFan.setIsFanOn(true);
            //
            Fan medSpeedFan = new Fan();// object 2
            medSpeedFan.setFanSpeed(FanSpeed.MEDIUM.getFanCode());
            
            // execute object 1 and 2
        prt.println(maxSpeedFan.toString());
        prt.println(medSpeedFan.toString());

        }
    }
