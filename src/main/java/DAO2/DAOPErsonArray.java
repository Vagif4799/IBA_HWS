package DAO2;

import java.util.ArrayList;
import java.util.List;

public class DAOPErsonArray implements DAO {

    List<Person> storage = new ArrayList<>();

    @Override
    public void put(Object object) {
         storage.add((Person)object);
    }

    @Override
    public Object get(int id) {
        for(Person ps: storage) {
            if(id == ps.getId()) return ps;
        }
        return null;
    }

    @Override
    public void delete(int id) {
        for (Person ps: storage) {
            if(id == ps.getId()) storage.remove(ps);
        }
    }

    @Override
    public List getAll() {
        return storage;
    }
}

