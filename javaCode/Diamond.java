package javaCode;

/**
 * InnerDiamond
 */
interface InnerDiamond {
    default void foo() {
        System.out.println("InnerDiamond");
    }
}

/**
 * InnerDiamond_1
 */
@FunctionalInterface
interface InnerDiamond_1 {
    // default void foo() {
    // System.out.println("InnerDiamond_1");
    // }

    void abstractMethod();
}

public class Diamond implements InnerDiamond, InnerDiamond_1 {
    public static void main(String[] args) {
        new Diamond().foo();
    }

    public void foo() {
        InnerDiamond.super.foo();
    }

    @Override
    public void abstractMethod() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'abstractMethod'");
    }

}
