import java.util.*;

class Calculate {
   
   int num1, num2; //attributes
   
   public Calculate(){
      this.num1 = 0;
      this.num2 = 0;
   }
   
   public Calculate (int n1, int n2){ //constructor
      this.num1 = n1;
      this.num2 = n2;
   }
   
   public int add(){ //methods
      return num1 + num2;
   }
   
   public int subtract(){
      return num1 - num2;
   }
   
   public double divide(){
      return num1 / (num2 + 0.0D);
   }
   
   public int multiply(){
      return num1 * num2;
   }
}

class Tawo {
   
   String name;
   int age;
   String course;
   
   public Tawo (String name, int age, String course){
      this.name = name;
      this.age = age;
      this.course = course;
   }
   
   public void summary(){
      System.out.println("My name is " + name + " I am " + age + " years old " + " and I am studying " + course);
   }
}


class ClassTestCalculatoor {
   public static void main (String [] args) {
      Scanner sc = new Scanner(System.in);
      
      String name = " ";
      String course = " ";
      int age;
      
      System.out.print("Input first number: ");
      int firstNum  = sc.nextInt();
      System.out.print("Input second number: ");
      int secondNum = sc.nextInt();
      
      System.out.print("What is your name: ");
      name += sc.nextLine();
      
      System.out.print("How old are you: ");
      age = sc.nextInt();
      
      System.out.print("What is your course: ");
      course += sc.nextLine();
      
      Calculate ans = new Calculate(firstNum, secondNum); //murag function call, gahimo ka og new objectt
      Tawo me = new Tawo(name, age, course);
      
      Calculate test = new Calculate();
      
      test.num1 = 15;
      test.num2 = 3;
            
      System.out.println(ans.add());
      System.out.println(ans.subtract());
      System.out.println(ans.divide());
      me.summary();
      System.out.println(test.add());
      System.out.println(test.multiply());
   }
}