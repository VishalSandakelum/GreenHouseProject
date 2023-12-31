import com.fazecast.jSerialComm.SerialPort;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Main extends Application {

    private static final int TIMEOUT_WRITE_BLOCKING = 2000;

    @Override
    public void start(Stage primaryStage) throws Exception {
        URL resource = getClass().getResource("login_form.fxml");
        //URL resource = getClass().getResource("vidioeview_form.fxml");
        Parent parent = FXMLLoader.load(resource);
        Scene scene = new Scene(parent);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Login Form");
        primaryStage.centerOnScreen();

        primaryStage.show();
///////////////////////////////////////
        SerialPort sp =  SerialPort.getCommPort("COM5");
        sp.setComPortParameters(9600,8,1,0);
        sp.setComPortTimeouts(TIMEOUT_WRITE_BLOCKING,0,0);

        if(sp.openPort()){
            System.out.println("open serial");
        }else{
            System.out.println("port not opened ");
            return;
        }
        InputStream inputStream = sp.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);


        BufferedReader reader = new BufferedReader(inputStreamReader);

       new Thread(() -> {
            while (true) {
                try {
                    System.out.println("Reading");
                    String line = reader.readLine();
                    System.out.println("Reading Compleat");
                    if (line != null) {
                        //String humidityValue = line.substring(line.indexOf(":") + 1).trim();
                        System.out.println(line);
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }).start();

        //sp.closePort();

    }


}
