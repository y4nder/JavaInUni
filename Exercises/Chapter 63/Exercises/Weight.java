public class Weight{
    private int[] data;

    public Weight(int[] init){
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
}

