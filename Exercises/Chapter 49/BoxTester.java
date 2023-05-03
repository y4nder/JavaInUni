public class BoxTester{
    public static void main(String[] args){
        Box box = new Box(2.0, 2.1, 2.2);

        System.out.println( "Box1 Area: "    + box.area() + "  Volume: " + box.volume()  );
                         
        Box box2 = new Box(2);

        System.out.println( "Box1 Area: "    + box2.area() + "  Volume: " + box2.volume()  );
    }
}