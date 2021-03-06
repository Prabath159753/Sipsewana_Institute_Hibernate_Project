package lk.SipsewanaInstitute.bo;

import lk.SipsewanaInstitute.bo.custom.impl.CourseBOImpl;
import lk.SipsewanaInstitute.bo.custom.impl.RegisterBOImpl;
import lk.SipsewanaInstitute.bo.custom.impl.StudentBOImpl;

/**
 * @author : Kavishka Prabath
 * @since : 0.1.0
 **/

public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory() {
    }

    public static BOFactory getInstance() {
        return (boFactory == null) ? boFactory = new BOFactory() : boFactory;
    }

    public <T extends SuperBO> T getBO(BOType boType) {
        switch (boType) {
            case COURSE:
                return (T) new CourseBOImpl();
            case STUDENT:
                return (T) new StudentBOImpl();
            case REGISTER:
                return (T) new RegisterBOImpl();
            default:
                return null;
        }
    }

    public enum BOType{
        COURSE,STUDENT,REGISTER
    }
}