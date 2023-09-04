import java.util.Scanner;

public class Calculator {
    public static void main(String[]args){

        int a, b, c;
        System.out.println("Welcome to my Calculator");
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        a = sc.nextInt();
        System.out.print("Enter number 2: ");
        b = sc.nextInt();
        System.out.println();
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        System.out.println();
        System.out.print("Enter: ");
        c = sc.nextInt();
        if(c==1){
            System.out.println(a+b);
        }
        else if(c==2){
            System.out.println(a-b);
        }
        else if(c==3){
            System.out.println(a*b);
        }
        else if(c==4){
            if(a>b){
                System.out.println(a/b);
            }
            else{
                System.out.println("Error");
            }
        }
        else{
            System.out.println("You choose wrong key");
        }
    } 
}
