import java.util.Scanner;
public class Average{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of element:");
        int n=sc.nextInt();
        int []a=new int[n];
        int average=0;
        for(int i=0;i<n;i++){
          System.out.print("Enter the array element:");
          a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
          average=(average=a[i])/n;
        }
          System.out.print("Avearge of the elements="+average);
          sc.close();
    }
}
/*
  Output:
    Enter the number of element:5
    Enter the array element:25
    Enter the array element:28
    Enter the array element:9
    Enter the array element:49
    Enter the array element:86
Avearge of the elements=17
 */