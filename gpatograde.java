import java.util.Scanner;

public class gpatograde
{
   public static void main(String[] args){
       
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your GPA");
       double gpa=sc.nextDouble();
       if(gpa<=4.00&&gpa>0){
           if(gpa>=3.8){
               System.out.print("You Have scored A+");
           }
           else if(gpa>=3.6){
               System.out.print("You Have scored A");
           }
           else if(gpa>=3.3){
               System.out.print("You Have scored B+");
           }
           else if(gpa>=3.0){
               System.out.print("You Have scored B");
           }
           else if(gpa>=2.7){
               System.out.print("You Have scored c+");
           }
           else if(gpa>=2.5){
               System.out.print("You Have scored c");
           }
           else{
               System.out.print("You Have scored NG");
           }
       }
       else{
           System.out.println("Invalid Input, please input valid GPA");
       }
   }
}