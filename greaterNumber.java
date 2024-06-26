import java.util.Scanner;
public class greaterNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a=sc.nextInt();
        System.out.print("Enter the second number:");
        int b=sc.nextInt();
        System.out.print("Enter the third number:");
        int c=sc.nextInt();
        if(a>b&&a>c){
            System.out.println("The greatest Number of three number is:"+a);
        }
        else if(b>a&&b>c){
            System.out.println("The greatest Number of three number is:"+b);
        }else{
            System.out.println("The greatest Number of three number is:"+c);
        }sc.close();
    }
}/*
     Output:
      Enter the first number:5
      Enter the second number:6
      Enter the third number:7
      The greatest Number of three number is:7
 */