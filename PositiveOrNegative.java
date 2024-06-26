import java.util.Scanner;
public class PositiveOrNegative{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int a=sc.nextInt();
        if(a>0){
            System.out.print("This "+a+" is Positive");
        }
        else if(a==0){
            System.out.print("This "+a+" is Zero");
        }
        else if(a<0){
            System.out.print("This "+a+" is Negative");
        }else{
            System.out.print("Invalid");
        }sc.close();
    }
}
/*
 Output:
      Enter the number:-25
      This -25 is Negative
 */