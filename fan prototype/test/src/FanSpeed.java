public enum FanSpeed {
    
        SLOW (1),
        MEDIUM (2),
        FAST (3);
        
       private final int fanCode;

       FanSpeed(int _fanCode) {
            this.fanCode = _fanCode;
       }
    
    public int getFanCode() {
        return this.fanCode;
    }
 }
