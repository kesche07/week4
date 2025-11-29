import java.util.Scanner;


public class papersize
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter paper size needed");
        String size=sc.nextLine();
        switch(size){
            case "a0":
            case "A0":
                System.out.println("A0 dimensions:841 x 1189 mm (33.1 x 46.8 inches)");
                break;
            case "a1":
            case "A1":
                System.out.println("A1: 594 x 841 mm (23.4 x 33.1 inches)");
                break;
            case "A2":
            case "a2":
                System.out.println("A2: 420 x 594 mm (16.5 x 23.4 inches)");
                break;
            case "A3":
            case "a3":
                System.out.println("A3: 297 x 420 mm (11.7 x 16.5 inches)");
                break;
            case "A4":
            case "a4":
                System.out.println("A4: 210 x 297 mm (8.3 x 11.7 inches)");
                break;
            case "A5":
            case "a5":
                System.out.println("A5: 148 x 210 mm (5.8 x 8.3 inches)");
                break;
            default:
                System.out.println("Invalid Input");
                
        }
    }
}