package lk.SipsewanaInstitute.dao.custom;

import lk.SipsewanaInstitute.dao.SuperDAO;
import lk.SipsewanaInstitute.entity.Student;

import java.util.List;

/**
 * @author : Kavishka Prabath
 * @since : 0.1.0
 **/

public interface QueryDAO extends SuperDAO {
    List<Student> getCourseWiseStudent(String code) throws Exception;
}

