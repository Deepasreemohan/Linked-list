import java.util.ArrayList;
import java.util.LinkedList;
public class arraylist{
    public static void main(String[] args) {
        LinkedList <String> color= new LinkedList<>();
          color.add("Blue");
          color.add("Black");
          color.add("Violet");
          color.add("Green");
          System.out.println(color);
        ArrayList<String>num=new ArrayList<>();
        num.add("1");
        num.add("2");
        num.add("3");
        num.add("4");
        System.out.println(num);
        color.addAll(num);
        System.out.println(color);

    }
  }/*[Blue,Black,Violet,Green]
  [1,2,3,4]
  [Blue,Black,Violet,Green,1,2,3,4] */
