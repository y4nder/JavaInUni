public class TelescopeTester {
    public static void main(String[] args){
        Telescope tele = new Telescope( 2.1, 2.2, 2.3);

        System.out.println("magnification: " + tele.magnification() + 
                            " f-number: " + tele.fNumber());
    }
}
