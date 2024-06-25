import java.util.LinkedList;
public class removemethod {
    public static void main(String args[]){
        LinkedList<String>world=new LinkedList<>();
        world.add("Japan");
        world.add("America");
        world.add("India");
        world.add("Greenland");
        world.add("Australia");
        System.out.println(world);
        world.remove(3);
        world.removeLast();
        world.removeFirst();
        System.out.println(world);
        world.clear();
        System.out.println(world);
        world.add("Singapore");
        world.add("China");
        System.out.println(world);
    
    }
}
/*Output
    [Japan, America, India, Greenland, Australia]
    [America, India]
    []
    [Singapore, China]
 */
