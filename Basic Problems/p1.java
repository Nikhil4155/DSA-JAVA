import java.util.*;
public class p1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,count=0,d;
        System.out.println("Enter the number");
        n=sc.nextInt();
        sc.close();
        double nn=0;

        for(i=n; i>0; i/=10)
        {
            d=i%10;
            if(d!=0)
            {
                nn=Math.pow(10,count)*d+nn;
                count=count+1;
            }
        }
        System.out.println("The new required number is "+nn);
       

    }
}
