import java.util.*;
public class duck {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,pro=1;
        System.out.println("Enter the number");
        n=sc.nextInt();
        sc.close();
        
        for(i=n; i>0; i/=10)
        {
            pro=pro*(i%10);
        }
        if(pro==0)
            System.out.println("Duck Number");
        else
            System.out.println("Not a Duck Number");
        
    }
}
