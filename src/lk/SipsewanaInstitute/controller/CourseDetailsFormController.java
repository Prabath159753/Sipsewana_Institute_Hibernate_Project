package lk.SipsewanaInstitute.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;

/**
 * @author : Kavishka Prabath
 * @since : 0.1.0
 **/

public class CourseDetailsFormController {
    public JFXButton btnNewCourse;
    public JFXComboBox cmbDurationType;
    public JFXTextField txtDuration;
    public Label lblCID;
    public ToggleGroup groupC;
    public JFXRadioButton rbtnPartTime;
    public JFXRadioButton rbtnFullTime;
    public JFXTextField txtFee;
    public JFXTextField txtCourseName;
    public JFXButton btnUpdate;
    public JFXButton btnSave;
    public TableView tblCourse;
    public TableColumn colCode;
    public TableColumn colCName;
    public TableColumn colType;
    public TableColumn colDuration;
    public TableColumn colFee;
    public TableColumn colDelete;

    public void btnNewCourseOnAction(ActionEvent actionEvent) {
    }

    public void cmbDurationTypeOnAction(ActionEvent actionEvent) {
    }

    public void btnSaveCOnAction(ActionEvent actionEvent) {
    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {
    }
}
