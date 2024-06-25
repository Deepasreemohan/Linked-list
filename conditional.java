import java.util.LinkedList;
public class conditional {
    public static void main(String args[]){
        LinkedList<String>document=new LinkedList<>();
        document.add("Aadhar card");
        document.add("PAN card");
        document.add("Smart card");
        document.add("Photo");
        document.add("Voter ID");
        if(document.contains("Photo")&&document.contains("Aadhar card")){
            System.out.print("You can create a account in bank ");
        }
        else if(document.contains("passport")||document.contains("Voter ID")){
           System.out.print("You can apply for Visa");    
        }
        else{
            System.out.print("you can't do anything without these document.go and apply first");
        }

    }
}
/*Output:
    you can create a account in bank*/