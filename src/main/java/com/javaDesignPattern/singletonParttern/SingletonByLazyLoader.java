package com.javaDesignPattern.singletonParttern;

/**
 * 单例模式：确保程序中的一个类最多只有一个实例
 * 实现思想：需要私有化构造方法，一个静态方法，一个静态变量
 * 运用场景：解决多线程变量，实例共享问题，数据库连接池，线程池等
 */

public class SingletonByLazyLoader {
    //懒汉式创建：只有调用的时候才创建实例
    private volatile static SingletonByLazyLoader uniqueInstance;
    //饥汉式创建：调用前就已经创建实例
//    private static SingletonByLazyLoader uniqueInstance2 = new SingletonByLazyLoader();

    //私有构造方法,类内才可以调用构造方法;
    private SingletonByLazyLoader(){}

    //实例化对象，并返回,不考虑性能则添加synchronized关键字
    public static synchronized SingletonByLazyLoader getInstance(){
        if (uniqueInstance==null){
            return uniqueInstance = new SingletonByLazyLoader();
        }
        return uniqueInstance;
        //考虑性能则使用双重检查加锁
//        if(uniqueInstance==null){
//            synchronized (SingletonByLazyLoader.class){
//                if (uniqueInstance==null){
//                    uniqueInstance = new SingletonByLazyLoader();
//                }
//            }
//        }
    }
}
