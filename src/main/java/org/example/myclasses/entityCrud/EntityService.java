package org.example.myclasses.entityCrud;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
public class EntityService<P extends Entity> implements ICrud {
    private List<P> entityList;
    public EntityService(List<P> entityList) {
        this.entityList = entityList;
    }
    @Override
    public P findById(int id) {
        for (P entity: entityList) {
            if (entity.id == id) {
                return entity;
            }
        }
        return null;
    }

    @Override
    public void create(int id, String name, Class pClass) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Object v  = pClass.getConstructor().newInstance();
        entityList.add((P) new Entity(id, name));
    }

    @Override
    public void updateById(int id, Entity entity) {
        for(int i = 0; i < entityList.size(); ++i) {
            if (entityList.get(i).id == id) {
                entityList.set(i, (P) entity);
                break;
            }
        }
    }

    @Override
    public P findByName(String name) {
        for (P entity: entityList) {
            if (entity.name.hashCode() == name.hashCode()) {
                if (entity.name.equals(name))
                    return entity;
            }
        }
        return null;
    }
    @Override
    public void deleteById(int id) {
        for(P entity: entityList) {
            if (entity.id == id) {
                entityList.remove(entity);
                break;
            }
        }
    }
    public List<P> getEntityList() {
        return entityList;
    }
    public void setEntityList(List<P> entityList) {
        this.entityList = entityList;
    }
}