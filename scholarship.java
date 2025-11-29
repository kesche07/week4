import java.util.Scanner;

public class scholarship
{
   public static void main(String[] args){
       
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Students GPA");
       double gpa=sc.nextDouble();
       System.out.println("Enter Students attendance in percentage");
       double attendance=sc.nextDouble();
       System.out.println("Enter students attitude in range of 1-10");
       double attitude=sc.nextDouble();
       if(gpa>=3.2){
          if(attendance>=80){
              if(attitude<5){
                  System.out.println("Student is eligible for Scholarship");
              }
              else{
                  System.out.println("Student needs to improve attitude for scholarship");
              }
          }
          else{
              System.out.println("Student needs to improve attendance");
          }
   }
   else{
       System.out.print("Student needs to improve grade to be eligible");
   }
   
}
}