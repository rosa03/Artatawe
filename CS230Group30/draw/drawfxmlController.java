package draw;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;

import javax.imageio.ImageIO;
import java.io.File;


    public class drawfxmlController implements Initializable {

        @FXML
        private ColorPicker colourpicker;

        @FXML
        private TextField bsize;

        @FXML
        private Canvas canvas;

        @FXML
        private CheckBox eraser;

        private boolean toolSelected = false;


        GraphicsContext brushTool;


        @Override
        public void initialize(URL url, ResourceBundle rb) {
            brushTool = canvas.getGraphicsContext2D();
            canvas.setOnMouseDragged(e -> {
                double size = Double.parseDouble(bsize.getText());
                double x = e.getX() - size / 2;
                double y = e.getY() - size / 2;

                if (toolSelected && !bsize.getText().isEmpty()) {
                    brushTool.setFill(colourpicker.getValue());
                    brushTool.fillRoundRect(x, y, size, size, size, size);

                }

                if (eraser.isSelected()){
                    brushTool.clearRect(x, y, size, size);
                }
            });



        }

        @FXML
        public void toolSelected(ActionEvent e) {
            toolSelected = true;
        }


        public void onSave() {
            try {
                Image snapshot = canvas.snapshot(null, null);

                ImageIO.write(SwingFXUtils.fromFXImage(snapshot, null), "png", new File("C:\\Users\\Dylan\\Desktop\\JavaProgramsForUdemy\\Artatawe-Draw-Subsystem\\out\\production\\Artatawe-Draw-Subsystem\\draw\\ProfileImage.png"));
            } catch (Exception e)
            {
                System.out.println("Failed to save image" + e);
            }
        }

        public void onExit(){
            Platform.exit();
        }
    }