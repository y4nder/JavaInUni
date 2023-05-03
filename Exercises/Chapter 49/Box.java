public class Box {
    private double width;
    private double height;
    private double length;

    public Box(double width, double height, double length){
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(double side){
        width = side;
        length = side;
        height = side;

    }

    //methods
    public double volume(){
        return width * height * length;
    }

    public double area(){
        return 2 * ( (width * length) + (width * height) + (length * height) );
    }
}
