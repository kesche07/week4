import java.util.Scanner;
public class xfxcinema
{
    public static void main(String[] args){
        double child=150;
        double adult=250;
        double senior=250;
        
        int hindi=50;
        int english=100;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Xfx Cinema");
        System.out.println("Enter age group");
        System.out.println("1:Child \n2:Adult \n3:Senior");
        int age=sc.nextInt();
        System.out.println("Enter movie language");
        System.out.println("1:Hindi \n2:English");
        int lang=sc.nextInt();
        System.out.println("Does Customer have valid student ID?(Y/N)");
        char ID=sc.next().charAt(0);
        System.out.println("Apply festival discount? (Y/N)");
        char fest=sc.next().charAt(0);
        
        switch(age){
            case 1:
                if(lang==1){
                    double price=child+hindi;
                    if(ID=='Y'||ID=='y'){
                        price=price-(price*0.20);
                        if(fest=='Y'||fest=='y'){
                           price= price-(price*0.15);
                        }
                    } 
                    System.out.println("The total price is:"+price);
                }
                else if(lang==2){
                    double price=child+english;
                    if(ID=='Y'||ID=='y'){
                        price=price-(price*0.20);
                        if(fest=='Y'||fest=='y'){
                           price= price-(price*0.15);
                        }
                    } 
                    System.out.println("The total price is:"+price);
                }
                else{
                    System.out.print("Invalid Category.");
                }
                break;
            case 2:
                if(lang==1){
                    double price=adult+hindi;
                    if(ID=='Y'||ID=='y'){
                        price=price-(price*0.20);
                        if(fest=='Y'||fest=='y'){
                           price= price-(price*0.15);
                        }
                    } 
                    System.out.println("The total price is:"+price);
                }
                else if(lang==2){
                    double price=adult+english;
                    if(ID=='Y'||ID=='y'){
                        price=price-(price*0.20);
                        if(fest=='Y'||fest=='y'){
                           price= price-(price*0.15);
                        }
                    } 
                    System.out.println("The total price is:"+price);
                }
                else{
                    System.out.print("Invalid Category.");
                }
                break;
            case 3:
                if(lang==1){
                    double price=senior+hindi;
                    if(ID=='Y'||ID=='y'){
                        price=price-(price*0.20);
                        if(fest=='Y'||fest=='y'){
                           price= price-(price*0.15);
                        }
                    } 
                    System.out.println("The total price is:"+price);
                }
                else if(lang==2){
                    double price=senior+english;
                    if(ID=='Y'||ID=='y'){
                        price=price-(price*0.20);
                        if(fest=='Y'||fest=='y'){
                           price= price-(price*0.15);
                        }
                    } 
                    System.out.println("The total price is:"+price);
                }
                else{
                    System.out.print("Invalid Category.");
                }
                break;
            default:
                System.out.println("Invalid input. Please put valid category");
        }
    }
}