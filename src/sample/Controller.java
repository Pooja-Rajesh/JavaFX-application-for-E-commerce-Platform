package sample;


import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;



// Java program to send email

public class Controller{

    @FXML
    private AnchorPane anchorPane;
    @FXML
    private TextField userName;
    @FXML
    private PasswordField pass;
    @FXML
    private Button registerButton;
    @FXML
    private Button loginButton;
    @FXML
    private TextField name;
    @FXML
    private TextField email;
    @FXML
    private PasswordField password;
    @FXML
    private PasswordField verifyPassword;
    @FXML
    private Button submitButton;
    @FXML
    private RadioButton rbReceiver;
    @FXML
    private Button store_btn;
    @FXML
    private Button history_btn;
    @FXML
    private Button account_btn,browse;
    @FXML
    private ImageView mainImg;
    @FXML
    private Image image;
    @FXML
    private Button enquiry_btn,Add_prod,add_product,addToCart;
    @FXML
    private Pane store_pane;
    @FXML
    private Pane history_pane;
    @FXML
    private Pane account_pane;
    @FXML
    private Pane enquiry_pane;
    @FXML private ChoiceBox<String> productNameChoice;
    @FXML RadioButton r,d,b,s;
    @FXML
    private ToggleGroup tg;
    @FXML private TextField Title, qty, price;
    @FXML private TextArea Desc, pickup,textArea;
    @FXML
    private TextArea cartText;
    @FXML private MenuButton Category;
    @FXML private MenuItem key;
    @FXML private AnchorPane ap2;
    @FXML private Button conf,paymentCnf;
    //@FXML private MenuButton account;
    @FXML private Label a,c,e,f,g,h,i,j,k,z;
    @FXML private Label tit,  tit2, tit3, tit4;
    @FXML


    private BooleanProperty gameRunning = new SimpleBooleanProperty(false);
    int x;
    int sel_role; //r - 0 d - 1 b - 2 s - 3
    private Product currProd;
    private Purchase currPur;
    private String str= "";
    private User account;

    public void handleConfirmButton(ActionEvent e){
        Alert errorAlert = new Alert(Alert.AlertType.ERROR);
        errorAlert.setHeaderText("Payment Confirmed! Your items will be delivered!");
        //errorAlert.setContentText("The size of First Name must be between 2 and 25 characters");

        errorAlert.showAndWait();
    SendEmail s =new SendEmail("poojarajesh013@gmail.com","pooja");
    }


    public void handleCart(){
        currPur = new Purchase(currProd.getProdTitle(),currProd.getQuantity(),currProd.getPrice(),currProd.getPrice()*currProd.getQuantity());
        //account.addToCart(currPur);
        //cartTable.getItems().add(currPur);
        str += "\n"+currProd.getProdTitle()+currProd.getQuantity()+currProd.getPrice();
        Alert errorAlert = new Alert(Alert.AlertType.ERROR);
        errorAlert.setHeaderText(str);
        //errorAlert.setContentText("The size of First Name must be between 2 and 25 characters");
        errorAlert.showAndWait();
        /*if(cartText.getText()!=null)
            cartText.setText(cartText.getText()+"\n"+currProd.getProdTitle()+currProd.getQuantity()+currProd.getPrice());
        else
            cartText.setText("\n"+currProd.getProdTitle()+currProd.getQuantity()+currProd.getPrice());*/
    }
    public void setimage(ActionEvent e) throws IOException {
        FileChooser fileChooser = new FileChooser();
        Stage stage = (Stage)anchorPane.getScene().getWindow();
        File file = fileChooser.showOpenDialog(stage);
        if(file!=null){
            image = new Image(file.toURI().toURL().toExternalForm());
            mainImg.setImage(image);
        }
    }
    public void display(){
        InsertInfo in = new InsertInfo();
        CommProd c = in.get_prod(a.getText());
        tit.setText("Title: "+ c.getProdTitle());
        tit2.setText("Description: " + c.getDescription());
        String s=Integer.toString(c.getQuantity());
        tit3.setText("Quantity: "+ s);
        s=Double.toString(c.getPrice());
        tit4.setText("Price: "+ s);
        mainImg.setImage( new Image("sample/Images/Screenshot (1299).png"));
        currProd = c;
    }
    public void display1(){
        InsertInfo in = new InsertInfo();
        CommProd c= in.get_prod(z.getText());
        tit.setText("Title: "+ c.getProdTitle());
        tit2.setText("Description: " + c.getDescription());
        String s=Integer.toString(c.getQuantity());
        tit3.setText("Quantity: "+ s);
        s=Double.toString(c.getPrice());
        tit4.setText("Price: "+ s);
        mainImg.setImage( new Image("sample/Images/Screenshot (1302).png"));
        currProd = c;
    }
    public void display2(){
        InsertInfo in = new InsertInfo();
        CommProd c= in.get_prod(j.getText());
        tit.setText("Title: "+ c.getProdTitle());
        tit2.setText("Description: " + c.getDescription());
        String s=Integer.toString(c.getQuantity());
        tit3.setText("Quantity: "+ s);
        s=Double.toString(c.getPrice());
        tit4.setText("Price: "+ s);
        mainImg.setImage( new Image("sample/Images/class-10th-ncert-books-science-maths-social-science-kratika-original-imafpbyjratx23sc.jpeg"));
        currProd = c;
    }

