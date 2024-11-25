import java.util.*;
public class multipleharshad {
    int getsum(int n)
    {
        int i,sum=0;
        for(i=n; i>0; i/=10)
        {
            sum=sum+(i%10);
        }
        return sum;
    }

    void main() 
    {
    
        Scanner sc=new Scanner(System.in);
        int n,sum=0;
        System.out.println("Enter the number to be checked");
        n=sc.nextInt();

        while(n>9)
        {
            sum=getsum(n);
            if(n%sum==0)
                n=n%sum;
            else
            {
                System.out.println("Not a Multiple Harshad Number");
                System.exit(0);
            }
            
        }
        System.out.println("Multiple Harshad Number");  
        sc.close();
        
    }
}
