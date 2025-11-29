import java.util.Scanner;

public class divisible3or5
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to check if divisible by 3 or 5");
        int num=sc.nextInt();
        if(num%3==0||num%5==0){
            if(num%3==0){
                if(num%5==0){
                    System.out.println("the num is divisible by 3 and 5");
                }
                else{
                    System.out.println("The num is not divisible by 3 and not 5");
                }
        }
                
            else if(num%5==0){
              
                    System.out.println("the num is divisible by 5 but not 3");
                }
        }
        else{
            System.out.println("Number is neither divisible by 3 or 5");
        }
    }
}