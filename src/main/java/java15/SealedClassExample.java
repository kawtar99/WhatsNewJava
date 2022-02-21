package java15;

public abstract sealed class SealedClassExample permits SubClass1, SubClass2 {

    public abstract int getId();
}
