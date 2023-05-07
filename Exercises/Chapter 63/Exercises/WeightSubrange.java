public class WeightSubrange {
    private int[] data;

    public WeightSubrange(int[] init){
        data = new int[init.length];
        for (int j = 0; j < data.length; j++){
            data[j] = init[j];
        }
    }
    public String toString(){
        String str = "";
        for (int j = 0; j < data.length; j++){
            str += data[j] + " ";
        }
        return str;
    }
    public int average(){
        int sum = 0;
        for (int j = 0; j < data.length; j++){
            sum += data[j];
        }

        return sum / data.length;
    }
    public static void main ( String[] args ){
        int[] values = { 98,  99,  98,  99, 100, 101, 102, 100, 104, 105,
                        105, 106, 105, 103, 104, 103, 105, 106, 107, 106,
                        105, 105, 104, 104, 103, 102, 102, 101, 100, 102 };
        int avg, fstHalfAvg, sndHalfAvg;
        Weight june = new Weight( values );
        
        //process data
        avg = june.average();
        fstHalfAvg = values.length % 2 == 0? june.subAverage(0, (values.length / 2) - 1 )
                                            : june.subAverage(0, (values.length / 2) );
        sndHalfAvg = values.length % 2 == 0? june.subAverage( values.length / 2, values.length - 1 )
                                            : june.subAverage( ( values.length / 2 ) - 1, values.length - 1 );
        //print data
        System.out.println( june.toString() );
        System.out.println("average = " + avg );
        System.out.println("average of first half= " + fstHalfAvg );
        System.out.println("average of second half= " + sndHalfAvg );
        System.out.println("difference between the two averages is: " + (fstHalfAvg - sndHalfAvg) );
    }
}
