package lk.SipsewanaInstitute.dao;

import lk.SipsewanaInstitute.entity.SuperEntity;

import java.io.Serializable;
import java.util.List;

/**
 * @author : Kavishka Prabath
 * @since : 0.1.0
 **/

public interface CrudDAO<T extends SuperEntity, ID extends Serializable> extends SuperDAO {

    boolean save(T entity) throws Exception;

    boolean update(T entity) throws Exception;

    boolean delete(ID id) throws Exception;

    T get(ID id) throws Exception;

    List<T> getAll() throws Exception;

}
