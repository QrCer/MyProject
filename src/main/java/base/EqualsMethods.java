package base;

import java.math.BigDecimal;

/**
 * Created by QrCeric on 17/02/2017.
 */
public class EqualsMethods {

    public static final String ABC = "ABC";

    public static void main(String[] args) {

        int i = 1;
        Integer integer = new Integer(1);
        BigDecimal bigDecimal = new BigDecimal(1);
        BigDecimal bigDecimal2 = new BigDecimal(1);

        System.out.println("i == 1: " + (i == 1));
        System.out.println("integer == 1: " + (integer == 1));
        System.out.println("bigDecimal.intValue() == 1: " + (bigDecimal.intValue() == 1));
        System.out.println("bigDecimal.equals(1): " + (bigDecimal.equals(1)));
        System.out.println("bigDecimal.equals(bigDecimal2): " + (bigDecimal.equals(bigDecimal2)));
        System.out.println("bigDecimal == bigDecimal2: " + (bigDecimal == bigDecimal2) + "\n\r");

        System.out.println("integer == i: " + (integer == i));
        System.out.println("integer.equals(i): " + integer.equals(i));
        System.out.println("bigDecimal.equals(integer): " + bigDecimal.equals(integer));
        System.out.println("integer.equals(bigDecimal): " + integer.equals(bigDecimal));
        System.out.println("integer.equals(bigDecimal.intValue(): " + integer.equals(bigDecimal.intValue()) + "\n\r");

        System.out.println("i: " + i);
        System.out.println("integer: " + integer);
        System.out.println("bigDecimal: " + bigDecimal+"\n\r");

        String string1 = ABC;
        String string2 = ABC;
        String string3 = new String(ABC);

        System.out.println("string1==string2: " + (string1 == string2));
        System.out.println("string2==string3: " + (string2 == string3));
        System.out.println("string1 == string3.intern(): " + (string1 == string3.intern()));
        System.out.println("string2.equals(string3): " + (string2.equals(string3)));


    }
}
