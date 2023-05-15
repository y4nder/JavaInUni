public class ColumnSums {
    public static void main(String[] args){
        int[][] data = {{3, 2, 5},
                        {1, 4, 4, 8, 13},
                        {9, 1, 0, 2},
                        {0, 2, 6, 3, -1, -8}, 
                        {1, 4, 4}};
        int[] sums;
        
        //determine the length of sums array
        int length = 0;
        for(int row = 0; row < data.length; row++){
            if(length < data[row].length)
                length = data[row].length;
        }
        sums = new int[length];

        //add all column sums to sums array
        int sum = 0;
        for(int n = 0; n < sums.length; n++){
            for(int row = 0; row < data.length; row++){
                for(int col = 0; col < data[row].length; col++){
                    if(col == n) sum += data[row][col];
                }
                sums[n] = sum;
            }
            sum = 0;
        }

        //display the sum array
        for(int i = 0; i < sums.length; i++){
            System.out.println("sum of column " + (i+1) + " is : " + sums[i]);
        }
    }
}