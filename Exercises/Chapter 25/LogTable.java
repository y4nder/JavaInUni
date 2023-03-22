public class LogTable{
   public static void main ( String[] args ){
      System.out.println("<html>");
      System.out.println("<body>");
      System.out.println("<table>");
      System.out.println("<tr><th>x</th><th>ln(x)</th></tr>");
    
      for ( double x = 1.0/8.0; x <= 2.0; x = x + 1.0/8.0  ){
         //System.out.println( x + "\t" + Math.log( x ) );
         System.out.println("<tr><td>" + x + "</td><td>" + Math.log(x) + "</td></tr>" );
      }
      System.out.print("</table>"); 
      System.out.print("</body>"); 
      System.out.print("</html>"); 
   } 
}