package org.example.myclasses.entityCrud;

import java.lang.reflect.InvocationTargetException;

public interface ICrud<P extends Entity>  {
    P findById(int id);

    void create(int id, String name, Class pClass) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException;

    void updateById(int id, P entity);

    P findByName(String name);

    void deleteById(int id);
}
