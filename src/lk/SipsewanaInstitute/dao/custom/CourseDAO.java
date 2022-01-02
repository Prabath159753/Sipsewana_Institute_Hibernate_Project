package lk.SipsewanaInstitute.dao.custom;

import lk.SipsewanaInstitute.dao.CrudDAO;
import lk.SipsewanaInstitute.entity.Course;

/**
 * @author : Kavishka Prabath
 * @since : 0.1.0
 **/

public interface CourseDAO extends CrudDAO<Course, String> {

    String getLastCourseID() throws Exception;

    Course getCourseN(String name) throws Exception;

}
