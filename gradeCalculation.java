import java.util.*;
class Student{
    int marks[] = new int[6];
    Scanner sc = new Scanner(System.in);
    void getMarks(){
        for(int i=0;i<marks.length;i++){
            marks[i] = sc.nextInt();
        }
    }
    int totalMarks(int marks[]){
        int total = 0;
        for(int i=0;i<marks.length;i++){
            total += marks[i];
        }
        System.out.println("Total Marks :" + total);
        return total;
    }
    int average(int total){
         int avgPercent = (total/6);
         System.out.println("Average :"+avgPercent);
         return avgPercent;
    }
    void gradeCalculator(int total){
        int percentage = (total*100)/600;
        System.out.println("Percentage Is :"+percentage);
        if(percentage>=90){
            System.out.println("A+");
        }else if(percentage>=80 && percentage<90){
            System.out.println("A");
        }else if(percentage>=75&& percentage<80){
            System.out.println("B+");
        }else if(percentage>=70&&percentage<75){
            System.out.println("B");
        }else{
            System.out.println("Fail");
        }
    }
    void display(){
        int total = totalMarks(marks);
         average(total);
        gradeCalculator(total);
    }
}
  
public class gradeCalculation {
    public static void main(String args[]){
       Student s1 = new Student();
       System.out.print("Enter The Marks :");
       s1.getMarks();
       System.out.println("------Total Marks------");
       int total= s1.totalMarks(s1.marks);
       System.out.println("-----Average-----");
       s1.average(total);
       System.out.println("-------Grade-------");
       s1.gradeCalculator(total);
       System.out.println("-------Result------");
       s1.display();
    }
}
