package auction;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class AuctionControler implements Initializable {

    @FXML
    private ImageView picture;


    @FXML
    private Button button;

    @FXML
    private TextField textfeild;

    @FXML
    private Hyperlink seler;

    @FXML
    private Label currentBId;

    @FXML
    private Label reservePrice;

    @FXML
    private Label title;

    @FXML
    private Label creator;

    @FXML
    private Label year;

    @FXML
    private Label date;

    @FXML
    private Label material;

    @FXML
    private Label dim1;

    @FXML
    private Label dim2;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        
    }
}
