package lk.SipsewanaInstitute.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXComboBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import lk.SipsewanaInstitute.bo.BOFactory;
import lk.SipsewanaInstitute.bo.custom.CourseBO;
import lk.SipsewanaInstitute.dao.DAOFactory;
import lk.SipsewanaInstitute.dao.custom.QueryDAO;
import lk.SipsewanaInstitute.dto.CourseDTO;
import lk.SipsewanaInstitute.dto.StudentDTO;
import lk.SipsewanaInstitute.entity.Student;

import java.util.List;

/**
 * @author : Kavishka Prabath
 * @since : 0.1.0
 **/

public class RegisteredStFormController {
    public TableView tblStudentCWise;
    public TableColumn colSID;
    public TableColumn colSName;
    public TableColumn colContact;
    public TableColumn colAddress;
    public TableColumn colDOB;
    public TableColumn colGender;
    public JFXComboBox cmbCourse;
    public JFXButton btnSearch;
    public JFXCheckBox checkBoxSAll;

    CourseBO courseBO = BOFactory.getInstance().getBO(BOFactory.BOType.COURSE);
    QueryDAO queryDAO = DAOFactory.getInstance().getDAO(DAOFactory.DAOType.QUERY);
    ObservableList<StudentDTO> listSC = FXCollections.observableArrayList();

    public void initialize() {
        loadAllCourseCmb();
        loadAllData();

        /* set course wise student detail tab table col */
        colSID.setCellValueFactory(new PropertyValueFactory<>("ID"));
        colSName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colContact.setCellValueFactory(new PropertyValueFactory<>("contactNo"));
        colDOB.setCellValueFactory(new PropertyValueFactory<>("dob"));
        colGender.setCellValueFactory(new PropertyValueFactory<>("gender"));
    }

    /* load all course name home */
    void loadAllCourseCmb() {
        try {
            List<CourseDTO> allCourse = courseBO.getAllCourse();
            for (CourseDTO dto : allCourse) {
                cmbCourse.getItems().addAll(dto.getCourseName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnSearchOnAction(ActionEvent actionEvent) {
    }

    public void cmbCourseOnAction(ActionEvent actionEvent) {
        cmbCSAction();
    }

    void cmbCSAction() {
        listSC.clear();
        tblStudentCWise.refresh();
        String name = String.valueOf(cmbCourse.getValue());
        try {
            List<Student> courseWiseStudent = queryDAO.getCourseWiseStudent(courseBO.getCourseN(name).getCode());
            for (Student dto : courseWiseStudent) {
                StudentDTO student = new StudentDTO(dto.getID(), dto.getName(), dto.getAddress(), dto.getContactNo(), dto.getDob(), dto.getGender());
                listSC.add(student);
            }
            tblStudentCWise.setItems(listSC);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void checkBoxSAllOnAction(ActionEvent actionEvent) {
        if (checkBoxSAll.isSelected()) {
            loadAllData();
        }
    }

    void loadAllData() {
        listSC.clear();
        tblStudentCWise.refresh();
        try {
            List<Student> courseWiseStudent = queryDAO.getAllCourseWiseStudent();
            for (Student dto : courseWiseStudent) {
                StudentDTO student = new StudentDTO(dto.getID(), dto.getName(), dto.getAddress(), dto.getContactNo(), dto.getDob(), dto.getGender());
                listSC.add(student);
            }
            tblStudentCWise.setItems(listSC);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
