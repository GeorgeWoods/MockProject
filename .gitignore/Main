import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.control.ListView;
import javafx.stage.WindowEvent;
import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.WindowEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.File;

public class Main
{
    private static TextField textFieldMessage1;
    private static TextField textFieldMessage2;
    private static TextField textFieldMessage3;
    private static TextField textFieldMessage4;
    private static TextField textFieldMessage5;
    private static TextField textFieldMessage6;
    private static TextField textFieldMessage7;
    private static TextField textFieldMessage8;

    public static void main(String args[])
    {
        launchFX();
    }

    private static void launchFX()
    {
        new JFXPanel();
        Platform.runLater(() -> initialiseGUI());
    }

    private static void initialiseGUI()
    {
        Stage stage = new Stage();
        stage.setTitle("Address Book");
        stage.setResizable(false);
        Pane rootPane = new Pane();
        stage.setScene(new Scene(rootPane));
        stage.setWidth(1024);
        stage.setHeight(768);
        //stage.setOnCloseRequest((WindowEvent we) -> terminate());
        stage.show();

        Image image = new Image(new File("harold.jpg").toURI().toString());
        ImageView iv1 = new ImageView();
        iv1.setImage(image);
        iv1.setLayoutX(20);
        iv1.setLayoutY(20);
        iv1.setFitWidth(300);
        iv1.setFitHeight(300);
        iv1.setPreserveRatio(true);
        rootPane.getChildren().add(iv1);

        textFieldMessage1 = new TextField();
        textFieldMessage1.setLayoutX(350);
        textFieldMessage1.setLayoutY(30);
        textFieldMessage1.setPrefWidth(400);
        textFieldMessage1.setPromptText("Title");

        textFieldMessage2 = new TextField();
        textFieldMessage2.setLayoutX(350);
        textFieldMessage2.setLayoutY(60);
        textFieldMessage2.setPrefWidth(400);
        textFieldMessage2.setPromptText("Forename");

        textFieldMessage3 = new TextField();
        textFieldMessage3.setLayoutX(350);
        textFieldMessage3.setLayoutY(90);
        textFieldMessage3.setPrefWidth(400);
        textFieldMessage3.setPromptText("Surname");
        
        textFieldMessage4 = new TextField();
        textFieldMessage4.setLayoutX(350);
        textFieldMessage4.setLayoutY(120);
        textFieldMessage4.setPrefWidth(400);
        textFieldMessage4.setPromptText("Date Of Birth");
        
        textFieldMessage5 = new TextField();
        textFieldMessage5.setLayoutX(350);
        textFieldMessage5.setLayoutY(150);
        textFieldMessage5.setPrefWidth(400);
        textFieldMessage5.setPromptText("Email");
        
        textFieldMessage6 = new TextField();
        textFieldMessage6.setLayoutX(350);
        textFieldMessage6.setLayoutY(180);
        textFieldMessage6.setPrefWidth(400);
        textFieldMessage6.setPromptText("Postcode");
        
        textFieldMessage7 = new TextField();
        textFieldMessage7.setLayoutX(350);
        textFieldMessage7.setLayoutY(210);
        textFieldMessage7.setPrefWidth(400);
        textFieldMessage7.setPromptText("Address");
        
        textFieldMessage8 = new TextField();
        textFieldMessage8.setLayoutX(350);
        textFieldMessage8.setLayoutY(240);
        textFieldMessage8.setPrefWidth(400);
        textFieldMessage8.setPromptText("Phone Number");

        rootPane.getChildren().add(textFieldMessage1);
        rootPane.getChildren().add(textFieldMessage2);
        rootPane.getChildren().add(textFieldMessage3);
        rootPane.getChildren().add(textFieldMessage4);
        rootPane.getChildren().add(textFieldMessage5);
        rootPane.getChildren().add(textFieldMessage6);
        rootPane.getChildren().add(textFieldMessage7);
        rootPane.getChildren().add(textFieldMessage8);

        Button btn = new Button();
        btn.setText("Enter");
        btn.setLayoutX(350);
        btn.setLayoutY(290);
        btn.setOnAction((ActionEvent ae) -> printMessage());
        rootPane.getChildren().add(btn);
        
        stage.setOnCloseRequest((WindowEvent we) -> displayCloseDialog(we));
    }

    private static void printMessage()
    {
        String message1 = textFieldMessage1.getText();
        String message2 = textFieldMessage2.getText();
        String message3 = textFieldMessage3.getText();
        String message4 = textFieldMessage3.getText();
        String message5 = textFieldMessage3.getText();
        String message6 = textFieldMessage3.getText();
        String message7 = textFieldMessage3.getText();
        String message8 = textFieldMessage3.getText();
        
        System.out.println();
        System.out.println("Title: " + message1);
        System.out.println("Name: " + message2 + message3);
        System.out.println("DOB: " + message4);
        System.out.println("Email: "+ message5);
        System.out.println("Postcode: " + message6);
        System.out.println("Address: " + message7);
        System.out.println("Phone Number: " + message8);
    }

    private static void displayCloseDialog(WindowEvent we) {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText("Are you sure you want to quit?");
        alert.setContentText("Are you sure you want to quit?");
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK)
        {
            terminate();
        }
        else
        {
            we.consume();
        }
    }

    private static void terminate()
    {
        System.out.println("Bye!");
        System.exit(0);
    }
}
