public class Hexagon {
      //private variables
      private final double _SideOfHexagon;
      private double  AreaOfHexagon;
  
    // construtor
    public Hexagon(double SideOfHexagon) {
    this._SideOfHexagon = SideOfHexagon;
  }

    // Core
    public String CalculateAreaOfHexagonWithOneSide(){
        return String.valueOf((6* Math.pow(this._SideOfHexagon,2)) / (4* Math.tan(Math.PI / 6)));
    }



}