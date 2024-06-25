
public class count {
    public static void main(String[] args){
       int n=567;
       int count=0;
         while(n!=0){
          int b=n%10;
          count++;
        n=n/10;
      }
       System.out.print("Number of digit:"+count);
            
    }

    }
    /*other method to count the integer
    import java.util.Linkedlist;
    public class Main{
    public static void main(String args[]){
    int n=534;
    String a=Integer.toString(n);
    System.out.print(a.length());
    }}

*/
 // Output:
 //   Number of digit:3