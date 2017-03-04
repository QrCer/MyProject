package interview;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by QrCeric on 04/03/2017.
 * try catch finally语句块对return的值影响规律：
 * 1. finally如果有return语句，后面语句无法到达，写return会报错，前面无论返回什么都会被重写。
 * 2. finally如果没有return语句，根据返回类型是基本类型还是引用类型，基本类型值不会改变，引用地址finally会改变里面的值。
 * 总之，return会把返回的值存到临时值，然后执行finally。也就是说finally前已经准备好返回的内容了，除非传递地址，否则finally不能改变里面的值。
 */
public class finallyValue {

    public static void main(String[] args) {
        System.out.println(returnValue());
        System.out.println(returnSet());
        System.out.println(returnSetString());
        System.out.println(returnObject().getId());
    }

    public static final int returnValue() {
        int i = 3;

        try {
            i = 4;
            return i;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            i = 5;
//            return i;
        }
        return i;
    }

    public static final Set returnSet() {
        Set set = new HashSet<Integer>();
        try {
            set.add(3);
            return set;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            set.remove(3);
            set.add(4);
            set.add(5);
        }
        set.add(6);
        return set;
    }

    public static final String returnSetString() {
        Set set = new HashSet<Integer>();
        try {
            set.add(3);
            Object o = null;
            System.out.println(o.hashCode());
            return String.valueOf(set.add(4));
        } catch (Exception e) {
            e.printStackTrace();
            return String.valueOf(set.add(5));
        } finally {
            set.remove(3);
            set.add(6);
            return set.toString();
        }
//        set.add(7);
//        return set.toString();
    }

    public static final ObjectX returnObject() {
        ObjectX objectX = new ObjectX();

        try {
            objectX.setId(4);
            return objectX;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            objectX.setId(5);
            objectX.setId(6);
        }
        return objectX;
    }

    static class ObjectX {

        public ObjectX() {
            this.id = 3;
        }

        private int id;

        public int getId() {
            return this.id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}
