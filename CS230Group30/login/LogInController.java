package login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LogInController implements Initializable {

    @FXML
    private TextField username;

    @FXML
    private Button loginbutton;

    @FXML
    private ImageView picture;

    @FXML
    private Hyperlink newaccount;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //Uncomment these when below methods have been implemented
        //loginbutton.setOnAction(this::handleLoginButton);
        //newaccount.setOnAction(this::handleNewUser);

    }

    //Click login button: check if username exists in user collection
    //Write method in UserCollection to compare username to usernames in list
    public void handleLoginButton(ActionEvent event) {

    }

    //Click new user hyperlink
    //Needs to close current stage and open add User Form.fxml
    public void handleNewUser(ActionEvent event) {

    }

}
