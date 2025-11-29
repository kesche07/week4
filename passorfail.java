import java.util.Scanner;

public class passorfail
{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your grade");
        double grade=sc.nextDouble();
        if(grade>=40){
            System.out.println("You have passed");
        }
        else{
            System.out.println("you have failed");
        }
        
    }
}