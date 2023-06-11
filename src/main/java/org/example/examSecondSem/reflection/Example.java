package org.example.examSecondSem.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Example {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        // 3 способа получить class(ну чертёж ещё как угодно)
        SomeClass someClass = new SomeClass();
        Class<?> var1 = someClass.getClass();
        Class<?> var2 = SomeClass.class;
        Class<?> var3 = Class.forName("com.example.examSecondSem.reflection.SomeClass");

        // Создание объекта класса
        Constructor<?> constructor = var1.getConstructor();
        SomeClass someClass1 = (SomeClass) constructor.newInstance("Lol");

        // Получить метод
//        Method method = var1.getMethod();
    }
}

class SomeClass {
    private static transient int id;
    String somefield;

    public SomeClass() {
    }

    public SomeClass(String somefield) {
        this.somefield = somefield;
    }

    public void someMethod() {
        System.out.println("SomeMethod was called");
    }
}
