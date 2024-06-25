import java.util.LinkedList;
public class forloop {
    public static void main(String args[]){
        LinkedList<String>place=new LinkedList<>();
        place.add("School");
        place.add("College");
        place.add("Temple");
        place.add("Museum");
        for(String places:place){
            System.out.println(places);
        }
        for(int i=0;i<place.size();i++){
            System.out.println(place);
        }
    }
    
}
/*
 School
College
Temple
Museum
[School, College, Temple, Museum]
[School, College, Temple, Museum]
[School, College, Temple, Museum]
[School, College, Temple, Museum]
 */