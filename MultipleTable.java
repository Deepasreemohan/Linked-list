import java.util.Scanner;
public class MultipleTable{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int a=sc.nextInt();
      System.out.print("Enter the length of the table:");
      int n=sc.nextInt();
      int c=1;
      for(int i=1;i<=n;i++){
         c=a*i;
         System.out.println(i+" * "+a+" = "+c);
      }sc.close();
      }
}
/*
  Output:
    Enter the number:8
    Enter the length of the table:10
     1 * 8 = 8
     2 * 8 = 16
     3 * 8 = 24
     4 * 8 = 32
     5 * 8 = 40
     6 * 8 = 48
     7 * 8 = 56
     8 * 8 = 64
     9 * 8 = 72
     10 * 8 = 80
 */