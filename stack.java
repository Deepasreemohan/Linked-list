import java.util.LinkedList;
import java.util.Scanner;
public class stack{
    public static void main(String args[]){
        LinkedList<String>pet=new LinkedList<>();
        Scanner sc =new Scanner(System.in);
          pet.add("Dog");
          pet.add("Cat");
          pet.add("Parrot");
          pet.add("Rabbit");
          pet.add("Cow");
          System.out.println(pet.removeLast());
          System.out.println(pet.removeLast());
          System.out.println(pet.removeLast());
          System.out.println(pet.removeLast());
          System.out.println(pet.removeLast());
          sc.close();
    }
}
/*
 Output:
    Cow
    Rabbit
    Parrot
    Cat   
    Dog
 */