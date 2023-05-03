public class FactorialErrorFlag {
    public static long factorial( int n )
    {
        long fct = 1;
        if( n < 0 || n > 20) return -1;
        for ( int j=1; j<=n; j++ ) 
            fct *= j;
        
        return fct;
    }
    public static void main (String[] args ) 
    {
        int n = 21;
        System.out.println( "factorial of " + n);
        if(factorial(n) == -1){
            System.out.println("Error Messsage");
        }
        else{
            System.out.println( "first method : " + factorial( n ) ); 
        }
    }
}
