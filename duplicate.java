public class duplicate{
    public static void main(String args[]){
        int a[]={10,20,30,10,40};
        for(int i=0;i<a.length;i++){
            for(int j=1;j<a.length;j++){
           
              if(a[i]==a[j]){
                  System.out.println("The duplicate element in the array: "+a[i]);
                  return;
                }
            }
        }
        
    }
}
/*
  Output:
    The duplicate element in the array: 10
 */