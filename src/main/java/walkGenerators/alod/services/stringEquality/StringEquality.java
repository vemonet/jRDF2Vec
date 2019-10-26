package walkGenerators.alod.services.stringEquality;

/**
 * An interface for classes which define under what conditions two Strings are considered equal.
 */
public interface StringEquality {

    public boolean isSameString(String s1, String s2);

    public String getName();

}
