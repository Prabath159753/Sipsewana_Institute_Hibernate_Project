package lk.SipsewanaInstitute.controller;

import com.jfoenix.controls.JFXButton;
import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;

/**
 * @author : Kavishka Prabath
 * @since : 0.1.0
 **/

public class DashboardFormController {
    public JFXButton btnExit;
    public JFXButton btnRegister;
    public JFXButton btnCourse;
    public JFXButton btnStudent;
    public AnchorPane DashboardContext;
    public JFXButton btnDashboard;
    public JFXButton btnHelp;
    public JFXButton btnSetting;
    public ImageView imgLogo;
    public JFXButton btnRegisteredSt;

    public void initialize() throws IOException {
        fadeTransition();
        rotateAnimation();
        lordUi();
    }

    void fadeTransition() {
        FadeTransition fadeIn = new FadeTransition(Duration.millis(2000), DashboardContext);
        fadeIn.setFromValue(0.0);
        fadeIn.setToValue(1.0);
        fadeIn.play();
    }

    void rotateAnimation() {
        RotateTransition transition = new RotateTransition();
        transition.setAxis(Rotate.Y_AXIS);
        transition.setByAngle(360);
        transition.setCycleCount(500);
        transition.setDuration(Duration.seconds(20));
        transition.setAutoReverse(true);
        transition.setNode(imgLogo);
        transition.play();
    }

    void lordUi() throws IOException {
        btnDashboard.setStyle("-fx-background-color: #2D3A6C ; -fx-text-fill: white; -fx-background-radius: 100 0 0 100");
        btnStudent.setStyle(null);
        btnCourse.setStyle(null);
        btnRegister.setStyle(null);
        btnHelp.setStyle(null);
        btnSetting.setStyle(null);
        btnRegisteredSt.setStyle(null);

        URL resource = getClass().getResource("../view/DashboardMainForm.fxml");
        Parent load = FXMLLoader.load(resource);
        DashboardContext.getChildren().clear();
        DashboardContext.getChildren().add(load);
    }

    public void goToDashboardOnAction(ActionEvent actionEvent) throws IOException {
        btnDashboard.setStyle("-fx-background-color: #2D3A6C ; -fx-text-fill: white; -fx-background-radius: 100 0 0 100");
        btnStudent.setStyle(null);
        btnCourse.setStyle(null);
        btnRegister.setStyle(null);
        btnHelp.setStyle(null);
        btnSetting.setStyle(null);
        btnRegisteredSt.setStyle(null);

        URL resource = getClass().getResource("../view/DashboardMainForm.fxml");
        Parent load = FXMLLoader.load(resource);
        DashboardContext.getChildren().clear();
        DashboardContext.getChildren().add(load);
    }

    public void goToSettingOnAction(ActionEvent actionEvent) {
        btnSetting.setStyle("-fx-background-color: #2D3A6C ; -fx-text-fill: white; -fx-background-radius: 100 0 0 100");
        btnStudent.setStyle(null);
        btnCourse.setStyle(null);
        btnRegister.setStyle(null);
        btnHelp.setStyle(null);
        btnDashboard.setStyle(null);
        btnRegisteredSt.setStyle(null);
    }

    public void goToHelpOnAction(ActionEvent actionEvent) {
        btnHelp.setStyle("-fx-background-color: #2D3A6C ; -fx-text-fill: white; -fx-background-radius: 100 0 0 100");
        btnStudent.setStyle(null);
        btnCourse.setStyle(null);
        btnRegister.setStyle(null);
        btnDashboard.setStyle(null);
        btnSetting.setStyle(null);
        btnRegisteredSt.setStyle(null);
    }

    public void goToStudentDetailOnAction(ActionEvent actionEvent) throws IOException {
        btnStudent.setStyle("-fx-background-color: #2D3A6C ; -fx-text-fill: white; -fx-background-radius: 100 0 0 100");
        btnDashboard.setStyle(null);
        btnCourse.setStyle(null);
        btnRegister.setStyle(null);
        btnHelp.setStyle(null);
        btnSetting.setStyle(null);
        btnRegisteredSt.setStyle(null);

        URL resource = getClass().getResource("../view/StudentDetailsForm.fxml");
        Parent load = FXMLLoader.load(resource);
        DashboardContext.getChildren().clear();
        DashboardContext.getChildren().add(load);
    }

    public void goToCourseOnAction(ActionEvent actionEvent) throws IOException {
        btnCourse.setStyle("-fx-background-color: #2D3A6C ; -fx-text-fill: white; -fx-background-radius: 100 0 0 100");
        btnStudent.setStyle(null);
        btnDashboard.setStyle(null);
        btnRegister.setStyle(null);
        btnHelp.setStyle(null);
        btnSetting.setStyle(null);
        btnRegisteredSt.setStyle(null);

        URL resource = getClass().getResource("../view/CourseDetailsForm.fxml");
        Parent load = FXMLLoader.load(resource);
        DashboardContext.getChildren().clear();
        DashboardContext.getChildren().add(load);
    }

    public void goToRegisterOnAction(ActionEvent actionEvent) throws IOException {
        btnRegister.setStyle("-fx-background-color: #2D3A6C ; -fx-text-fill: white; -fx-background-radius: 100 0 0 100");
        btnStudent.setStyle(null);
        btnCourse.setStyle(null);
        btnDashboard.setStyle(null);
        btnHelp.setStyle(null);
        btnSetting.setStyle(null);
        btnRegisteredSt.setStyle(null);

        URL resource = getClass().getResource("../view/RegistrationForm.fxml");
        Parent load = FXMLLoader.load(resource);
        DashboardContext.getChildren().clear();
        DashboardContext.getChildren().add(load);
    }

    public void goToRegisteredStOnAction(ActionEvent actionEvent) throws IOException {
        btnRegisteredSt.setStyle("-fx-background-color: #2D3A6C ; -fx-text-fill: white; -fx-background-radius: 100 0 0 100");
        btnStudent.setStyle(null);
        btnCourse.setStyle(null);
        btnDashboard.setStyle(null);
        btnHelp.setStyle(null);
        btnSetting.setStyle(null);
        btnRegister.setStyle(null);

        URL resource = getClass().getResource("../view/RegisteredStForm.fxml");
        Parent load = FXMLLoader.load(resource);
        DashboardContext.getChildren().clear();
        DashboardContext.getChildren().add(load);
    }

    public void goToExitOnAction(ActionEvent actionEvent) throws IOException {
        Stage logStage = (Stage) btnExit.getScene().getWindow();
        logStage.close();

        URL resource = this.getClass().getResource("../view/LoginForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setTitle("SIPSEWANA INSTITUTE | login Form");
        stage.centerOnScreen();
        stage.setScene(scene);
        stage.show();
    }
}
