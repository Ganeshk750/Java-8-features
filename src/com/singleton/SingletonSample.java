package com.singleton;


import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @created: 16/09/2021 - 10:25 AM
 * @author: Ganesh
 */


public class SingletonSample implements Serializable, Cloneable{

    private static SingletonSample singletonInst;

    private SingletonSample(){ }

    public static SingletonSample giviInstance(){
        if(singletonInst == null){
            singletonInst = new SingletonSample();
        }
        return singletonInst;
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException, CloneNotSupportedException {
        SingletonSample s1 = SingletonSample.giviInstance();
        SingletonSample s2 = SingletonSample.giviInstance();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        /* 1. Using Reflection */

        Class<?> sigletonClass = Class.forName("com.singleton.SingletonSample");
        Constructor<SingletonSample> constructor = ( Constructor<SingletonSample> )sigletonClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        /* Now We Create Instance of SingletonSample Class*/
        SingletonSample reflectionInstance = constructor.newInstance();
        SingletonSample reflectionInstance1 = constructor.newInstance();
        System.out.println("---------------USING REFLECTION-----------------");
        System.out.println(reflectionInstance.hashCode());
        System.out.println(reflectionInstance1.hashCode());

        /* 2. Using Serialization */
        System.out.println("----------------------USING SERIALIZATION--------------------------");
        /* Serializing  object */
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\seralization.ser"));
        objectOutputStream.writeObject(s1);
        objectOutputStream.close();

        /* DeSerializing Object*/
        ObjectInputStream objectInputStream = new ObjectInputStream((new FileInputStream("D:\\seralization.ser")));
        SingletonSample brokenInstance = (SingletonSample) objectInputStream.readObject();
        System.out.println(s1.hashCode());
        System.out.println(brokenInstance.hashCode());

        /* 3. Using Cloning */
        System.out.println("-------------------USING CLONING--------------------------");
        SingletonSample changeInstance = (SingletonSample) s1.clone();
        System.out.println(s1.hashCode());
        System.out.println(changeInstance.hashCode());




    }
}
