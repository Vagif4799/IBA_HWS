package homework11.dao;

import java.util.List;
import java.util.Optional;

public interface DAO<T> {

    List<T> getAll();

    Optional<T> get(long id);

    boolean deleteById(long id);

    boolean deletebyFamily(T t);

    void save(T t);

}
