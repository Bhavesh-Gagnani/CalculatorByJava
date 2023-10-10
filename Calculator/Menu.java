package Calculator;
import java.util.*;

public class Menu{
    float num1;
    float num2;
    int Confirm;
    int Operation;
    int More;
    public void Menu(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number 1: ");
        num1 = sc.nextFloat();
        System.out.print("Number 2: ");
        num2 = sc.nextFloat();
        Confirm();
    }
    public void Confirm(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("1: Continue");
        System.out.println("2: Reset");
        System.out.println();
        System.out.print("Press: ");
        Confirm = sc.nextInt();
        System.out.println();
        switch (Confirm) {
            case 1:
            Operation();
                break;
            case 2:
                Menu();
                break;
            default:
                System.out.println("Please Enter a Valid Code");
                Confirm();
                break;
        }
    }
    public void Operation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1: Plus");
        System.out.println("2: Minus");
        System.out.println("3: Multiply");
        System.out.println("4: Divide");
        System.out.println();
        System.out.print("Press: ");
        Operation = sc.nextInt();
        switch (Operation) {
            case 1:
                System.out.println("Result: "+(num1+num2));
                More();
                break;
            case 2:
                System.out.println("Result: "+(num1-num2));
                More();
                break;
            case 3:
                System.out.println("Result: "+(num1*num2));
                More();
                break;
            case 4:
                System.out.println("Result: "+(num1/num2));
                More();
                break;
            default:
                System.out.println("Please Enter a Valid Code");
                Operation();
                break;
        }
    }
    public void More(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("1: More");
        System.out.println("2: Exit");
        System.out.println();
        System.out.print("Press: ");
        More = sc.nextInt();
        System.out.println();
        switch (More) {
            case 1:
                Menu();
                break;
            case 2:
                System.out.println("Thank You");
                break;
            default:
                System.out.println("Please Enter a Valid Code");
                More();
                break;
        }
    }
}