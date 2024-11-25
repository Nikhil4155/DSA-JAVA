import java.util.*;
public class aasci {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch;
        ch=sc.next().charAt(0);
        sc.close();
        int intch=ch;
        if (intch>=65 && intch<=90)
        {
            System.out.println("Entered character is a Capital letter");
        }
        else{
            System.out.println("Not a Capital Letter");
        }
    }
}
