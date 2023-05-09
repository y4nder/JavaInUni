public class ColumnSums{
   public static void main ( String[] args ) {
      int[][] data = {{3, 2, 5},
                      {1, 4, 4, 8, 13},
                      {9, 1, 0, 2},
                      {0, 2, 6, 3, -1, -8},
                      {0, 1, 3} };
      int[] sums;
      int sumsLength = 0;
      int count;

      for(int row = 0; row < data.length; row++){
         count = 0;
         for(int col = 0; col < data[row].length; col++){
           count++;                      
         }
         if(sumsLength < count)
            sumsLength = count;
      }
      System.out.println("sum: " + sumsLength);
      sums = new int[sumsLength];
      
      for(int row = 0; row < data.length; row++){
         for(int col = 0; col < data[row].length; col++){
            if(row == col){ sums[row] = data[row][col]; }
         }
      }
      
      for(int row = 0; row < sums.length; row++){
            System.out.print( sums[row] + " ");
      }
   }
}  