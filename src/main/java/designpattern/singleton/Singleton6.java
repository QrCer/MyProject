/*  
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */

package designpattern.singleton;

/**
 * Created by QrCeric on 24/02/2017.
 * 懒汉式,线程不安全,不推荐使用
 * <p>
 * 很多地方,包括论坛\书籍都说这种是线程安全的,但后来被证明并非如此!
 * 我也是在面试网易时技术官指出的这个问题,并耐心讲解了,不管面试成败都很感谢!
 * <p>
 * 错误的地方在于,在一个线程初始化时,可能第二个线程拿到个null的instance.
 */
public class Singleton6 {

    /**
     * Field instance ... <br/>
     */
    private static Singleton6 instance;

    /**
     * Constructor Singleton6 ... <br/>
     * ------------------------------------
     */
    private Singleton6() {
    }

    /**
     * Method getInstance ... <br/>
     * .
     * @return Singleton6
     * .
     * @author ........Dong.Qirui
     */
    public static Singleton6 getInstance() {
        if (null == instance) {
            synchronized (Singleton6.class) {
                if (null == instance) {
                    instance = new Singleton6();
                }
            }
        }

        if (null == instance) {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }

        return instance;
    }
}

/*
 * designpattern.singleton.Singleton6@302702c3
 * designpattern.singleton.Singleton6@560b175a
 * designpattern.singleton.Singleton6@783e9d8b
 * designpattern.singleton.Singleton6@343afe5b
 * designpattern.singleton.Singleton6@302702c3
 * designpattern.singleton.Singleton6@302702c3
 * designpattern.singleton.Singleton6@302702c3
 * designpattern.singleton.Singleton6@302702c3
 * designpattern.singleton.Singleton6@302702c3
 * designpattern.singleton.Singleton6@302702c3
 * designpattern.singleton.Singleton6@302702c3
 * designpattern.singleton.Singleton6@302702c3
 * designpattern.singleton.Singleton6@302702c3
 */
/*
 * http://blog.csdn.net/u010031673/article/details/48541815
 * 下面我们直接进入主题，为什么使用双重检查锁，原因是因为在多线程初始化一个单例类时我们要确保得到一个对象，又想再确保一个对象时得到更高的效率，所以就有了双重检查锁，使用双重检查锁初始化对象的代码如下
 * [java] view plain copy
 * public class DoubleCheckedLocking {                 //1
 *   private static DoubleCheckedLocking instance;                   //2
 *
 *   public static DoubleCheckedLocking getInstance() {              //3
 *       if (instance == null) {                                     //4:第一次检查
 *           synchronized (DoubleCheckedLocking.class) {             //5:加锁
 *               if (instance == null)                               //6:第二次检查
 *                   instance = new DoubleCheckedLocking();          //7:问题的根源出在这里
 *           }                                                       //8
 *       }                                                           //9
 *       return instance;                                            //10
 *   }                                                               //11
 * }
 * 为什么这样是不行的，问题的根源出在第7行（instance = new DoubleCheckedLocking();），创建一个对象可以分解为如下三步：
 * [java] view plain copy
 * memory = allocate();   //1：分配对象的内存空间
 * ctorInstance(memory);  //2：初始化对象
 * instance = memory;     //3：设置instance指向刚分配的内存地址
 * 上面三行伪代码中的2和3之间，可能会被重排序，2和3之间重排序之后的执行时序如下：
 *
 * [java] view plain copy
 * memory = allocate();   //1：分配对象的内存空间
 * instance = memory;     //3：设置instance指向刚分配的内存地址
 *                      //注意，此时对象还没有被初始化！
 * ctorInstance(memory);  //2：初始化对象
 * 重排序不能影响单线程的执行语义，虽然这里2和3进行了重排序，但是只要保证2排在4前面执行，单线程内的执行结果不会被改变
 *
 * 时间      线程A     线程B
 * t1      A1：分配对象的内存空间
 * t2      A3：设置instance指向内存空间
 * t3              B1：判断instance是否为空
 * t4              B2：由于instance不为null，线程B将访问instance引用的对象（而这个时候对象还没有初始化）
 * t5      A2：初始化对象
 * t6      A4：访问instance引用的对象        线程B拿到一个未初始化的对象去操作，结果肯定就出错了
 *
 * 总结，到此为止我们只说明了为什么不可以用双重检查锁来初始化对象
 * THE  END！！！
 */
