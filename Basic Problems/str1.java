
public class str1 {
    public static void main(String args[])
    {
        String st;
        st="BLUEJ";

        for(int i=0; i<=4; i++)
        {
            for(int j=i; j<=4; j++)
            {
                System.out.print(st.charAt(j)+ " ");
            }
            for(int k=0; k<i; k++)
            {
                System.out.print(st.charAt(k)+ " ");
            }
            System.out.println();
        }
    }
}
