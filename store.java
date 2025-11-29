import java.util.Scanner;
public class store
{
 public static void main(String[] args){
     double sp;
     
     Scanner sc=new Scanner(System.in);
     System.out.println("Welcome to store");
     System.out.println("\n Enter Marked price of item");
     double mp=sc.nextDouble();
     sc.nextLine();
     System.out.println("\n Enter Category of item");
     char category=sc.next().charAt(0);
        if (category=='A'||category=='a'){
            sp=mp-(mp * 0.60);
            System.out.println("The selling price is "+sp);
        }
        else if (category=='b'||category=='B'){
            sp=mp-(mp * 0.40);
            System.out.println("The selling price is "+sp);
        }
        else if (category=='c'||category=='C'){
            sp=mp-(mp * 0.20);
            System.out.println("The selling price is "+sp);
        }
        else if (category=='d'||category=='D'){
            sp=mp-(mp * 0.10);
            System.out.println("The selling price is "+sp);
        }
        else{
            System.out.println("The selling price is"+mp);
        }
     
 }
}