import java.util.Scanner;
public class DaysInMonth {
    public static void main(String args[]){
        int days;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Year:");
        int Year=sc.nextInt();
        System.out.print("Enter the Month:");
        int Month=sc.nextInt();
        switch (Month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                 days=31;
                break;
                case 4:
                case 6:
                case 9:
                case 11:
                   days=30;
                   break;
                   case 2:
                       if(Year%4==0&&(Year%100!=0||Year%400==0)){
                           days=29;
                           System.out.print("The number of days in given month:"+days);
                       }
                       else{
                        days=28;
                        System.out.print("The number of days in given month:"+days);
                       }
            default:
            days=0;
                break;
                    }
        if(days!=0){
          System.out.print("The Number of days in the given month:"+days);
        }sc.close();
        
    }
}

/*Output:
    Enter the Year:2025
     Enter the Month:2
      The number of days in given month:28
    
*/