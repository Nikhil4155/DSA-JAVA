package OOPs.OOPS6.Enums;

public class Basic implements A{

    enum Week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enum constants
        // public static and final
        // since its final you cannot create child enums
        // type is Week

        Week() {
            System.out.println("Constructor called for " + this);
        }
        // Enums constructor cannot be public or protected only private or default is possible and it must be defined inside the enum block
        // Why? because we dont want to create new objects
        // this is not the enum concepts thats why

    }
    
    public void Hello()
    {
        System.out.println("Hello How are you");
    }

    public static void main(String[] args) {
        // Week week=new Week();  Objects of enums cannot be created
        Week week;
        week=Week.Monday;
        System.out.println(week.ordinal());

        for(Week day: Week.values())
        {
            System.out.println(day);
        }
    }

}
