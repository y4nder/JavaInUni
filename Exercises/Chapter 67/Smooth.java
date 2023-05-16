public class Smooth{
   public static void main ( String[] args ){
      int[][] image  = {{0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,5,5,5,5,5,5,5,5,0,0},
                         {0,0,5,5,5,5,5,5,5,5,0,0},
                         {0,0,5,5,5,5,5,5,5,5,0,0},
                         {0,0,5,5,5,5,5,5,5,5,0,0},
                         {0,0,5,5,5,5,5,5,5,5,0,0},
                         {0,0,5,5,5,5,5,5,5,5,0,0},
                         {0,0,5,5,5,5,5,5,5,5,0,0},
                         {0,0,5,5,5,5,5,5,5,5,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0}};

      // assume a rectangular image
      int[][] smooth = new int[ image.length ][ image[0].length ];
      int sum = 0;
      // Compute the smoothed value for 
    s  // non-edge locations in the image.

    for ( int row=1; row<image.length-1; row++ ){
      for ( int col=1; col<image[row].length-1; col++ ){
        sum = image[row-1][col-1] + image[row-1][col] + image[row-1][col + 1] 
               + image[row][col - 1] + image[row][col] + image[row][col + 1] 
               + image[row + 1][col - 1] + image[row + 1][col] + image[row + 1][col + 1];
        smooth[row][col] = sum/9;
      }
   }
      
    // write out the input
    
    // write out the result
      for ( int row=0; row < smooth.length; row++){
         for ( int col=0; col < smooth[row].length-1; col++) 
            System.out.print( smooth[row][col] + ", " );
      System.out.println( smooth[row][smooth[row].length-1] ); 
      }
  }
}  