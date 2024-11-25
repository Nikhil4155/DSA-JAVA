package OOPs.OOPS3.Inheritance;

public class Boxprice extends Boxweight {
    float cost;
    
    Boxprice()
    {
        this.cost=-1;
    }

    Boxprice(float l,float w,float h,float weight,float cost)
    {
        super(l,w,h,weight);
        this.cost=cost;
    }

}