    public void display6(){
        InsertInfo in = new InsertInfo();
        CommProd c1= in.get_prod(c.getText());
        tit.setText("Title: "+ c1.getProdTitle());
        tit2.setText("Description: " + c1.getDescription());
        String s=Integer.toString(c1.getQuantity());
        tit3.setText("Quantity: "+ s);
        s=Double.toString(c1.getPrice());
        tit4.setText("Price: "+ s);
        mainImg.setImage( new Image("sample/Images/Screenshot (1286).png"));
        currProd = c1;

    }

    public void switchtor()
    {
        gameRunning.set(true);
        conf.visibleProperty().bind(gameRunning);
        x=0;
    }
    public void switchtod()
    {
        gameRunning.set(true);
        conf.visibleProperty().bind(gameRunning);
        x=1;
    }
    public void switchtob()
    {
        gameRunning.set(true);
        conf.visibleProperty().bind(gameRunning);
        x=2;
    }
    public void switchtos()
    {
        gameRunning.set(true);
        conf.visibleProperty().bind(gameRunning);
        x=3;
    }

    public void showPayment(ActionEvent event) throws IOException{
        changeScene(event, "Payment.fxml");
    }

    public void handleconf(ActionEvent event)throws IOException {

            switch (x) {
                case 0:changeScene(event, "Receiver_new.fxml");
                    break;
                case 1:
                    changeScene(event, "CustomerDashboard.fxml");
                    break;
                case 2:
                    changeScene(event, "Buyer_new.fxml");
                    break;
                case 3:
                    changeScene(event, "Seller.fxml");
                    break;
                default:
                    break;
            }
        }


    public void add(){
        InsertInfo in = new InsertInfo();
        in.connect();
        CommProd add_p = new CommProd(Title.getText(),Desc.getText(),Integer.parseInt(qty.getText()),Double.parseDouble(price.getText()),pickup.getText());
        in.insert_prod(add_p);
        Alert errorAlert = new Alert(Alert.AlertType.ERROR);
        errorAlert.setHeaderText("Product Added!");
        //errorAlert.setContentText("The size of First Name must be between 2 and 25 characters");
        errorAlert.showAndWait();   //showAlert(Alert.AlertType.ERROR, ap.getScene().getWindow(), "Form Error!", "Please en

    }
    public void add_ess(){
        InsertInfo in = new InsertInfo();
        in.connect();
        EssProd add_e = new EssProd(Title.getText(),Desc.getText(),Integer.parseInt(qty.getText()),"Books",pickup.getText());
        in.insert_prod(add_e);
        Alert errorAlert = new Alert(Alert.AlertType.ERROR);
        errorAlert.setHeaderText("Product Added!");
        //errorAlert.setContentText("The size of First Name must be between 2 and 25 characters");
        errorAlert.showAndWait();   //showAlert(Alert.AlertType.ERROR, ap.getScene().getWindow(), "Form Error!", "Please en

    }

