package sample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    private Stage primaryStage;
    private Scene loginScene;
    private Scene registerScene;
    private Button registerButton;
    private Button loginButton;
    private Button submitButton;
    private Button submit2Button;
    public TextField nameField;
    public TextField emailField;
    public PasswordField passwordField;

    @Override
    public void start(Stage primaryStage) throws Exception {
        //loading the source from the login fxml file
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        primaryStage.setTitle("Welcome to Essential Products E-Commerce!!");
        //Setting the stage style undecorated to use custom buttons
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(new Scene(root));
        //primaryStage.getIcons().add(new Image("Store/productPics/logo.jpg"));
        primaryStage.setResizable(false);
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}