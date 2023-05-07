public class grades {
    final static int arraySize = 8;
    private String studentName;
    private int[] grades;
    private int gradeCount;
    
    public grades(String studentname){
        this.studentName = studentname;
        grades = new int[arraySize];
        gradeCount = 0;
    }

    public void addGrade(int grade){
        if(gradeCount < arraySize){
            grades[gradeCount] = grade;
            gradeCount++;
        }
    }

    public double gradeAvg(){
        int sum = 0;
        
        for(int i = 0; i < gradeCount; i++){
            sum += grades[i];
        }
        
        return sum/gradeCount;
    }
    
    public String toString(){        
        String str = "";
        for(int i = 0; i < gradeCount; i++){
            str += grades[i] + " ";
        }
        return str;
    }

    public int min(){
        int min = grades[0];

        for(int i = 0; i < gradeCount; i++){
            if(grades[i] < min) min = grades[i];
        }
        return min;
    }
    
    public int max(){
        int max = grades[0];
    
        for(int i = 0; i < gradeCount; i++){
            if(grades[i] > max) max = grades[i];
        }
        return max;
    }

    public static void main(String[] args){
        grades stud1 = new grades("Leander");

        stud1.addGrade(89);
        stud1.addGrade(90);
        stud1.addGrade(87);
        stud1.addGrade(82);

        System.out.println("You're grades are: ");
        System.out.println(stud1.toString());
        System.out.println(stud1.gradeAvg());
        System.out.println("Lowest Grade is " + stud1.min());
        System.out.println("Highest Grade is " + stud1.max());
        
    }
}
