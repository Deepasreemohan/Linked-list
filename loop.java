import java.util.LinkedList;
public class loop {
    public static void main(String ars[]){
      LinkedList<String>transport=new LinkedList<>();
      transport.add("Bus");
      transport.add("Car");
      transport.add("Two Wheeler");
      System.out.println(transport);
      System.out.println(transport.getFirst());
      System.out.println(transport.getLast());
      System.out.println(transport.get(2));
      System.out.println(transport.size());
      
    }
    
}
/*
 [Bus, Car, Two Wheeler]
Bus
Two Wheeler
Two Wheeler
3
 */
