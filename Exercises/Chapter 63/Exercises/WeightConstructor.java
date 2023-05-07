public class WeightConstructor{
    private int[] data;

    public WeightConstructor(int[] init){
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

    public static void main ( String[] args )
    {
        int[] values = { 98,  99,  98,  99, 100, 101, 102, 100, 104, 105,
                        105, 106, 105, 103, 104, 103, 105, 106, 107, 106,
                        105, 105, 104, 104, 103, 102, 102, 101, 100, 102};
        Weight june = new Weight( values );
        System.out.println( june );
    }
}
