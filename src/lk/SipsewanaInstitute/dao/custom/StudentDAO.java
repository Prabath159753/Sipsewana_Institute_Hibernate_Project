package lk.SipsewanaInstitute.dao.custom;

import lk.SipsewanaInstitute.dao.CrudDAO;
import lk.SipsewanaInstitute.entity.Student;

/**
 * @author : Kavishka Prabath
 * @since : 0.1.0
 **/

public interface StudentDAO extends CrudDAO<Student, String> {
    String getLastStudentID() throws Exception;
}
