package lk.SipsewanaInstitute.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import java.util.regex.Pattern;

/**
 * @author : Kavishka Prabath
 * @since : 0.1.0
 **/

public class LoginFormController {
    public AnchorPane root;
    public JFXTextField txtName;
    public JFXPasswordField txtPassword;
    public JFXButton btnViewPW;
    public JFXTextField txtPasswordClone;
    public JFXButton btnInvisible;
    public JFXButton btnLogin;
    public ImageView imgLogo;

    public void initialize() {
        txtPasswordClone.setVisible(false);
        btnInvisible.setVisible(false);
    }

    public void btnViewPWOnAction(ActionEvent actionEvent) {
        txtPassword.setVisible(false);
        txtPasswordClone.setVisible(true);
        btnInvisible.setVisible(true);
        btnViewPW.setVisible(false);
        txtPasswordClone.setText(txtPassword.getText());
    }

    public void btnInvisibleOnAction(ActionEvent actionEvent) {
        txtPassword.setVisible(true);
        txtPasswordClone.setVisible(false);
        btnInvisible.setVisible(false);
        btnViewPW.setVisible(true);
        txtPassword.setText(txtPasswordClone.getText());
    }

    public void btnLoginOnAction(ActionEvent actionEvent) {
        String name = txtName.getText();
        if (Pattern.compile("^[A-z ]{1,}$").matcher(name).matches()) {
            String password = txtPassword.getText();
            if (name != null && name.equalsIgnoreCase("a")) {
                if (password != null && password.equalsIgnoreCase("a")) {
                    Stage s = (Stage) root.getScene().getWindow();
                    s.close();
                    loadUI();
                } else {
                    txtPassword.requestFocus();
                    txtPassword.setFocusColor(Paint.valueOf("red"));
                }
            } else {
                txtName.requestFocus();
                txtName.setFocusColor(Paint.valueOf("red"));
            }
        } else {
            txtName.requestFocus();
            txtName.setFocusColor(Paint.valueOf("red"));
        }
    }

    void loadUI() {
    }
}
