package lk.SipsewanaInstitute.dao;

import lk.SipsewanaInstitute.dao.custom.impl.CourseDAOImpl;

/**
 * @author : Kavishka Prabath
 * @since : 0.1.0
 **/

public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory(){
    }

    public static DAOFactory getInstance() {
        return (daoFactory == null) ? daoFactory = new DAOFactory(): daoFactory;
    }

    public <T extends SuperDAO> T getDAO(DAOType daoType){
        switch (daoType){
            case COURSE:
                return (T) new CourseDAOImpl();
            default:
                return null;
        }
    }

    public enum DAOType{
        COURSE,STUDENT
    }
}