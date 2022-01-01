package lk.SipsewanaInstitute.controller;

import com.jfoenix.controls.*;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;

/**
 * @author : Kavishka Prabath
 * @since : 0.1.0
 **/

public class RegistrationFormController {
    public JFXTextField txtSName;
    public JFXTextField txtAddr;
    public JFXTextField txtContact;
    public JFXDatePicker dataPicker;
    public JFXButton btnSearchStudentR;
    public JFXTextField txtSIDR;
    public JFXRadioButton rbtnMale;
    public ToggleGroup groupGender;
    public JFXRadioButton rbtnFemale;
    public JFXButton btnNewStudent;
    public JFXTextField txtDuration;
    public Label lblCID;
    public JFXComboBox cmbCourseR;
    public JFXRadioButton rbtnFullTime;
    public ToggleGroup group;
    public JFXRadioButton rbtnPartTime;
    public JFXTextField txtFee;
    public JFXButton btnAddtoCourse;
    public JFXButton btnRefresh;
    public Label lblCID11;
    public JFXTextField txtRegFee;
    public Text lblTot;
    public TableView tblCourse1;
    public TableColumn colCode1;
    public TableColumn colCName1;
    public TableColumn colType1;
    public TableColumn colDurationC1;
    public TableColumn colFeeC1;
    public TableColumn colDeleteC1;
    public JFXButton btnReg;

    public void btnSearchStudentROnAction(ActionEvent actionEvent) {
    }

    public void btnNewStudentOnAction(ActionEvent actionEvent) {
    }

    public void cmbCourseROnAction(ActionEvent actionEvent) {
    }

    public void btnAddtoCourseOnAction(ActionEvent actionEvent) {
    }

    public void btnRefreshOnAction(ActionEvent actionEvent) {
    }

    public void btnRegOnAction(ActionEvent actionEvent) {
    }
}
