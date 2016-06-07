/**
 * Created by akrzos on 2016-06-07.
 */
public class EqualsOverride {
    @Override
    public boolean equals(Object obj) {
        return obj.equals(this);
    }

    public static void main(String[] args) {
        EqualsOverride program = new EqualsOverride();

//        System.out.println("this");
//        System.out.println(program.equals(program));
//        System.out.println("null");
//        System.out.println(program.equals(null));
        System.out.println("Object");
        System.out.println(program.equals(new Object()));


    }
}
