import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class TemparetureFormController {
    public javafx.scene.control.Button homebtn;
    public javafx.scene.control.Button humiditybtn;
    public javafx.scene.control.Button watersuplybtn;
    public javafx.scene.control.Button sunlightbtn;
    public javafx.scene.control.Button settingbtn;
    public javafx.scene.control.Button employebtn;

    public void settingOnAction(ActionEvent actionEvent) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("humidity_settings_form.fxml"));
        Parent root1 = null;
        try {
            root1 = (Parent) fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }

    public void reportOnAction(ActionEvent actionEvent) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("temprature_status_form.fxml"));
        Parent root1 = null;
        try {
            root1 = (Parent) fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }

    public void homebtnOnAction(ActionEvent actionEvent) throws IOException {
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("third_form.fxml"));
        Stage window = (Stage)homebtn.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader));
    }

    public void humiditybtnOnAction(ActionEvent actionEvent) throws IOException {
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("humidty_form.fxml"));
        Stage window = (Stage)humiditybtn.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader));
    }

    public void watersuplybtnOnAction(ActionEvent actionEvent) throws IOException {
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("waterSpply_form.fxml"));
        Stage window = (Stage)watersuplybtn.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader));
    }

    public void sunlightbtnOnAction(ActionEvent actionEvent) throws IOException {
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("climatestatus_form.fxml"));
        Stage window = (Stage)sunlightbtn.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader));
    }

    public void settingsOnAction(ActionEvent actionEvent) throws IOException {
        /*Parent fxmlLoader = FXMLLoader.load(getClass().getResource("humidty_form.fxml"));
        Stage window = (Stage)settingbtn.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader));*/
    }

    public void employebtnOnAction(ActionEvent actionEvent) throws IOException {
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("logout_form.fxml"));
        Stage window = (Stage)employebtn.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader));
    }

}
