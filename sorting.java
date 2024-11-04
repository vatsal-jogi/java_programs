import java.util.*;
class asc
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no[]=new int[5];
        int k=1;
        for(int i=0;i<no.length;i++)
        {
            System.out.print("enter Number:"+k+":");
            no[i]=sc.nextInt();
            k++;
        }
        System.out.println("\n---display array---\n");
        k=1;
        for(int i=0;i<no.length;i++)
        {
            System.out.println("Number:"+k+":"+no[i]);
            k++;
        }
        System.out.println("\n---sorting array---\n");
        int tmp=0;
        k=1;
        for(int i=0;i<5;i++){


        for(int j=i+1;j<5;j++)
        {
            if(no[i]>no[j])
            {
                tmp=no[i];
                no[i]=no[j];
                no[j]=tmp;
            }
        }
        System.out.println("sorting number->"+k+":"+no[i]);
        k++;
    }        



    }
}