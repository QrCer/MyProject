package base;

import java.lang.reflect.Method;

/**
 * Created by QrCeric on 17/02/2017.
 */
class ObjectMethods {


    public static void main(String[] args) {
        Object o = new Object();

        ObjectFinalize objectFinalize = new ObjectFinalize();
        System.out.println(objectFinalize.i);
        try {
            objectFinalize.finalize();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

//        try {
//            objectFinalize.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }

        ObjectClone objectClone = new ObjectClone();
        objectClone.i= 2;
        objectClone.name= new String[]{"AB"};
        System.out.println(objectClone.i);
        System.out.println("objectClone.name"+objectClone.name);
        ObjectClone objectClone1 = (ObjectClone) objectClone.clone();
        System.out.println("objectClone1.name"+objectClone1.name);
        System.out.println(objectClone1.i);


        final Method[] methods = o.getClass().getDeclaredMethods();

        System.out.println("Object contains 9 methods: ");
        for (Method method : methods) {
            System.out.println(method.getName());
        }

    }


}

class ObjectFinalize extends Object {

    ObjectFinalize() {
        System.out.println("Excuting construct();");
    }

    int i;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Excuting finalize();");
        super.finalize();
    }

}

class ObjectClone extends Object implements Cloneable {

    int i;

    String[] name;



    @Override
    protected Object clone() {
        ObjectClone obj = null;
        try {
            this.i = 3;
            obj = (ObjectClone) super.clone();
            obj.name= ((ObjectClone) super.clone()).name;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}