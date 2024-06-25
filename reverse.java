import java.util.LinkedList;
public class reverse{
    public static void main(String args[]){
        LinkedList<String>electronics=new LinkedList<>();
        electronics.add("AC");
        electronics.add("Washing Machine");
        electronics.add("Fridge");
        System.out.print("Reverse element:"+electronics.reversed());
    }

}
/*
   Output: 
     Reverse element:[Fridge, Washing Machine, AC]
 */