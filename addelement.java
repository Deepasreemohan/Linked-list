import java.util.LinkedList;
public class addelement{
    public static void main(String args[]){
      LinkedList<Integer>number=new LinkedList<>();
      number.add(5);
      number.add(7);
      number.add(6);
      int sum=0;
      for(int a:number){
        sum=sum+a;
       }
        System.out.print("Add the number: "+sum);
      }
}
/*
  Output:
    Add the number: 18
 */