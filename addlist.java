import java.util.LinkedList;
public class addlist{
    public static void main(String args[]){
        LinkedList<String> name=new LinkedList<>();
        name.add("Priya");
        name.add("Deepa");
        name.add("Sree");
        name.add("Ramya");
        System.out.println(name);
        name.addLast("Nithi");
        name.addFirst("Poovitha");
        name.add(3,"Nila");
        System.out.println(name);
    }
}/*
Output
    [Priya, Deepa, Sree, Ramya]
[Poovitha, Priya, Deepa, Nila, Sree, Ramya, Nithi] 
 */