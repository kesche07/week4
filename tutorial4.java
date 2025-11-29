
public class tutorial4
{
   public static void main(String[] args){
       //else if
       int num=10;
       if(num>0){
           System.out.println("The number is positive");
       }
       else if(num==0){
           System.out.println("the number is neither negative nor positive");
        }
       else{
           System.out.println("The number is negative");
       }
       
       
       //nested if
       int num1=15;
       if(num1%3==0){
           if(num1%5==0){
               System.out.println("Number is divisible by 3 and 5");  
           }
           else{
               System.out.println("Number is divisible by 3");
           }
       }
       else{
           System.out.println("number is not divisible by 3 or 5");
       }
       
       //odd or even
       int num2=4;
       if(num2%2==0){
           System.out.println("The number is even");
       }
       else{
           System.out.println("the number is odd");
       }
       
       //switch statement
       int x=2;
       switch(x){
           case 1: System.out.println(1);
           case 2: System.out.println(2);
           case 3: System.out.println(3);
       }
   }
}