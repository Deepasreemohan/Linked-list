import java.util.Scanner;
public class DiamondPattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print("  ");
            }for(int j=1;j<=i;j++){
                System.out.print("* ");
        }for(int j=1;j<i;j++){
            System.out.print("* ");
    } System.out.println();
} 
     for(int i=2;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print("  ");
            }
            for(int j=i;j<=n;j++){
                System.out.print("* ");
        }
        for(int j=i;j<n;j++){
            System.out.print("* ");
    } System.out.println();
} sc.close();
    }
}
/*Output:
     Enter the number:5

        *
      * * *
    * * * * *
  * * * * * * * 
* * * * * * * * *
  * * * * * * * 
    * * * * *
      * * *
        * 
  
 */