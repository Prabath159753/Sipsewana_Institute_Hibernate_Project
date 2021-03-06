package lk.SipsewanaInstitute.dao.custom.impl;

import lk.SipsewanaInstitute.dao.custom.CourseDAO;
import lk.SipsewanaInstitute.db.FactoryConfiguration;
import lk.SipsewanaInstitute.entity.Course;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.io.Serializable;
import java.util.List;

/**
 * @author : Kavishka Prabath
 * @since : 0.1.0
 **/

public class CourseDAOImpl implements CourseDAO {

    private Session session;

    public CourseDAOImpl() {
        this.session = FactoryConfiguration.getInstance().getSession();
    }

    @Override
    public boolean save(Course entity) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();
        Serializable save = session.save(entity);

        System.out.println("Ser + " + save);

        transaction.commit();
        session.close();
        return save != null;
    }

    @Override
    public boolean update(Course entity) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        try {
            session.update(entity);
            transaction.commit();
            session.close();
            return true;
        } catch (Exception exception) {
            transaction.rollback();
        }
        return false;
    }

    @Override
    public boolean delete(String id) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();
        try {
            session.delete(session.get(Course.class, id));
            transaction.commit();
            session.close();
            return true;
        } catch (Exception exception) {
            transaction.rollback();
        }
        return false;

    }

    @Override
    public Course get(String id) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();
        try {
            Course course = session.get(Course.class, id);
            transaction.commit();
            session.close();
            return course;
        } catch (Exception exception) {
            transaction.rollback();
        }
        return null;
    }

    @Override
    public List<Course> getAll() throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();
        try {

            Query query = session.createQuery("FROM Course");
            List list = query.list();
            transaction.commit();
            session.close();
            return list;
        } catch (Exception exception) {
            transaction.rollback();
        }
        return null;
    }

    @Override
    public void setSession(Session session) {

    }

    @Override
    public String getLastCourseID() throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();
        NativeQuery sqlQuery = session.createSQLQuery("select code from Course order by code desc limit 1");
        String id = (String) sqlQuery.uniqueResult();
        transaction.commit();
        session.close();
        return id;
    }

    @Override
    public Course getCourseN(String name) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();
        try {

            Query query = session.createQuery("from Course where courseName = ?1");
            query.setParameter(1, name);
            Course course = (Course) query.uniqueResult();
            transaction.commit();
            session.close();
            return course;
        } catch (Exception exception) {
            transaction.rollback();
        }
        return null;
    }
}
