package OOPs.OOPS2.StaticVariable;

public class StaticVariableMain {
    public static void main(String[] args) {
         
        System.out.println(StaticVariable.population);// Can refer Static variable without creating objects
        StaticVariable.changevalue();
        System.out.println(StaticVariable.population);


        StaticVariable v1 = new StaticVariable(15, "Nikhil Sah", 24);
        System.out.println(StaticVariable.population);
        // System.out.println(v1.population); // This statement does not give error but not conventional it shows warning
        System.out.println(v1.name);

    }
}