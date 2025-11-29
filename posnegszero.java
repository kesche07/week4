import java.util.Scanner;

/**
 * Write a description of class posnegszero here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class posnegszero
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number a number to check Positive Negative or Zero");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("the number is positive");
        }
        else if(num<0){
            System.out.println("the number is negative");
        }
        else{
            System.out.println("the number is zero");
        }
    }
}