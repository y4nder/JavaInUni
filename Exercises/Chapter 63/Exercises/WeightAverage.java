public class WeightAverage {
    private int[] data;

    public WeightAverage(int[] init){
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
    public int subAverage(int start, int end){
        int sum = 0;
        for(int i = start; i <= end && end <= data.length - 1; i++){
            sum += data[i];
        }
        return sum / (data.length/2);
    }
    public static void main ( String[] args )
    {
        int[] values = { 98,  99,  98,  99, 100, 101, 102, 100, 104, 105,
                        105, 106, 105, 103, 104, 103, 105, 106, 107, 106,
                        105, 105, 104, 104, 103, 102, 102, 101, 100, 102};
        Weight june = new Weight( values );
        System.out.println( june );
        int avg = june.average();
        System.out.println("average = " + avg );
    }
}
