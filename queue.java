import java.util.LinkedList;
public class queue{
    public static void main(String args[]){
        LinkedList<String>flower=new LinkedList<>();
         flower.add("Rose");
         flower.add("Jasmine");
         flower.add("Hibiscus");
         flower.add("Sun Flower");
         System.out.println(flower.removeFirst());
         System.out.println(flower.removeFirst());
         System.out.println(flower.removeFirst());
         System.out.println(flower.removeFirst());
    }
}
/*
   Output:
     Rose
     Jasmine   
     Hibiscus  
     Sun Flower
 */