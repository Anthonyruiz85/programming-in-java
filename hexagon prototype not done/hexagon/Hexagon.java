public class Hexagon {
      //private variables
      private final double _SideOfHexagon;
      private double  AreaOfHexagon;
  
    // construtor
    public Hexagon(double SideOfHexagon){
    this._SideOfHexagon = SideOfHexagon;
  }

    // Core
    public String CalculateAreaOfHexagonWithOneSide(){
        return String.valueof((6* Math.pow(this._SideOfHexagon,))/(4*Math.tan(Math.PI / 6)));
    }



}