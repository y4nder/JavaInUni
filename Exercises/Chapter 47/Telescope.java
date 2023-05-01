public class Telescope {
    private double diameter;
    private double focalMain;
    private double focalEye;
    
    public Telescope( double diameter, double focalMain, double focalEye){
        this.diameter = diameter;
        this.focalMain = focalMain;
        this.focalEye = focalEye;
    }

    public double magnification(){
        return  focalMain / focalEye;
    }

    public double fNumber(){
        return focalMain / diameter;
    }
}
