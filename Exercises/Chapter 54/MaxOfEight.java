public class MaxOfEight{
    public static int maxEight(int a, int b, int c, int d, int e, int f, int g, int h){
        int max = a;

        if(a > b && a > c)
            max = a;
        else if(b > a && b > c)
            max = b;
        else
            max = c;

        if(d > e && d > f){
            if(d > max) max = d;}
        else if(e > d && e > f ){
            if(e > max) max = e;}
        else{
            if(f > max) max = f;}
        
        if(max > g && max > h )
            return max;
        else if(g > max && g > h)
            return g;
        else
            return h;
    }
    
    public static void main(String[] args){
        int a=  1, b= 34, c=  4, d= 30;
        int e= 45, f= 75, g= 21, h=  700;

        System.out.println("The max of " 
          + a + ", " + b + ", " + c + ", " + d + ", "
          + e + ", " + f + ", " + g + ", " + h   
          + " is: " + maxEight( a, b, c, d, e, f, g, h));
    }
}