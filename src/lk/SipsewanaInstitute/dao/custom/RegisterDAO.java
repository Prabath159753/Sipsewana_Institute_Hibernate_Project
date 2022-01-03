package lk.SipsewanaInstitute.dao.custom;

import lk.SipsewanaInstitute.dao.CrudDAO;
import lk.SipsewanaInstitute.entity.Registration;

/**
 * @author : Kavishka Prabath
 * @since : 0.1.0
 **/

public interface RegisterDAO  extends CrudDAO<Registration, String> {
    int getLastRegNo() throws Exception;
}