    public void select_role(){
        RadioButton selectedRadioButton = (RadioButton) tg.getSelectedToggle();
        if (selectedRadioButton.getId().equals("r"))
                sel_role=0;
        else if (selectedRadioButton.getId().equals("d"))
            sel_role=1;
        else if (selectedRadioButton.getId().equals("b"))
            sel_role=2;
        else if (selectedRadioButton.getId().equals("s"))
            sel_role=3;
    }
    public void handleImg1(){
        mainImg.setImage( new Image("Store/productPics/1.jpg"));
        productNameChoice.setValue("Fishing rod");


    }
    public void handleImg2(){
        mainImg.setImage( new Image("Store/productPics/2.jpg"));
        productNameChoice.setValue("Fishing Reel");

    }
    public void handleImg3(){
        mainImg.setImage( new Image("Store/productPics/3.jpg"));
        productNameChoice.setValue("Fishing Hook");
    }
    public void handleImg4(){
        mainImg.setImage( new Image("Store/productPics/4.jpg"));
        productNameChoice.setValue("Fishing Line");

    }
    public void handleImg5(){
        mainImg.setImage( new Image("Store/productPics/5.jpg"));
        productNameChoice.setValue("Sinkers");
    }
    public void handleImg6(){
        mainImg.setImage( new Image("Store/productPics/6.jpg"));
        productNameChoice.setValue("Swivels");

    }
    public void handleImg7(){
        mainImg.setImage( new Image("Store/productPics/7.jpg"));


    }    public void handleImg8(){;
        mainImg.setImage( new Image("Store/productPics/8.jpg"));

    }    public void handleImg9(){
        //   mainImg.setImage( new Image("Store/productPics/9.jpg"));

    }
    public void handleTabButtons(ActionEvent event) {
        if (event.getSource() == store_btn) {
            store_pane.toFront();
        } else if (event.getSource() == history_btn) {
            history_pane.toFront();
        } else if (event.getSource() == account_btn) {
            account_pane.toFront();
        } else if (event.getSource() == enquiry_btn) {
            enquiry_pane.toFront();
        }
    }




    class PasswordError extends Exception{
        PasswordError(String msg){
            super(msg);
        }
    }

    class EmailError extends Exception{
        EmailError(String msg){
            super(msg);
        }
    }



    public void changeScene(ActionEvent event, String fxml) throws IOException {
        Parent dashboard = FXMLLoader.load(getClass().getResource(fxml));
        Scene dashboardScene = new Scene(dashboard);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(dashboardScene);
        window.show();
    }

