package lk.SipsewanaInstitute.controller;

import com.jfoenix.controls.*;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;

/**
 * @author : Kavishka Prabath
 * @since : 0.1.0
 **/

public class StudentDetailsFormController {
    public JFXTextField txtSName1;
    public JFXTextField txtAddr1;
    public JFXTextField txtContact1;
    public JFXDatePicker dataPicker1;
    public JFXTextField txtSID1;
    public JFXButton btnSearchStudent;
    public JFXRadioButton rbtnMale1;
    public ToggleGroup groupGender1;
    public JFXButton btnSaveS;
    public JFXButton btnUpdateS;
    public JFXButton btnNewS;
    public JFXCheckBox checkBoxSAll;
    public JFXRadioButton rbtnFemale1;
    public TableView tblStudent;
    public TableColumn colSID;
    public TableColumn colSName;
    public TableColumn colAddress;
    public TableColumn colContact;
    public TableColumn colDOB;
    public TableColumn colGender;
    public TableColumn colDeleteS;

    public void btnSearchStudentOnAction(ActionEvent actionEvent) {
    }

    public void btnSaveSOnAction(ActionEvent actionEvent) {
    }

    public void btnUpdateSOnAction(ActionEvent actionEvent) {
    }

    public void btnNewSOnAction(ActionEvent actionEvent) {
    }

    public void checkBoxSAllOnAction(ActionEvent actionEvent) {
    }
}
