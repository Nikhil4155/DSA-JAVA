import java.util.*;
public class twistedprime {
    int isprime(int x)
    {
        int i;
        for(i=2; i<=(x/2); i++) // for (int i = 2; i <= Math.sqrt(number); i++) more effecient way..
        {
            if(x%i==0)
                return 0;
        }
        return 1;
    }
    
    int getreverse(int n)
    {
        int i,nn=0;
        for(i=n; i>0; i/=10)
        {
            nn=nn*10+(i%10);
        }
        return nn;
    }

    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n,pm1,pm2,rev;
        n=sc.nextInt();
        pm1= isprime(n);
        rev= getreverse(n);
        pm2= isprime(rev);
        if(pm1==1 && pm2==1)
            System.out.println("Yes it is a twisted prime number");
        else
            System.out.println("Not a twisted prime number");
        sc.close();

    }
}