    public void handleLoginButton(ActionEvent event) throws IOException{
        if (userName.getText().isEmpty()) {
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setHeaderText("Please Enter your Name");
            //errorAlert.setContentText("The size of First Name must be between 2 and 25 characters");
            errorAlert.showAndWait();   //showAlert(Alert.AlertType.ERROR, ap.getScene().getWindow(), "Form Error!", "Please enter your name");
            return;
        }
        try{
            String regex = "^(?=.*[0-9])"
                    + "(?=.*[a-z])(?=.*[A-Z])"
                    + "(?=.*[@#$%^&+=])"
                    + "(?=\\S+$).{8,20}$";
            if(!pass.getText().matches(regex)){
                throw new PasswordError("Please re-enter your password");
            }
            InsertInfo info = new InsertInfo();
            if(!info.authenticate(userName.getText(),pass.getText())){
                Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                errorAlert.setHeaderText("Incorrect Password");
                //errorAlert.setContentText("The size of First Name must be between 2 and 25 characters");
                errorAlert.showAndWait();   //showAlert(Alert.AlertType.ERROR, ap.getScene().getWindow(), "Form Error!", "Incorrect Password");
            }
            else {
                Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                errorAlert.setHeaderText("Login Successful! "+ "Welcome " + userName.getText());
                //errorAlert.setContentText("The size of First Name must be between 2 and 25 characters");
                errorAlert.showAndWait();    //showAlert(Alert.AlertType.CONFIRMATION, ap.getScene().getWindow(), "Login Successful!", "Welcome " + userName.getText());
            }

        }
        catch(PasswordError e){
            //showAlert(Alert.AlertType.ERROR, ap.getScene().getWindow(), "Form Error!", e.getMessage());
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setHeaderText(e.getMessage());
            //errorAlert.setContentText("The size of First Name must be between 2 and 25 characters");
            errorAlert.showAndWait();
            return;
        }
        switch (sel_role){
           case 0:
                changeScene(event,"Receiver_new.fxml");
                break;
            case 1:
                changeScene(event,"CustomerDashboard.fxml");
                break;
            case 2:
                changeScene(event,"Buyer_new.fxml");
                break;
            case 3:
                changeScene(event,"Seller.fxml");
                break;
            default: break;
        }
    }


    public void handleRegisterButton() throws IOException{
        Parent register = FXMLLoader.load(getClass().getResource("Register.fxml"));
        Scene registerScene = new Scene(register);
        Stage window = new Stage();
        window.setScene(registerScene);
        window.setTitle("Registration");
        window.getIcons().add(new Image("sample/Images/logo.png"));
        window.show();
    }

    public void handleAddButton() throws IOException{
        if(name.getText().isEmpty()) {
            //showAlert(Alert.AlertType.ERROR, ap.getScene().getWindow(), "Form Error!", "Please enter your name");
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setHeaderText("Please enter your name");
            //errorAlert.setContentText("The size of First Name must be between 2 and 25 characters");
            errorAlert.showAndWait();
            return;
        }

        try{
            String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
            if(!email.getText().matches(regex)){
                throw new EmailError("Please enter valid email-id");
            }
        }
        catch(EmailError e){
            //showAlert(Alert.AlertType.ERROR, ap.getScene().getWindow(), "Form Error!", e.getMessage());
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setHeaderText(e.getMessage());
            //errorAlert.setContentText("The size of First Name must be between 2 and 25 characters");
            errorAlert.showAndWait();
            return;
        }

        try{
            String regex = "^(?=.*[0-9])"
                    + "(?=.*[a-z])(?=.*[A-Z])"
                    + "(?=.*[@#$%^&+=])"
                    + "(?=\\S+$).{8,20}$";
            if(!password.getText().matches(regex)){
                throw new PasswordError("Please re-enter your password");
            }
        }
        catch(PasswordError e){
            //showAlert(Alert.AlertType.ERROR, ap.getScene().getWindow(), "Form Error!", e.getMessage());
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setHeaderText(e.getMessage());
            //errorAlert.setContentText("The size of First Name must be between 2 and 25 characters");
            errorAlert.showAndWait();
            return;
        }

        if(!verifyPassword.getText().equals(password.getText())) {
            //showAlert(Alert.AlertType.ERROR, ap.getScene().getWindow(), "Form Error!", "Password does not match!");
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setHeaderText("Password does not match!");
            //errorAlert.setContentText("The size of First Name must be between 2 and 25 characters");
            errorAlert.showAndWait();
            return;
        }
        InsertInfo in = new InsertInfo();
        in.connect();
        account = new User(name.getText(),email.getText(),password.getText());
        in.insert(account);

        //loginScene = createLoginScene(submitButton);
        Alert errorAlert = new Alert(Alert.AlertType.ERROR);
        errorAlert.setHeaderText("Registration Successful!");
        //errorAlert.setContentText("The size of First Name must be between 2 and 25 characters");
        errorAlert.showAndWait();
        //showAlert(Alert.AlertType.CONFIRMATION, ap.getScene().getWindow(), "Registration Successful!", "Welcome " + name.getText());
    }
}