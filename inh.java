//array
import java.util.*;
public class inh{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vatsal[]= new int[5];
        int nidhi[]={1,2,3,4,5};
        for(int i=0;i<5;i++){
            vatsal[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.println("output : "+vatsal[i]);
        }
        vatsal[0]=45;
        
      

        
    }
}