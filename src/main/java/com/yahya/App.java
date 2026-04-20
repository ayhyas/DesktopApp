package com.yahya;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;



public class App extends Application
{
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));
        
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Mon App JavaFX");
        stage.setScene(scene);
        stage.show();
    }



    public static void main( String[] args )
    {
        launch();
    }
}
